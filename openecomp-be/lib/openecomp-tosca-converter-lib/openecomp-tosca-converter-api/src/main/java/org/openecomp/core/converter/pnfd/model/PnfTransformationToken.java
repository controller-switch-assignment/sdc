/*
 * ============LICENSE_START=======================================================
 *  Copyright (C) 2019 Nordix Foundation
 *  ================================================================================
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  SPDX-License-Identifier: Apache-2.0
 *  ============LICENSE_END=========================================================
 */

package org.openecomp.core.converter.pnfd.model;

/**
 * Represents a token from the transformation descriptor
 */
public enum PnfTransformationToken {
    CONVERSIONS("conversions"),
    FROM("from"),
    LIST("list"),
    QUERY("query"),
    TO("to"),
    STRATEGY("strategy"),
    TO_NAME("to-name"),
    TO_VALUE("to-value"),
    TRANSFORMATION_FOR("transformation-for"),
    NAME("name"),
    DESCRIPTION("description"),
    GET_INPUT("get_input"),
    TO_GET_INPUT("to-get-input"),
    PROPERTIES("properties"),
    NODE_TYPE("node_types");

    private final String name;

    PnfTransformationToken(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
