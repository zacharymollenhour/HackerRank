import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Project: HackerRank_Practice
 * Package: PACKAGE_NAME
 * <p>
 * Author: Zachary Mollenhour
 * Date: 1/8/2021
 * Time: 12:56 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Main {// Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        //Variables for tracking
        int i = 0;
        int c = 0;
        int n = arr.length;


        for(i=0; i < n; i++)
        {
            //Since arr[i] starts at 0
            //We can check by comparing it to i+1
            if(arr[i] == (i+1))
            {
                continue;
            }
            arr[i] = arr[arr[i] - 1];
            c++;
            i--;
        }
        System.out.println(c);
        return c;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //Read in User Input
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        System.out.println("Here");
        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}