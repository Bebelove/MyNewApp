package ChukNorris;

import java.util.Scanner;

public class ChuckNorris {

    public static void main(String[] args) {

        while (true) {

            System.out.println("Input please your text below:");

            String inputString = new Scanner(System.in).nextLine();

            String binaryString = stringToBinaryString(inputString);

            String uniString = stringToUniString(binaryString);

            System.out.println("\nResult: \n" + uniString + "\n ");
        }
    }


    static String stringToBinaryString(String s) {

        char[] a = s.toCharArray();

        String binaryString = "";

        for (char x : a) {

            String l = Integer.toBinaryString((int) x);

            if (l.length() < 7)
                l = "0" + l;

            binaryString += l;
        }

        return binaryString;
    }

    static String stringToUniString(String s) {

        char[] a = s.toCharArray();

        String uniString = "";

        if (a[0] == '0') uniString += "00 0";
        else uniString += "0 0";

        for (int i = 1; i < a.length; i++) {
            if (a[i] == '0') {
                if (a[i] == a[i - 1]) uniString += "0";
                else uniString += " 00 0";
            } else {
                if (a[i] == a[i - 1]) uniString += "0";
                else uniString += " 0 0";
            }
        }

        return uniString;
    }
}