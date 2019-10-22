package app;

public class Solution_7_1 {
    public static int reverse(int x) {
        if(x == 0) {
            return 0;
        }
        int gay = 1;
        if(x < 0) {
            gay = -1;
        }

        StringBuilder sb = new StringBuilder(x + "");

        String xStr = sb.reverse().toString().replace("-", "");
        while(!"".equals(xStr) && xStr.charAt(0) == '0') {
            xStr = xStr.substring(1);
        }
        int result = 0;
        try {
            result = Integer.parseInt(xStr);
        } catch(Exception e) {
            return 0;
        }
        return "".equals(xStr)? 0 : result * gay;
    }

    public static void main(String[] args) {
        synchronized (System.out) {
            System.out.print(reverse(12345));
        }
    }
}