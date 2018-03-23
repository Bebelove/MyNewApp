package HorseRacingDuals;

import java.util.Arrays;
import java.util.Scanner;

public class HorseRacingDuals_v2 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter horses number:");
        int N = in.nextInt();

        int outputAnswer = 10000000;

        int[] intArray = new int[N];

        System.out.println("Enter horses power:");
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();

            intArray[i] = pi;
        }

        Arrays.sort(intArray);


        for (int x = 0; x < N - 1; x++) {

            int a = intArray[x];
            int b = intArray[x + 1];

            int m = Math.max(a, b);

            if (m == a) {
                int d = a - b;

                if (d < outputAnswer) {
                    outputAnswer = d;
                }
            } else {
                int d = b - a;

                if (d < outputAnswer) {
                    outputAnswer = d;
                }
            }
        }

        System.out.println("Result is: " + outputAnswer);
    }
}
