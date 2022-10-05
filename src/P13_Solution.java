import java.util.ArrayList;

public class P13_Solution {

    public int romanToInteger(char[] roman) {

        int[] value = new int[roman.length];

        for (int i = 0; i < roman.length; i++) {
            switch (roman[i]) {
                case 'I' -> value[i] = 1;
                case 'V' -> value[i] = 5;
                case 'X' -> value[i] = 10;
                case 'L' -> value[i] = 50;
                case 'C' -> value[i] = 100;
                case 'D' -> value[i] = 500;
                case 'M' -> value[i] = 1000;
            }
        }

        int result = 0;
        int aux = value[0];
        int group = 0;
        for (int i = 1; i < value.length; i++) {
            if (value[i] > value[i-1]) {
                group = value[i] - aux;
                aux = 0;
            } else if (value[i] < value[i-1]) {
                result += group + aux;
                aux = value[i];
                group = 0;
            } else {
                aux += value[i];
            }
        }
        result += aux + group;

        return result;
    }
}