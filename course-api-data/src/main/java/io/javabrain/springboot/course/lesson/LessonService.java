package io.javabrain.springboot.course.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	
	@Autowired
	private LessonRepository lessonRepository;
	
	
	
	public List<Lesson> getAllLessons(String topicId)
	{
		List<Lesson> lessons = new ArrayList<>();
		//used standard function findAll to get topics 
		lessonRepository.findByCourseId(topicId).forEach(lessons::add);
		return lessons;
	}
	public Lesson getLesson(String id)
	{
		Optional<Lesson> lesson =(lessonRepository.findById(id));
		Lesson t = lesson.get();
		return t;
	}


	public void addLesson(Lesson lesson) {
		lessonRepository.save(lesson);
	}


	public void updateLesson(Lesson lesson) {

		lessonRepository.save(lesson);
	}


	public void deleteLesson(String id) {
		lessonRepository.deleteById(id);
		
	}
}
