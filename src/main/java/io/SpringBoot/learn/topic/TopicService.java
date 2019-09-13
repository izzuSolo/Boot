package io.SpringBoot.learn.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> arrayTopic = new ArrayList<>(Arrays.asList(new Topic("Spring", "Framework", "Description"), new Topic("Java", "1.8", "Core")));

    public List<Topic> getTopics(){
        return arrayTopic;
    }

    public Topic getTopic(String id){
        return arrayTopic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        arrayTopic.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for(int i = 0; i < arrayTopic.size(); i++){
            Topic t = arrayTopic.get(i);
            if(t.getId().equals(id)){
                arrayTopic.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        arrayTopic.removeIf(t -> t.getId().equals(id));
    }
}
