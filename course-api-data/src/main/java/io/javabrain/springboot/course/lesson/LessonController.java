package io.javabrain.springboot.course.lesson;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrain.springboot.course.Course;
import io.javabrain.springboot.topic.Topic;

@RestController
public class LessonController {

	@Autowired
	private LessonService LessonService;
	@RequestMapping("/topics/{topicid}/courses/{id}/lessons")
	public List<Lesson> getAllLessons(@PathVariable String id){
		return LessonService.getAllLessons(id);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{courseid}/lessons/{id}")
	public Lesson getLesson(@PathVariable String id)
	{
	return LessonService.getLesson(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses/{courseId}/lessons")
	public void addLesson(@RequestBody Lesson lesson,@PathVariable String topicId,@PathVariable String courseId)
	{
		System.out.println("add lesson called");
		lesson.setCourse(new Course(courseId,"","",topicId));
	LessonService.addLesson(lesson);	
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	public void updateLesson(@RequestBody Lesson lesson,@PathVariable String topicId,@PathVariable String id)
	{
		lesson.setCourse(new Course(id,"","",topicId));
		LessonService.updateLesson(lesson);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public void deleteLesson(@PathVariable String id)
	{
	 LessonService.deleteLesson(id);
	}
}
