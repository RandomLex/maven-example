package com.barzykin.education;

import com.barzykin.education.calculation.Calculator;
import com.barzykin.education.input.InputUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        String action = InputUtils.readStr();
        int a = InputUtils.readInt();
        int b = InputUtils.readInt();

        int result = Calculator.action(action, a, b);

        System.out.println(result);
    }

}
