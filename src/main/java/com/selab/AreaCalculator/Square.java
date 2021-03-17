package com.selab.AreaCalculator;

public class Square implements AreaComputable {
	private int side;

	public Square(int side) throws IllegalArgumentException {
		setSide(side);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) throws IllegalArgumentException {
		if (side <= 0)
			throw new IllegalArgumentException("Side should be positive.");
		this.side = side;
	}

	@Override
	public int computeArea() {
		return side * side;
	}
}
