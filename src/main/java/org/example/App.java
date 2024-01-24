package org.example;

import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentDao studentDao = context.getBean("student", StudentDao.class);

        Student student = new Student(1,"sabbir");

        int r = studentDao.insert(student);


        System.out.println(r);
    }

}
