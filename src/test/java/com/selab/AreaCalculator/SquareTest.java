package com.selab.AreaCalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    private Square square;
    private final int SQUARE_INIT_SIDE = 7;

    @Before
    public void setUp_Correct_Square() {
        // Action
        square = new Square(SQUARE_INIT_SIDE);
    }

    @Test
    public void constructor_ThrowsException_IfSideIsNegative() {
        // Arrange
        final int SQUARE_NEGATIVE_SIDE = -5;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Square(SQUARE_NEGATIVE_SIDE);
        });

        final String EXPECTED_MESSAGE = "Side should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void constructor_ThrowsException_IfSideIsZero() {
        // Arrange
        final int SQUARE_ZERO_SIDE = 0;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Square(SQUARE_ZERO_SIDE);
        });

        final String EXPECTED_MESSAGE = "Side should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void constructor_DoesNotThrowException_IfSideIsPositive() {
        // Arrange
        final int SQUARE_POSITIVE_SIDE = 5;

        // Action
        square = new Square(SQUARE_POSITIVE_SIDE);
    }

    @Test
    public void computeArea_MultipliesSideBySide_IfSideIsValid() {
        // Arrange
        final int SQUARE_POSITIVE_SIDE = 5;

        // Action
        square = new Square(SQUARE_POSITIVE_SIDE);

        // Action
        final int EXPECTED_AREA = SQUARE_POSITIVE_SIDE * SQUARE_POSITIVE_SIDE;
        int actual_area = square.computeArea();

        // Assert
        assertEquals(EXPECTED_AREA, actual_area);
    }

    @Test
    public void setSide_ThrowsException_IfSideIsNegative() {
        // Arrange
        final int SQUARE_NEGATIVE_SIDE = -5;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            square.setSide(SQUARE_NEGATIVE_SIDE);
        });

        final String EXPECTED_MESSAGE = "Side should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void setSide_ThrowsException_IfSideIsZero() {
        // Arrange
        final int SQUARE_ZERO_SIDE = 0;

        // Action and Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            square.setSide(SQUARE_ZERO_SIDE);
        });

        final String EXPECTED_MESSAGE = "Side should be positive.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(EXPECTED_MESSAGE));
    }

    @Test
    public void setSide_DoesNotThrowException_IfSideIsPositive() {
        // Arrange
        final int SQUARE_POSITIVE_SIDE = 5;

        // Assert
        square.setSide(SQUARE_POSITIVE_SIDE);
    }

    @Test
    public void getSide_ReturnsSideAfterConstruct() {
        // Action
        int actual_side = square.getSide();

        // Assert
        assertEquals(SQUARE_INIT_SIDE, actual_side);
    }

    @Test
    public void getSide_ReturnsSideAfterSet() {
        // Arrange
        final int SQUARE_NEW_SIDE = 16;

        // Action
        square.setSide(SQUARE_NEW_SIDE);
        int actual_side = square.getSide();

        // Assert
        assertEquals(SQUARE_NEW_SIDE, actual_side);
    }
}
