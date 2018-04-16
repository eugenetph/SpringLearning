/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeDemo;

/**
 *
 * @author Eugene Tan
 */
public class Triangle implements Shape {
    private String thisShape;

    public Triangle() {
    }

    public Triangle(String thisShape) {
        this.thisShape = thisShape;
    }
    
    public void myShape(){
        System.out.println("This is a shape of " + thisShape);
    }
    
}
