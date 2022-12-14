/*
 * Copyright 2012-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.test.autoconfigure.actuate.metrics;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.boot.test.autoconfigure.actuate.observability.AutoConfigureObservability;

/**
 * Annotation that can be applied to a test class to enable auto-configuration for metrics
 * exporters.
 *
 * @author Chris Bono
 * @since 2.4.0
 * @deprecated since 3.0.0 for removal in 3.2.0 in favor of
 * {@link AutoConfigureObservability @AutoConfigureObservability}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Deprecated(since = "3.0.0", forRemoval = true)
@AutoConfigureObservability(tracing = false)
public @interface AutoConfigureMetrics {

}
