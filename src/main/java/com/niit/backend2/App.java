package com.niit.backend2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.ApplicationConfiguration;
import com.niit.dao.ProductDao;
import com.niit.dao.UsersDao;
import com.niit.model.Product;
import com.niit.model.Users;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
   //annotationConfigApplicationContext.refresh();
        UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("UserDaoImpl");
        Users user=new Users();
       user.setUsername("bujji");
        user.setPassword("bujji");
        userDao.registerUser(user);
       
        ProductDao p=(ProductDao)annotationConfigApplicationContext.getBean("ProductDaoImpl");
        Product product=new Product();
        product.setPname("bujji");
         product.setPrice(100.0f);
         p.addProduct(product);
        
    }
}
