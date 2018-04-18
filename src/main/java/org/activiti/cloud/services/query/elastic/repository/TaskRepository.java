/*
 * Copyright 2017 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.cloud.services.query.elastic.repository;

import java.util.List;

import org.activiti.cloud.services.query.elastic.model.ProcessInstance;
import org.activiti.cloud.services.query.elastic.model.Task;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(exported = false)
public interface TaskRepository extends ElasticsearchRepository<Task, Long>
{
	@RestResource(exported = false)
    Long findTaskById();
	
	@RestResource(exported = false)
	List<Task> findTaskByAssignee();
	
	@RestResource(exported = false)
	List<Task> findTaskByAssignee(String assignee);
	
	@RestResource(exported = false)
	List<Task> findTaskByName();
	 
	@RestResource(exported = false)
	List<Task> findTaskByDescription();
	
	@RestResource(exported = false)
    List<Task> findTaskByCreateTime();
	
	@RestResource(exported = false)
    List<Task> findTaskByDueDate();
	
	@RestResource(exported = false)
    List<Task> findTaskByPriority();
	
	@RestResource(exported = false)
    List<Task> findTaskByCategory();
	
	@RestResource(exported = false)
    List<ProcessInstance> findTaskByProcessDefinitionId();
	
	@RestResource(exported = false)
    List<ProcessInstance> findTaskByProcessInstanceId();
	
	@RestResource(exported = false)
    List<Task> findTaskByStatus();
	
    @RestResource(exported = false)
    List<Task> findTaskByLastModified();
  
}