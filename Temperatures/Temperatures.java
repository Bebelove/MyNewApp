package Temperatures;

import java.util.Scanner;

public class Temperatures {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int maxT = 0;

        for (int i = 0; i < n; i++) {

            int t = in.nextInt();

            if (i < 1) {
                maxT = t;
            }

            if ((t * -1) == maxT) {
                if (t > 0) {
                    maxT = t;
                } else {
                    maxT = t * -1;
                }
            }

            if ((t < maxT && t > 0) || ((t * -1) < (maxT * -1)) && t < 0) {
                maxT = t;
            }
        }

        System.out.println(maxT);
    }
}
