/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 *
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.security.dlic.rest.api.legacy;

import org.opensearch.security.dlic.rest.api.SecurityConfigApiTest;

import static org.opensearch.security.OpenSearchSecurityPlugin.LEGACY_OPENDISTRO_PREFIX;

public class LegacySecurityConfigApiTests extends SecurityConfigApiTest {
    @Override
    protected String getEndpointPrefix() {
        return LEGACY_OPENDISTRO_PREFIX;
    }
}
