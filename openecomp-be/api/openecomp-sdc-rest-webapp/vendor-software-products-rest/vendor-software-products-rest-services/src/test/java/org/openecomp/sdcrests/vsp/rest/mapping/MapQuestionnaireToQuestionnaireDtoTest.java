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

package org.openecomp.sdcrests.vsp.rest.mapping;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import org.openecomp.sdc.vendorsoftwareproduct.dao.type.CompositionEntity;
import org.openecomp.sdcrests.vendorsoftwareproducts.types.QuestionnaireDto;

public class MapQuestionnaireToQuestionnaireDtoTest {

    @Test()
    public void testConversion() {

        final String id = "1ec317d3-58e7-47ef-9c9c-00afa0a5414d";
        final CompositionEntity source = Mockito.mock(CompositionEntity.class);
        Mockito.when(source.getId()).thenReturn(id);
        Mockito.when(source.getQuestionnaireData()).thenReturn("{}");

        final QuestionnaireDto target = new QuestionnaireDto();
        final MapQuestionnaireToQuestionnaireDto mapper = new MapQuestionnaireToQuestionnaireDto();
        mapper.doMapping(source, target);

        assertEquals(id, target.getId());
    }
}
