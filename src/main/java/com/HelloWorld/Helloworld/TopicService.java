package com.HelloWorld.Helloworld;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topics> topics = new ArrayList<>(Arrays.asList(
            new Topics("0", "Spring Framework", "Learn about the Spring Framework" ),
            new Topics("1", "Java", "Learn about Java" ),
            new Topics("2", "Javascript", "Learn about Javascript" )
    ));

    public List<Topics> getAllTopics() {
        return topics;
}

    public Topics getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topics topic){
        topics.add(topic);
    }
}
