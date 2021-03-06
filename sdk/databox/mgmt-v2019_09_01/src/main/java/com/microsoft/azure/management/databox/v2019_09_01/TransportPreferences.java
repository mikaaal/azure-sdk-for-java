/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Preferences related to the shipment logistics of the sku.
 */
public class TransportPreferences {
    /**
     * Indicates Shipment Logistics type that the customer preferred. Possible
     * values include: 'CustomerManaged', 'MicrosoftManaged'.
     */
    @JsonProperty(value = "preferredShipmentType", required = true)
    private TransportShipmentTypes preferredShipmentType;

    /**
     * Get indicates Shipment Logistics type that the customer preferred. Possible values include: 'CustomerManaged', 'MicrosoftManaged'.
     *
     * @return the preferredShipmentType value
     */
    public TransportShipmentTypes preferredShipmentType() {
        return this.preferredShipmentType;
    }

    /**
     * Set indicates Shipment Logistics type that the customer preferred. Possible values include: 'CustomerManaged', 'MicrosoftManaged'.
     *
     * @param preferredShipmentType the preferredShipmentType value to set
     * @return the TransportPreferences object itself.
     */
    public TransportPreferences withPreferredShipmentType(TransportShipmentTypes preferredShipmentType) {
        this.preferredShipmentType = preferredShipmentType;
        return this;
    }

}
