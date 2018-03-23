package MimeTypes;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int tableSize = in.nextInt(); // Number of elements which make up the association table.
        int filesToGet = in.nextInt(); // Number Q of file names to be analyzed.

        HashMap<String, String> hMap = new HashMap<>();

        for (int i = 0; i < tableSize; i++) {
            String EXT = in.next().toLowerCase(); // file extension
            String MT = in.next(); // MIME type.
            hMap.put(EXT, MT);
        }

        in.nextLine();

        String[] extArray = new String[filesToGet];

        for (int i = 0; i < filesToGet; i++) {
            String fName = in.nextLine(); // One file name per line.
            Pattern pattern = Pattern.compile("\\.(\w+$)");
            Matcher matcher = pattern.matcher(fName);
            if (matcher.find()) {
                String key = matcher.group(1).toLowerCase();
                if (hMap.containsKey(key)) {
                    extArray[i] = hMap.get(key);
                } else {
                    extArray[i] = "UNKNOWN";
                }
            } else {
                extArray[i] = "UNKNOWN";
            }
        }

        for (String x : extArray) {
            System.out.println(x);
        }
    }
}
