package com.githup.wipat_teera.learning.project1.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(IShape shape) {
		super(shape);
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		_shape.draw();
		setRedBorder();
	}

	private void setRedBorder() {
		// TODO Auto-generated method stub
		System.out.println("Border colour: Red");
	}

}
