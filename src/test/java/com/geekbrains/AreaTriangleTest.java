package com.geekbrains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaTriangleTest {

    @Test
    void givenSidesTriangleWhenCalculationAreaThenTrue() throws Exception {
        Assertions.assertEquals(AreaTriangle.calculatingArea(4, 5, 2), 3.799671038392666);
    }

    @Test
    void exceptionWhenwrongIncorrectSideTriangle() {
        Assertions.assertThrows(Exception.class, ()->AreaTriangle.calculatingArea(1, 5, 2));
    }


}
