package org.rest.test.springg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service

public class Service {

    @Autowired
    private static TopicRepository topicRepository;

    @Autowired
    private Environment env;

    public void logActiveProfiles() {
        String[] activeProfiles = env.getActiveProfiles();
        for (String profile : activeProfiles) {
            System.out.println("Active profile: " + profile);
        }
    }

//    private static List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("a","b","c"),
//                    new Topic("d","e","f"),
//                    new Topic("g","h","i")
//            ));

    public static List<Topic> getAllTopics(){
        return topicRepository.findAll();
    }

    public Optional<Topic> getTopic(String id){
        return topicRepository.findById(id);
    }


    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        for(int i=0; i<topics.size(); i++){
//            Topic t = topics.get(i);
//            if(t.getid().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        Topic topic1 = topicRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Topic not found")); // THROW EXCEPTION IF NOT FOUND

        topic1.setId(topic.getid());
        topic1.setname(topic.getname());
        topic1.setDescription(topic.getDescription());
        topicRepository.save(topic1);
    }

    public Topic deleteTopic(String id) {
        topicRepository.deleteById(id);
        return null;
    }
}

