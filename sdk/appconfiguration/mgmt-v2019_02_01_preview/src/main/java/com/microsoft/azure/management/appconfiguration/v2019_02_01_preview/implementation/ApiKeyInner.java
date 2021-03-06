/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2019_02_01_preview.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An API key used for authenticating with a configuration store endpoint.
 */
public class ApiKeyInner {
    /**
     * The key ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * A name for the key describing its usage.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The value of the key that is used for authentication purposes.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * A connection string that can be used by supporting clients for
     * authentication.
     */
    @JsonProperty(value = "connectionString", access = JsonProperty.Access.WRITE_ONLY)
    private String connectionString;

    /**
     * The last time any of the key's properties were modified.
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

    /**
     * Whether this key can only be used for read operations.
     */
    @JsonProperty(value = "readOnly", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean readOnly;

    /**
     * Get the key ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get a name for the key describing its usage.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value of the key that is used for authentication purposes.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Get a connection string that can be used by supporting clients for authentication.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Get the last time any of the key's properties were modified.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get whether this key can only be used for read operations.
     *
     * @return the readOnly value
     */
    public Boolean readOnly() {
        return this.readOnly;
    }

}
