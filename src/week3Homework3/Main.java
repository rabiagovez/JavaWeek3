package week3Homework3;

import bussines.CategoryManager;
import core.BaseLogger;
import core.DataBaseLogger;
import core.EmailLogger;
import dataAcces.HibernateCategoryDao;
import entities.Category;

public class Main {
	
	public static void main(String[] args) {
		
		BaseLogger[] loggers = {new DataBaseLogger(), new EmailLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        
        
        Category category2 = new Category(2,"Programlama");
        categoryManager.add(category2);

        
        
        
	
	}
}
