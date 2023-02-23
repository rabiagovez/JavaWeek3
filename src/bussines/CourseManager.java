package bussines;



import core.BaseLogger;
import dataAcces.CourseDao;
import entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private BaseLogger[] loggers;
	
	

	public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	
	public void add(Course course) throws Exception {
		if (course.getPrice()<0) {
			throw new Exception("The price of course cannot be less than 0");
		}
		else{
            courseDao.add(course);
            for (BaseLogger logger : loggers) {
                logger.log(course.getCourseName());
            }
	  }
		
	}
		
		
		
}
