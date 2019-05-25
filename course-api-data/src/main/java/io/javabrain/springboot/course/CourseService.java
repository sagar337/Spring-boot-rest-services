package io.javabrain.springboot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	
	public List<Course> getAllCourse(String topicId)
	{
		List<Course> courses = new ArrayList<>();
		//used standard function findAll to get topics 
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	
	public Course getCourse(String id)
	{
		Optional<Course> course =(courseRepository.findById(id));
		Course t = course.get();
		return t;
	}


	public void addCourse(Course course) {
		courseRepository.save(course);
	}


	public void updateCourse(Course course) {

		courseRepository.save(course);
	}


	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
		
	}
}
