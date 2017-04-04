/* -*- mode: Java; c-basic-offset: 2; indent-tabs-mode: nil; coding: utf-8-unix -*-
 *
 * Copyright © 2017 MicroBean.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

/**
 * Provides classes and interfaces for integrating various
 * Grizzly-related classes into CDI.
 *
 * <p>This package contains non-{@code public} CDI beans that
 * {@linkplain javax.enterprise.inject.Produces produce} instances of
 * the following classes:</p>
 *
 * <ul>
 *
 * <li>{@link org.glassfish.grizzly.ssl.SSLContextConfigurator}</li>
 *
 * <li>{@link org.glassfish.grizzly.ssl.SSLEngineConfigurator}</li>
 *
 * </ul>
 *
 * @author <a href="https://about.me/lairdnelson"
 * target="_parent">Laird Nelson</a>
 */
package org.microbean.grizzly.http.server.cdi;
