/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeDemo;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 *
 * @author Eugene Tan
 */
//@Component
public class Circle implements Shape {
    private String thisShape;

    public Circle() {
    }

    public Circle(String thisShape) {
        this.thisShape = thisShape;
    }
    
    public void myShape(){
        System.out.println("This is a shape of " + thisShape);
    }

    public String getThisShape() {
        return thisShape;
    }

//    @Resource
    public void setThisShape(String thisShape) {
        this.thisShape = thisShape;
    }
    
    public void myInit(){
        System.out.println("Object Init!");
    }
    
    public void myDestroy(){
        System.out.println("Object Destroy");
    }
}
