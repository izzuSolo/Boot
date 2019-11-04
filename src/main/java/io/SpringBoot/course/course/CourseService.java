package io.SpringBoot.course.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository corseRepository;

    public List<Course> getCourses(String topicId){
        List <Course> courses = new ArrayList<>();
        corseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id)
    {
        return corseRepository.findById(id).orElse(new Course());
    }

    public void addCourse(Course course) {
        corseRepository.save(course);
    }

    public void updateCourse(Course course) {
        corseRepository.save(course);
    }

    public void deleteCourse(String id) {
        corseRepository.deleteById(id);
    }
}
