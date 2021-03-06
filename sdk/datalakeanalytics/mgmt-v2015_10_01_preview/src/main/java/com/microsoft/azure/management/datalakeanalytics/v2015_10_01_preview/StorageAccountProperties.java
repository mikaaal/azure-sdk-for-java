/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Storage account properties information.
 */
public class StorageAccountProperties {
    /**
     * the access key associated with this Azure Storage account that will be
     * used to connect to it.
     */
    @JsonProperty(value = "accessKey", required = true)
    private String accessKey;

    /**
     * the optional suffix for the Data Lake account.
     */
    @JsonProperty(value = "suffix")
    private String suffix;

    /**
     * Get the access key associated with this Azure Storage account that will be used to connect to it.
     *
     * @return the accessKey value
     */
    public String accessKey() {
        return this.accessKey;
    }

    /**
     * Set the access key associated with this Azure Storage account that will be used to connect to it.
     *
     * @param accessKey the accessKey value to set
     * @return the StorageAccountProperties object itself.
     */
    public StorageAccountProperties withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * Get the optional suffix for the Data Lake account.
     *
     * @return the suffix value
     */
    public String suffix() {
        return this.suffix;
    }

    /**
     * Set the optional suffix for the Data Lake account.
     *
     * @param suffix the suffix value to set
     * @return the StorageAccountProperties object itself.
     */
    public StorageAccountProperties withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

}
