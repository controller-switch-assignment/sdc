/*-
 * ============LICENSE_START=======================================================
 * SDC
 * ================================================================================
 * Copyright (C) 2017 Huawei Intellectual Property. All rights reserved.
 * ================================================================================
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
 * ============LICENSE_END=========================================================
 */

import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name: 'propertiesOrderBy' })
export class PropertiesOrderByPipe implements PipeTransform {
    transform(records: Array<any>, args?: any): any {
        if (!records || !args.path) return records;
        let len = args.path.length;
        return records.sort((itemIdx1, itemIdx2) => {
            var i = 0;
            while (i < len) { itemIdx1 = itemIdx1[args.path[i]]; itemIdx2 = itemIdx2[args.path[i]]; i++; }
            // Order * (-1): We change our order
            return itemIdx1 + "" > itemIdx2 + "" ? args.direction : args.direction * (- 1);
        })
    };
}
