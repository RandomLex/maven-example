package com.barzykin.education.input;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUtils {

    private InputUtils() {
        //preventing Util instantiation
    }

    public static int readInt() {
        return Integer.parseInt(readStr());
    }

    public static String readStr() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            if (StringUtils.isEmpty(str)) {
                throw new IllegalArgumentException();
            }
            return str;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new IllegalArgumentException("Input argument must be meaningful");
        }
    }
}
