/*
 * Copyright (c) 2019, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.rest.api.server.workflow.engine.v1.impl;

import org.wso2.carbon.identity.rest.api.server.workflow.engine.v1.WorkflowEnginesApiService;
import org.wso2.carbon.identity.rest.api.server.workflow.engine.v1.core.WorkFLowEngineService;

import javax.ws.rs.core.Response;

/**
 * API service implementation of workflow engine operations.
 */
public class WorkflowEnginesApiServiceImpl extends WorkflowEnginesApiService {

    private final WorkFLowEngineService workFLowEngineService;

    public WorkflowEnginesApiServiceImpl() {

        this.workFLowEngineService = new WorkFLowEngineService();
    }

    @Override
    public Response searchWorkFlowEngines() {

        return Response.ok().entity(workFLowEngineService.listWorkflowEngines()).build();
    }
}
