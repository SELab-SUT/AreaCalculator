package com.selab.AreaCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
	private Rectangle rectangle;

	@Test
	public void constructor_ThrowsException_IfWidthIsNegative()
	{
		// Arrange
		final int RECTANGLE_NEGATIVE_WIDTH = -5;
		final int RECTANGLE_POSITIVE_HEIGHT = 10;

		// Action and Assert
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Rectangle(RECTANGLE_NEGATIVE_WIDTH, RECTANGLE_POSITIVE_HEIGHT);
		});

		final String EXPECTED_MESSAGE = "Width or height should be positive.";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
	}

	@Test
	public void constructor_ThrowsException_IfHeightIsNegative()
	{
		// Arrange
		final int RECTANGLE_POSITIVE_WIDTH = 5;
		final int RECTANGLE_NEGATIVE_HEIGHT = -10;

		// Action and Assert
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Rectangle(RECTANGLE_POSITIVE_WIDTH, RECTANGLE_NEGATIVE_HEIGHT);
		});

		final String EXPECTED_MESSAGE = "Width or height should be positive.";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
	}

	@Test
	public void constructor_ThrowsException_IfWidthIsZero()
	{
		// Arrange
		final int RECTANGLE_ZERO_WIDTH = 0;
		final int RECTANGLE_POSITIVE_HEIGHT = 10;

		// Action and Assert
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Rectangle(RECTANGLE_ZERO_WIDTH, RECTANGLE_POSITIVE_HEIGHT);
		});

		final String EXPECTED_MESSAGE = "Width or height should be positive.";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
	}

	@Test
	public void constructor_ThrowsException_IfHeightIsZero()
	{
		// Arrange
		final int RECTANGLE_POSITIVE_WIDTH = 5;
		final int RECTANGLE_ZERO_HEIGHT = 0;

		// Action and Assert
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Rectangle(RECTANGLE_POSITIVE_WIDTH, RECTANGLE_ZERO_HEIGHT);
		});

		final String EXPECTED_MESSAGE = "Width or height should be positive.";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
	}

	@Test
	public void constructor_DoesNotThrowException_IfWidthAndHeightAreValid() throws Exception
	{
		// Arrange
		final int RECTANGLE_POSITIVE_WIDTH = 5;
		final int RECTANGLE_POSITIVE_HEIGHT = 10;

		// Action
		rectangle = new Rectangle(RECTANGLE_POSITIVE_WIDTH, RECTANGLE_POSITIVE_HEIGHT);
	}

	@Test
	public void computeArea_MultipliesWidthByHeight_IfWidthAndHeightAreValid()
	{
		// Arrange
		final int RECTANGLE_POSITIVE_WIDTH = 5;
		final int RECTANGLE_POSITIVE_HEIGHT = 10;

		// Action
		rectangle = new Rectangle(RECTANGLE_POSITIVE_WIDTH, RECTANGLE_POSITIVE_HEIGHT);

		//Action
		final int EXPECTED_AREA = RECTANGLE_POSITIVE_WIDTH * RECTANGLE_POSITIVE_HEIGHT;
		int actualArea = rectangle.computeArea();

		// Assert
		assertEquals(EXPECTED_AREA, actualArea);
	}
}
