/*-
 * ============LICENSE_START=======================================================
 * SDC
 * ================================================================================
 * Copyright (C) 2019 AT&T Intellectual Property. All rights reserved.
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

package org.openecomp.sdc.asdctool.migration.core.execution;

import org.openecomp.sdc.asdctool.migration.DummyMigrationFactory;
import org.openecomp.sdc.asdctool.migration.core.task.Migration;
import org.openecomp.sdc.asdctool.migration.core.task.MigrationResult;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class MigrationExecutorImplTest {

    @Test
    public void testExecuteMigration() {
        MigrationExecutionResult execute = new MigrationExecutorImpl().execute(DummyMigrationFactory.SUCCESSFUL_MIGRATION);
        assertMigrationTaskEntryByMigrationExecutionResult(execute, DummyMigrationFactory.SUCCESSFUL_MIGRATION);
    }

    private void assertMigrationTaskEntryByMigrationExecutionResult(MigrationExecutionResult executionResult, Migration migration) {
        MigrationResult migrationResult = migration.migrate();
        assertEquals(executionResult.getMsg(), migrationResult.getMsg());
        assertEquals(executionResult.getMigrationStatus(), migrationResult.getMigrationStatus());
        assertEquals(executionResult.getTaskName(), migration.getClass().getName());
        assertEquals(executionResult.getVersion(), migration.getVersion());
        assertEquals(executionResult.getDescription(), migration.description());
        assertNotNull(executionResult.getExecutionTime());
    }

}
