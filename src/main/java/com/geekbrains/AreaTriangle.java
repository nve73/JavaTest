package com.geekbrains;

public class AreaTriangle {

    public static Double calculatingArea(double a, double b, double c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new Exception("Некорректно указана длина строны");
        }
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


}
