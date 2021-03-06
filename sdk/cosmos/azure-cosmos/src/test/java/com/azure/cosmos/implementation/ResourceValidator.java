// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation;

import com.azure.cosmos.models.ModelBridgeInternal;
import com.azure.cosmos.models.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public interface ResourceValidator<T extends Resource> {
    
    void validate(T v);

    class Builder<T extends Resource> {
        private List<ResourceValidator<? extends Resource>> validators = new ArrayList<>();

        public ResourceValidator<T> build() {
            return new ResourceValidator<T>() {

                @SuppressWarnings({ "rawtypes", "unchecked" })
                @Override
                public void validate(T v) {
                    for (ResourceValidator validator : validators) {
                        validator.validate(v);
                    }
                }
            };
        }
        
        public Builder<T> areEqual(T expectedValue) {
            validators.add(new ResourceValidator<T>() {
                @Override
                public void validate(T v) {
                    
                    assertThat(ModelBridgeInternal.getJsonSerializableMap(v).keySet())
                        .describedAs("number of fields")
                        .hasSize(ModelBridgeInternal.getJsonSerializableMap(expectedValue).keySet().size());
                    ModelBridgeInternal.getJsonSerializableMap(expectedValue).keySet();
                    for(String key: ModelBridgeInternal.getJsonSerializableMap(expectedValue).keySet()) {
                        assertThat(expectedValue.get(key))
                        .describedAs("value for " + key)
                        .isEqualTo(expectedValue.get(key));
                    }
                }
            });
            return this;
        }
        
    }
}
