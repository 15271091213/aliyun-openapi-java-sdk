/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListJobInstanceWorkersRequest extends RpcAcsRequest<ListJobInstanceWorkersResponse> {
	
	public ListJobInstanceWorkersRequest() {
		super("Emr", "2016-04-08", "ListJobInstanceWorkers");
	}

	private Long resourceOwnerId;

	private String jobInstanceId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getJobInstanceId() {
		return this.jobInstanceId;
	}

	public void setJobInstanceId(String jobInstanceId) {
		this.jobInstanceId = jobInstanceId;
		putQueryParameter("JobInstanceId", jobInstanceId);
	}

	@Override
	public Class<ListJobInstanceWorkersResponse> getResponseClass() {
		return ListJobInstanceWorkersResponse.class;
	}

}
