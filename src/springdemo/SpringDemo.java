/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import ShapeDemo.Shape;
import StudentDemo.Student;
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
        ApplicationContext factory = new ClassPathXmlApplicationContext("StudentDemo\\studentbeans.xml");
        
        Student student1 = factory.getBean("student", Student.class);
        
        System.out.println("Student: " + student1.getAddress().getZipCode());
        
        ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)factory;
        cxt.close();
        
        /*ApplicationContext context = new ClassPathXmlApplicationContext("ShapeDemo\\Shapebeans.xml");
        printShape((Shape)context.getBean("circle"));
        ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
        cxt.close();*/
    }
    
    public static void printShape(Shape shape){
        shape.myShape();;
    }
    
}
