package io.SpringBoot.learn.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        List<Topic> arrayTopic =Arrays.asList(new Topic("Spring", "Framework", "Description"), new Topic("Java", "1.8", "Core"));
        return arrayTopic;
    }
}
