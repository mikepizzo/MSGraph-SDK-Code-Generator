// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph2.callrecords.models.extensions.SingletonEntity1;
import com.microsoft.graph.requests.extensions.ITestTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.TestTypeRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Singleton Entity1Request Builder.
 */
public class SingletonEntity1RequestBuilder extends BaseRequestBuilder implements ISingletonEntity1RequestBuilder {

    /**
     * The request builder for the SingletonEntity1
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SingletonEntity1RequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ISingletonEntity1Request instance
     */
    public ISingletonEntity1Request buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISingletonEntity1Request instance
     */
    public ISingletonEntity1Request buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph2.callrecords.requests.extensions.SingletonEntity1Request(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for TestType
     *
     * @return the ITestTypeRequestBuilder instance
     */
    public ITestTypeRequestBuilder testSingleNav() {
        return new TestTypeRequestBuilder(getRequestUrlWithAdditionalSegment("testSingleNav"), getClient(), null);
    }
}
