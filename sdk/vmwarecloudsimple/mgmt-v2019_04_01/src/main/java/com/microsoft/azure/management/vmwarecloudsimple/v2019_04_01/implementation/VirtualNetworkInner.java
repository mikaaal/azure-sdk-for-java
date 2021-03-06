/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Virtual network model.
 */
@JsonFlatten
public class VirtualNetworkInner {
    /**
     * can be used in vm creation/deletion.
     */
    @JsonProperty(value = "assignable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean assignable;

    /**
     * virtual network id (privateCloudId:vsphereId).
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Azure region.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * {VirtualNetworkName}.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The Private Cloud id.
     */
    @JsonProperty(value = "properties.privateCloudId", access = JsonProperty.Access.WRITE_ONLY)
    private String privateCloudId;

    /**
     * {resourceProviderNamespace}/{resourceType}.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get can be used in vm creation/deletion.
     *
     * @return the assignable value
     */
    public Boolean assignable() {
        return this.assignable;
    }

    /**
     * Get virtual network id (privateCloudId:vsphereId).
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set virtual network id (privateCloudId:vsphereId).
     *
     * @param id the id value to set
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get azure region.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get {VirtualNetworkName}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the Private Cloud id.
     *
     * @return the privateCloudId value
     */
    public String privateCloudId() {
        return this.privateCloudId;
    }

    /**
     * Get {resourceProviderNamespace}/{resourceType}.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
