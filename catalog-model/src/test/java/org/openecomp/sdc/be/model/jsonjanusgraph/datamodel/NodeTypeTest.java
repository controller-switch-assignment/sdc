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

package org.openecomp.sdc.be.model.jsonjanusgraph.datamodel;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openecomp.sdc.be.datatypes.elements.InterfaceDataDefinition;
import org.openecomp.sdc.be.datatypes.elements.ListCapabilityDataDefinition;
import org.openecomp.sdc.be.datatypes.elements.ListRequirementDataDefinition;
import org.openecomp.sdc.be.datatypes.elements.MapPropertiesDataDefinition;
import org.openecomp.sdc.be.datatypes.elements.PropertyDataDefinition;


public class NodeTypeTest {

	private NodeType createTestSubject() {
		return new NodeType();
	}

	
	@Test
	public void testGetDerivedList() throws Exception {
		NodeType testSubject;
		List<String> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getDerivedList();
	}

	
	@Test
	public void testSetDerivedList() throws Exception {
		NodeType testSubject;
		List<String> derivedList = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setDerivedList(derivedList);
	}

	
	@Test
	public void testGetDerivedFrom() throws Exception {
		NodeType testSubject;
		List<String> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getDerivedFrom();
	}

	
	@Test
	public void testSetDerivedFrom() throws Exception {
		NodeType testSubject;
		List<String> derivedFrom = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setDerivedFrom(derivedFrom);
	}

	
	@Test
	public void testGetAttributes() throws Exception {
		NodeType testSubject;
		Map<String, PropertyDataDefinition> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAttributes();
	}

	
	@Test
	public void testSetAttributes() throws Exception {
		NodeType testSubject;
		Map<String, PropertyDataDefinition> attributes = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setAttributes(attributes);
	}

	
	@Test
	public void testGetCapabilties() throws Exception {
		NodeType testSubject;
		Map<String, ListCapabilityDataDefinition> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getCapabilities();
	}

	
	@Test
	public void testSetCapabilties() throws Exception {
		NodeType testSubject;
		Map<String, ListCapabilityDataDefinition> capabilties = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setCapabilities(capabilties);
	}

	
	@Test
	public void testGetRequirements() throws Exception {
		NodeType testSubject;
		Map<String, ListRequirementDataDefinition> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getRequirements();
	}

	
	@Test
	public void testSetRequirements() throws Exception {
		NodeType testSubject;
		Map<String, ListRequirementDataDefinition> requirements = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setRequirements(requirements);
	}

	
	@Test
	public void testGetCapabiltiesProperties() throws Exception {
		NodeType testSubject;
		Map<String, MapPropertiesDataDefinition> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getCapabilitiesProperties();
	}

	
	@Test
	public void testSetCapabiltiesProperties() throws Exception {
		NodeType testSubject;
		Map<String, MapPropertiesDataDefinition> capabiltiesProperties = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setCapabilitiesProperties(capabiltiesProperties);
	}

	
	@Test
	public void testGetInterfaceArtifacts() throws Exception {
		NodeType testSubject;
		Map<String, InterfaceDataDefinition> result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getInterfaceArtifacts();
	}

	
	@Test
	public void testSetInterfaceArtifacts() throws Exception {
		NodeType testSubject;
		Map<String, InterfaceDataDefinition> interfaceArtifacts = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setInterfaceArtifacts(interfaceArtifacts);
	}
}
