/*-
 * ============LICENSE_START=======================================================
 * SDC
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights reserved.
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

package org.openecomp.sdc.ci.tests.datatypes;

public enum MenuOptionsEnum {

    EDIT("Edit"), CHECK_IN("Check in"), CHECK_OUT("Check out"), VIEW("View"), SUBMIT_FOR_TEST("Submit For Test"), ACCEPT("Accept"), REJECT("Reject"), START_TEST("Start test"), DISTREBUTE("Distribute");

    private String value;

    public String getValue() {
        return value;
    }

    MenuOptionsEnum(String value) {
        this.value = value;
    }

}
