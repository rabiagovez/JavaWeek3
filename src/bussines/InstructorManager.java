package bussines;

import java.util.ArrayList;
import java.util.List;

import core.BaseLogger;
import dataAcces.InstructorDao;
import entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private BaseLogger[] loggers;
	private List<String> instructorName = new ArrayList<>();

	public InstructorManager(InstructorDao instructorDao, BaseLogger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		if (instructorName.size() == 0) {
			instructorName.add(instructor.getEducatorName());
			instructorDao.add(instructor);
			for (BaseLogger logger : loggers) {
				logger.log(instructor.getEducatorName());
			}
		} else {
			for (String name : instructorName) {
				if (name.equals(instructor.getEducatorName())) {
					System.out.println("Bu eğitmen daha önce eklenmiş : " + instructor.getEducatorName());
					break;
				} else {
					instructorDao.add(instructor);
					for (BaseLogger logger : loggers) {
						logger.log(instructor.getEducatorName());
					}
				}
			}
		}
	}// add

}
