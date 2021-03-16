package com.selab.AreaCalculator;

public class Rectangle {
	public Rectangle(int width, int height) throws IllegalArgumentException {
		if (width <= 0 || height <= 0)
			throw new IllegalArgumentException("Width or height should be positive.");
		this.width = width;
		this.height = height;
	}

	public int computeArea()
	{
		return width * height;
	}

	int width;
	int height;
}
