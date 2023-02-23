package bussines;

import java.util.ArrayList;
import java.util.List;

import core.BaseLogger;
import dataAcces.CategoryDao;
import entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private BaseLogger[] loggers;
	private List<String> categoryNames = new ArrayList<>();
	
	public CategoryManager(CategoryDao categoryDao, BaseLogger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) {
		
		if(categoryNames.size() == 0){
            categoryNames.add(category.getCategoryName());
            categoryDao.add(category);
            for (BaseLogger logger:loggers) {
                logger.log(category.getCategoryName());
	        }
		} 
		
		else {
            for (String name : categoryNames) {
                if(name.equals(category.getCategoryName())){
                    System.out.println("Bu kategori daha önce eklenmiş : " + category.getCategoryName());
                    break;
                } else {
                    categoryDao.add(category);
                    for (BaseLogger logger:loggers) {
                        logger.log(category.getCategoryName());
                    }
                }
            }
        }
	}
	
	
}
