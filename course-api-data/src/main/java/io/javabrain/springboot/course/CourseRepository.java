package io.javabrain.springboot.course;

import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface CourseRepository extends CrudRepository<Course, String>{

	public List<Course> findByTopicId(String Id);
	
}
