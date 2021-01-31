package com.barzykin.education.calculation;

import java.util.Locale;

public class Calculator {
//    private Calculator() {
//        preventing Util instantiation
//    }

    public static int action(String action, int a, int b) {
        switch (action.toLowerCase(Locale.ROOT)) {
            case "+" :
                return sum(a, b);
            default:
                throw new IllegalStateException("Unexpected value: " + action.toLowerCase(Locale.ROOT));
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
