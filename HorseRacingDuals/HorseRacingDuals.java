package HorseRacingDuals;

import java.util.HashMap;
import java.util.Scanner;

public class HorseRacingDuals {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("Enter horses number");
            int N = in.nextInt();

            HashMap<Integer, Integer> hashMap = new HashMap<>();

            int outputAnswer = 10000000;

            System.out.println("Enter horses power");

            for (int i = 1; i <= N; i++) {
                int pi = in.nextInt();

                hashMap.put(i, pi);

                if (i < 2) continue;

                for (int s = i; s > 1; --s) {

                    int a = pi;
                    int b = hashMap.get(s - 1);

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
            }

            System.out.println(outputAnswer);
        }
    }
}
