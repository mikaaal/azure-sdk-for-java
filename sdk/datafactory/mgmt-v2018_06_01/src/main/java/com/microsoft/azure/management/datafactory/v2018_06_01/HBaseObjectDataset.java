/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;

/**
 * HBase server dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = HBaseObjectDataset.class)
@JsonTypeName("HBaseObject")
@JsonFlatten
public class HBaseObjectDataset extends DatasetInner {
    /**
     * The table name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /**
     * Get the table name. Type: string (or Expression with resultType string).
     *
     * @return the tableName value
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the table name. Type: string (or Expression with resultType string).
     *
     * @param tableName the tableName value to set
     * @return the HBaseObjectDataset object itself.
     */
    public HBaseObjectDataset withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

}
