package com.selab.AreaCalculator;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle(int width, int height) throws IllegalArgumentException {
		if (width <= 0 || height <= 0)
			throw new IllegalArgumentException("Width or height should be positive.");

		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		if (width <= 0)
			throw new IllegalArgumentException("Width should be positive.");

		this.width = width;
	}

	public void setHeight(int height) {
		if (height <= 0)
			throw new IllegalArgumentException("Height should be positive.");

		this.height = height;
	}

	public int computeArea()
	{
		return width * height;
	}
}
