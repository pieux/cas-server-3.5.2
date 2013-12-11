/*
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.cas.support.oauth;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.scribe.up.provider.OAuthProvider;

/**
 * This class gathers all the OAuth providers and the login url of the CAS server.
 * 
 * @author Jerome Leleu
 * @since 3.5.1
 */
public final class OAuthConfiguration {
    
    @NotNull
    private List<OAuthProvider> providers;
    
    @NotNull
    private String loginUrl;
    
    public List<OAuthProvider> getProviders() {
        return this.providers;
    }
    
    public void setProviders(final List<OAuthProvider> providers) {
        this.providers = providers;
    }
    
    public String getLoginUrl() {
        return this.loginUrl;
    }
    
    public void setLoginUrl(final String loginUrl) {
        this.loginUrl = loginUrl;
    }
}
