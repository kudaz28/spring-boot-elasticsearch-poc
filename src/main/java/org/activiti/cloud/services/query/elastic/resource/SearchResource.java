package org.activiti.cloud.services.query.elastic.resource;


import org.activiti.cloud.services.query.elastic.model.Task;
import org.activiti.cloud.services.query.elastic.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/search")
public class SearchResource {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping(value = "/name/{text}")
    public List<Task> searchName(@PathVariable final String assignee) {
        return taskRepository.findTaskByAssignee(assignee);
    }

/*
    @GetMapping(value = "/salary/{salary}")
    public List<Users> searchSalary(@PathVariable final Long salary) {
        return usersRepository.findBySalary(salary);
    }


    @GetMapping(value = "/all")
    public List<Users> findAll() 
    {
        List<Users> usersList = new ArrayList<>();
        Iterable<Users> userses = usersRepository.findAll();
        userses.forEach(usersList::add);
        return usersList;
    }
*/

}
