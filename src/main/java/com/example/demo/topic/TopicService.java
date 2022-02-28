package com.example.demo.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "description"),
            new Topic("java", "Core Java", "core java desciption"),
            new Topic("Javascript", "Javascript", "Javascript Description")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }

    public  Topic getTopic(String id){
        return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }

}
