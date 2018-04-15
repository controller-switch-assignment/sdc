/*
 * Copyright © 2016-2017 European Support Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import { createStore, applyMiddleware, compose } from 'redux';
import Reducers from './Reducers.js';
import filterUpdater from 'sdc-app/onboarding/onboard/filter/FilterMiddleware.js';

const thunk = store => next => action =>
    typeof action === 'function'
        ? action(store.dispatch, store.getState)
        : next(action);

const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;

export const storeCreator = initialState =>
    createStore(
        Reducers,
        initialState,
        composeEnhancers(applyMiddleware(thunk, filterUpdater))
    );

const store = storeCreator();

if (module.hot) {
    module.hot.accept('./Reducers.js', () =>
        store.replaceReducer(require('./Reducers.js').default)
    );
}

export default store;
