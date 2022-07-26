package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SQRServiceTests {
    @Test
    public void from0To10 () {
        SQRService service = new SQRService();

        int actual = service.numberOfSquares(200,300);
        int expected = 3;

        assertEquals(expected, actual);
    }
}
