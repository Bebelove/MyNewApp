package Practice1;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        System.out.println("Input please your text below:");

        char[] charArray = new String(new Scanner(System.in).nextLine()).toCharArray();

        System.out.println("Input please number of which character you want to print out:");

        int inputCharNumber = new Scanner(System.in).nextInt();

        while (inputCharNumber > charArray.length) {
            System.out.println("Your number is larger than your text length.\nPlease enter correct number:");
            inputCharNumber = new Scanner(System.in).nextInt();
        }

        System.out.println("Your character is: " + charArray[inputCharNumber - 1]);
    }

}
