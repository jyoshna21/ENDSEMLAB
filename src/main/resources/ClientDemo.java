package com.klef.jfsd.exam;

import com.klef.jfsd.exam.model.Course;
import com.klef.jfsd.exam.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/klef/jfsd/exam/config/ApplicationContext.xml");

        // Demonstrate Constructor Dependency Injection
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Details: " + employee);

        // Demonstrate Setter Autowiring
        Course course = (Course) context.getBean("course");
        System.out.println("Course Details: " + course);
    }
}
