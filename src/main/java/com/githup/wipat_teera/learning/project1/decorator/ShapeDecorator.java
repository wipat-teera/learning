package com.githup.wipat_teera.learning.project1.decorator;

public abstract class ShapeDecorator implements IShape {
	protected IShape _shape;
	
	public ShapeDecorator(IShape shape){
		this._shape = shape;
	}
	
	public void draw(){
		_shape.draw();
	}
}
