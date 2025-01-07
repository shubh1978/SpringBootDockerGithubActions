package org.rest.test.springg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private Service Service;

    @GetMapping("/greet")
    public List<Topic> greet(){
        return Service.getAllTopics();
    }
    @RequestMapping("/greet/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return Service.getTopic(id);
    }

    @PostMapping("/greet") // to request mapping
    public void addGreet(@RequestBody Topic topic) { // request
        Service.addTopic(topic); // to add topic

    }

    @PutMapping("/greet/{id}")
    public void updateGreet(@RequestBody Topic topic, @PathVariable String id) {
        Service.updateTopic(id,topic);

    }
    @DeleteMapping("/greet/{id}")
    public void deletetTopic(@PathVariable String id){
        Service.deleteTopic(id);
    }

}
