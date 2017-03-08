package com.githup.wipat_teera.learning.project1;

import com.githup.wipat_teera.learning.project1.decorator.IShape;
import com.githup.wipat_teera.learning.project1.decorator.RedShapeDecorator;
import com.githup.wipat_teera.learning.project1.decorator.impl.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IShape circle = new Circle();

        IShape redCircle = new RedShapeDecorator(new Circle());

        IShape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
        
    }
}
