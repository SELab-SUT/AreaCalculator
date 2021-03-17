package com.selab.AreaCalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    private Rectangle rectangle;
    private final int RECTANGLE_INIT_WIDTH = 3;
    private final int RECTANGLE_INIT_HEIGHT = 8;

    @Before
    public void setUp_Correct_Rectangle() {
        // Action
        rectangle = new Rectangle(RECTANGLE_INIT_WIDTH, RECTANGLE_INIT_HEIGHT);

    }

    @Test
    public void constructor_ThrowsException_IfWidthIsNegative() {
        // Arrange
        final int RECTANGLE_NEGATIVE_WIDTH = -5;
        final int RECTANGLE_POSITIVE_HEIGHT = 10;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(RECTANGLE_NEGATIVE_WIDTH, RECTANGLE_POSITIVE_HEIGHT);
        });

        final String EXPECTED_MESSAGE = "Width should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void constructor_ThrowsException_IfHeightIsNegative() {
        // Arrange
        final int RECTANGLE_POSITIVE_WIDTH = 5;
        final int RECTANGLE_NEGATIVE_HEIGHT = -10;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(RECTANGLE_POSITIVE_WIDTH, RECTANGLE_NEGATIVE_HEIGHT);
        });

        final String EXPECTED_MESSAGE = "Height should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void constructor_ThrowsException_IfWidthIsZero() {
        // Arrange
        final int RECTANGLE_ZERO_WIDTH = 0;
        final int RECTANGLE_POSITIVE_HEIGHT = 10;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(RECTANGLE_ZERO_WIDTH, RECTANGLE_POSITIVE_HEIGHT);
        });

        final String EXPECTED_MESSAGE = "Width should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void constructor_ThrowsException_IfHeightIsZero() {
        // Arrange
        final int RECTANGLE_POSITIVE_WIDTH = 5;
        final int RECTANGLE_ZERO_HEIGHT = 0;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(RECTANGLE_POSITIVE_WIDTH, RECTANGLE_ZERO_HEIGHT);
        });

        final String EXPECTED_MESSAGE = "Height should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void constructor_DoesNotThrowException_IfWidthAndHeightAreValid() throws Exception {
        // Arrange
        final int RECTANGLE_POSITIVE_WIDTH = 5;
        final int RECTANGLE_POSITIVE_HEIGHT = 10;

        // Action
        rectangle = new Rectangle(RECTANGLE_POSITIVE_WIDTH, RECTANGLE_POSITIVE_HEIGHT);
    }

    @Test
    public void computeArea_MultipliesWidthByHeight_IfWidthAndHeightAreValid() {
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

    @Test
    public void setWidth_ThrowsException_IfWidthIsNegative() {
        // Arrange
        final int RECTANGLE_NEGATIVE_WIDTH = -5;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setWidth(RECTANGLE_NEGATIVE_WIDTH);
        });

        final String EXPECTED_MESSAGE = "Width should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void setWidth_ThrowsException_IfWidthIsZero() {
        // Arrange
        final int RECTANGLE_ZERO_WIDTH = 0;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setWidth(RECTANGLE_ZERO_WIDTH);
        });

        final String EXPECTED_MESSAGE = "Width should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void setWidth_DoesNotThrowException_IfWidthIsPositive() {
        // Arrange
        final int RECTANGLE_POSITIVE_WIDTH = 7;

        // Action
        rectangle.setWidth(RECTANGLE_POSITIVE_WIDTH);
    }

    @Test
    public void setHeight_ThrowsException_IfHeightIsNegative() {
        // Arrange
        final int RECTANGLE_NEGATIVE_HEIGHT = -10;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setHeight(RECTANGLE_NEGATIVE_HEIGHT);
        });

        final String EXPECTED_MESSAGE = "Height should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void setHeight_ThrowsException_IfHeightIsZero() {
        // Arrange
        final int RECTANGLE_ZERO_HEIGHT = 0;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setHeight(RECTANGLE_ZERO_HEIGHT);
        });

        final String EXPECTED_MESSAGE = "Height should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void setHeight_DoestNotThrowException_IfHeightIsPositive() {
        // Arrange
        final int RECTANGLE_POSITIVE_HEIGHT = 19;

        // Action
        rectangle.setHeight(RECTANGLE_POSITIVE_HEIGHT);
    }

    @Test
    public void getWidth_ReturnsWidthAfterConstruct() {
        // Action
        int actual_width = rectangle.getWidth();

        // Assert
        assertEquals(RECTANGLE_INIT_WIDTH, actual_width);
    }

    @Test
    public void getHeight_ReturnsHeightAfterConstruct() {
        // Action
        int actual_height = rectangle.getHeight();

        // Assert
        assertEquals(RECTANGLE_INIT_HEIGHT, actual_height);
    }

    @Test
    public void getWidth_ReturnsWidthAfterSet() {
        // Arrange
        final int RECTANGLE_NEW_WIDTH = 63;

        // Action
        rectangle.setWidth(RECTANGLE_NEW_WIDTH);
        int actual_width = rectangle.getWidth();

        // Assert
        assertEquals(RECTANGLE_NEW_WIDTH, actual_width);
    }

    @Test
    public void getHeight_ReturnsHeightAfterSet() {
        // Arrange
        final int RECTANGLE_NEW_HEIGHT = 18;

        // Action
        rectangle.setHeight(RECTANGLE_NEW_HEIGHT);
        int actual_height = rectangle.getHeight();

        // Assert
        assertEquals(RECTANGLE_NEW_HEIGHT, actual_height);
    }
}
