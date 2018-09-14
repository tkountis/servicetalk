/*
 * Copyright © 2018 Apple Inc. and the ServiceTalk project authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.servicetalk.http.api;

import io.servicetalk.serialization.api.TypeHolder;

/**
 * A provider for {@link HttpSerializer}s.
 */
public interface HttpSerializerProvider {

    // TODO(scott): add "int bytesEstimate" and "IntUnaryOperator bytesEstimator"?

    /**
     * Get a {@link HttpSerializer} for a {@link Class} of type {@link T}.
     * @param type The {@link Class} type that the return value will serialize.
     * @param <T> The type of object to serialize.
     * @return a {@link HttpSerializer} for a {@link Class} of type {@link T}.
     */
    <T> HttpSerializer<T> getSerializer(Class<T> type);

    /**
     * Get a {@link HttpSerializer} for a {@link TypeHolder} of type {@link T}.
     * @param type The {@link TypeHolder} type that the return value will serialize.
     * @param <T> The type of object to serialize.
     * @return a {@link HttpSerializer} for a {@link TypeHolder} of type {@link T}.
     */
    <T> HttpSerializer<T> getSerializer(TypeHolder<T> type);
}