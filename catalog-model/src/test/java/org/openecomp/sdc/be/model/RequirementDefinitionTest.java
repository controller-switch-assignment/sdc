/*-
 * ============LICENSE_START=======================================================
 * SDC
 * ================================================================================
 * Copyright (C) 2020, Nordix Foundation. All rights reserved.
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

package org.openecomp.sdc.be.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.openecomp.sdc.be.datatypes.elements.RequirementDataDefinition;

public class RequirementDefinitionTest {

    @Test
    public void testRequirementDefinition() {
        final RequirementDefinition testSubject = new RequirementDefinition();
        assertThat(testSubject).isNotNull().isInstanceOf(RequirementDefinition.class);
    }

    @Test
    public void testRequirementDefinition_clone() {
        final RequirementDefinition testSubject = new RequirementDefinition(new RequirementDefinition());
        assertThat(testSubject).isNotNull().isInstanceOf(RequirementDefinition.class);
    }

    @Test
    public void testRequirementDefinition_fromRequirementDataDefinition() {
        final RequirementDefinition testSubject = new RequirementDefinition(new RequirementDataDefinition());
        assertThat(testSubject).isNotNull().isInstanceOf(RequirementDefinition.class);
    }
}
