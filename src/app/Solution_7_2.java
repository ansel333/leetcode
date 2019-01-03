package app;

public class Solution_7_2 {
    public static int reverse(int x) {
        if(x == 0) return 0;

        int tail = 0, lastResult = 0;

        while( x != 0 ) {
            tail = x % 10;
            x = x / 10;
            if(lastResult > Integer.MAX_VALUE / 10 || lastResult == Integer.MAX_VALUE / 10 && tail > 7) return 0;
            if(lastResult < Integer.MIN_VALUE / 10 || lastResult == Integer.MAX_VALUE / 10 && tail < -8) return 0;
            lastResult = lastResult * 10 + tail;
        }

        return lastResult;
    }
}