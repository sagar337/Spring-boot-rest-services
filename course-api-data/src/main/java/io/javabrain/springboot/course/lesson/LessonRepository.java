package io.javabrain.springboot.course.lesson;

import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface LessonRepository extends CrudRepository<Lesson, String>{

	public List<Lesson> findByCourseId(String Id);
	
}
