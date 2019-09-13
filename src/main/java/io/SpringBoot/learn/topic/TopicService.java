package io.SpringBoot.learn.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> arrayTopic = Arrays.asList(new Topic("Spring", "Framework", "Description"), new Topic("Java", "1.8", "Core"));

    public List<Topic> getTopics(){
        return arrayTopic;
    }
}
