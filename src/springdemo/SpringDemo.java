/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Eugene Tan
 */
public class SpringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Resource resource = new ClassPathResource("springdemo\\studentbeans.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
        ApplicationContext factory = new ClassPathXmlApplicationContext("springdemo\\studentbeans.xml");
        
        Student student1 = factory.getBean("student1", Student.class);
        Student student2 = factory.getBean("student1", Student.class);
        
        student1.setStudentName("Superman");
        
        System.out.println("Student: " + student1.getStudentName());
        System.out.println("Student: " + student2.getStudentName());
        
        ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)factory;
        cxt.close();
    }
    
}
