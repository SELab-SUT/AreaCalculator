package com.selab.AreaCalculator;

public class Rectangle implements AreaComputable {
	private int width;
	private int height;

	public Rectangle(int width, int height) throws IllegalArgumentException {
		setWidth(width);
		setHeight(height);
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

	@Override
	public int computeArea() {
		return width * height;
	}
}
