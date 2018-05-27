/*
 * Copyright © 2016-2018 European Support Limited
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

import React from 'react';
import { Portal, Notification } from 'sdc-ui/lib/react/';
import { connect } from 'react-redux';
import { removeNotification } from './NotificationsConstants.js';
import { CSSTransition, TransitionGroup } from 'react-transition-group';

export const mapStateToProps = ({ popupNotifications = [] }) => {
    return {
        notifications: popupNotifications
    };
};

const mapActionToProps = dispatch => {
    return {
        onClick: item => {
            dispatch(removeNotification(item));
        }
    };
};

class Notifications extends React.Component {
    render() {
        const { notifications, onClick } = this.props;

        return (
            <Portal>
                <div className="onboarding-notifications-container position-top-right">
                    <TransitionGroup>
                        {notifications.map(item => (
                            <CSSTransition
                                in={true}
                                timeout={500}
                                unmountOnExit
                                classNames="react-transition"
                                key={`notification-transition-${item.id}`}>
                                <Notification
                                    key={item.id}
                                    type={item.type}
                                    title={item.title}
                                    message={item.message}
                                    onClick={() => onClick(item)}
                                />
                            </CSSTransition>
                        ))}
                    </TransitionGroup>
                </div>
            </Portal>
        );
    }
}

export default connect(mapStateToProps, mapActionToProps, null)(Notifications);