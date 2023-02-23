package dataAcces;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {

		System.out.println("Instructor added with Jdbc");
	}

}
