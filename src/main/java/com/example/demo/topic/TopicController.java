package com.example.demo.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("spring","Spring Framework","description"),
                new Topic("java","Core Java","core java desciption"),
                new Topic("Javascript","Javascript","Javascript Description")
        );
    }
}
