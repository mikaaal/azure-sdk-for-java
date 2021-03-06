/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation.StreamingEndpointInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation.MediaManager;
import java.util.Map;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing StreamingEndpoint.
 */
public interface StreamingEndpoint extends HasInner<StreamingEndpointInner>, Indexable, Refreshable<StreamingEndpoint>, Updatable<StreamingEndpoint.Update>, HasManager<MediaManager> {
    /**
     * @return the accessControl value.
     */
    StreamingEndpointAccessControl accessControl();

    /**
     * @return the availabilitySetName value.
     */
    String availabilitySetName();

    /**
     * @return the cdnEnabled value.
     */
    Boolean cdnEnabled();

    /**
     * @return the cdnProfile value.
     */
    String cdnProfile();

    /**
     * @return the cdnProvider value.
     */
    String cdnProvider();

    /**
     * @return the created value.
     */
    DateTime created();

    /**
     * @return the crossSiteAccessPolicies value.
     */
    CrossSiteAccessPolicies crossSiteAccessPolicies();

    /**
     * @return the customHostNames value.
     */
    List<String> customHostNames();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the freeTrialEndTime value.
     */
    DateTime freeTrialEndTime();

    /**
     * @return the hostName value.
     */
    String hostName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModified value.
     */
    DateTime lastModified();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the maxCacheAge value.
     */
    Long maxCacheAge();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceState value.
     */
    StreamingEndpointResourceState resourceState();

    /**
     * @return the scaleUnits value.
     */
    int scaleUnits();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the StreamingEndpoint definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMediaservice, DefinitionStages.WithAutoStart, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StreamingEndpoint definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StreamingEndpoint definition.
         */
        interface Blank extends WithMediaservice {
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify Mediaservice.
         */
        interface WithMediaservice {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the Azure subscription
            * @param accountName The Media Services account name
            * @return the next definition stage
            */
            WithAutoStart withExistingMediaservice(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify AutoStart.
         */
        interface WithAutoStart {
           /**
            * Specifies autoStart.
            * @param autoStart The flag indicates if auto start the Live Event
            * @return the next definition stage
            */
            WithCreate withAutoStart(Boolean autoStart);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify AccessControl.
         */
        interface WithAccessControl {
            /**
             * Specifies accessControl.
             * @param accessControl The access control definition of the StreamingEndpoint
             * @return the next definition stage
             */
            WithCreate withAccessControl(StreamingEndpointAccessControl accessControl);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify AvailabilitySetName.
         */
        interface WithAvailabilitySetName {
            /**
             * Specifies availabilitySetName.
             * @param availabilitySetName AvailabilitySet name
             * @return the next definition stage
             */
            WithCreate withAvailabilitySetName(String availabilitySetName);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify CdnEnabled.
         */
        interface WithCdnEnabled {
            /**
             * Specifies cdnEnabled.
             * @param cdnEnabled The CDN enabled flag
             * @return the next definition stage
             */
            WithCreate withCdnEnabled(Boolean cdnEnabled);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify CdnProfile.
         */
        interface WithCdnProfile {
            /**
             * Specifies cdnProfile.
             * @param cdnProfile The CDN profile name
             * @return the next definition stage
             */
            WithCreate withCdnProfile(String cdnProfile);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify CdnProvider.
         */
        interface WithCdnProvider {
            /**
             * Specifies cdnProvider.
             * @param cdnProvider The CDN provider name
             * @return the next definition stage
             */
            WithCreate withCdnProvider(String cdnProvider);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify CrossSiteAccessPolicies.
         */
        interface WithCrossSiteAccessPolicies {
            /**
             * Specifies crossSiteAccessPolicies.
             * @param crossSiteAccessPolicies The StreamingEndpoint access policies
             * @return the next definition stage
             */
            WithCreate withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify CustomHostNames.
         */
        interface WithCustomHostNames {
            /**
             * Specifies customHostNames.
             * @param customHostNames The custom host names of the StreamingEndpoint
             * @return the next definition stage
             */
            WithCreate withCustomHostNames(List<String> customHostNames);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The StreamingEndpoint description
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The Azure Region of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify MaxCacheAge.
         */
        interface WithMaxCacheAge {
            /**
             * Specifies maxCacheAge.
             * @param maxCacheAge Max cache age
             * @return the next definition stage
             */
            WithCreate withMaxCacheAge(Long maxCacheAge);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify ScaleUnits.
         */
        interface WithScaleUnits {
            /**
             * Specifies scaleUnits.
             * @param scaleUnits The number of scale units
             * @return the next definition stage
             */
            WithCreate withScaleUnits(int scaleUnits);
        }

        /**
         * The stage of the streamingendpoint definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StreamingEndpoint>, DefinitionStages.WithAccessControl, DefinitionStages.WithAvailabilitySetName, DefinitionStages.WithCdnEnabled, DefinitionStages.WithCdnProfile, DefinitionStages.WithCdnProvider, DefinitionStages.WithCrossSiteAccessPolicies, DefinitionStages.WithCustomHostNames, DefinitionStages.WithDescription, DefinitionStages.WithLocation, DefinitionStages.WithMaxCacheAge, DefinitionStages.WithScaleUnits, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a StreamingEndpoint update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StreamingEndpoint>, UpdateStages.WithAccessControl, UpdateStages.WithAvailabilitySetName, UpdateStages.WithCdnEnabled, UpdateStages.WithCdnProfile, UpdateStages.WithCdnProvider, UpdateStages.WithCrossSiteAccessPolicies, UpdateStages.WithCustomHostNames, UpdateStages.WithDescription, UpdateStages.WithLocation, UpdateStages.WithMaxCacheAge, UpdateStages.WithScaleUnits, UpdateStages.WithTags {
    }

    /**
     * Grouping of StreamingEndpoint update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the streamingendpoint update allowing to specify AccessControl.
         */
        interface WithAccessControl {
            /**
             * Specifies accessControl.
             * @param accessControl The access control definition of the StreamingEndpoint
             * @return the next update stage
             */
            Update withAccessControl(StreamingEndpointAccessControl accessControl);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify AvailabilitySetName.
         */
        interface WithAvailabilitySetName {
            /**
             * Specifies availabilitySetName.
             * @param availabilitySetName AvailabilitySet name
             * @return the next update stage
             */
            Update withAvailabilitySetName(String availabilitySetName);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify CdnEnabled.
         */
        interface WithCdnEnabled {
            /**
             * Specifies cdnEnabled.
             * @param cdnEnabled The CDN enabled flag
             * @return the next update stage
             */
            Update withCdnEnabled(Boolean cdnEnabled);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify CdnProfile.
         */
        interface WithCdnProfile {
            /**
             * Specifies cdnProfile.
             * @param cdnProfile The CDN profile name
             * @return the next update stage
             */
            Update withCdnProfile(String cdnProfile);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify CdnProvider.
         */
        interface WithCdnProvider {
            /**
             * Specifies cdnProvider.
             * @param cdnProvider The CDN provider name
             * @return the next update stage
             */
            Update withCdnProvider(String cdnProvider);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify CrossSiteAccessPolicies.
         */
        interface WithCrossSiteAccessPolicies {
            /**
             * Specifies crossSiteAccessPolicies.
             * @param crossSiteAccessPolicies The StreamingEndpoint access policies
             * @return the next update stage
             */
            Update withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify CustomHostNames.
         */
        interface WithCustomHostNames {
            /**
             * Specifies customHostNames.
             * @param customHostNames The custom host names of the StreamingEndpoint
             * @return the next update stage
             */
            Update withCustomHostNames(List<String> customHostNames);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The StreamingEndpoint description
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The Azure Region of the resource
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify MaxCacheAge.
         */
        interface WithMaxCacheAge {
            /**
             * Specifies maxCacheAge.
             * @param maxCacheAge Max cache age
             * @return the next update stage
             */
            Update withMaxCacheAge(Long maxCacheAge);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify ScaleUnits.
         */
        interface WithScaleUnits {
            /**
             * Specifies scaleUnits.
             * @param scaleUnits The number of scale units
             * @return the next update stage
             */
            Update withScaleUnits(int scaleUnits);
        }

        /**
         * The stage of the streamingendpoint update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
