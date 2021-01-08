import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/**
 * Project: HackerRank_Practice
 * Package: CountingValleys
 * <p>
 * Author: Zachary Mollenhour
 * Date: 1/8/2021
 * Time: 11:44 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */


public class Main {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int totalBribes = 0;
        int ExpectedFirst = 1;
        int ExpectedSecond = 2;
        int ExpectedThird = 3;
        for(int i = 0; i < q.length; i++)
        {
            //Check first value in array
            if(q[i] == ExpectedFirst)
            {
                ExpectedFirst = ExpectedSecond;
                ExpectedSecond = ExpectedThird;
                ++ExpectedThird;
            }
            else if(q[i] == ExpectedSecond)
            {
                ++totalBribes;
                ExpectedSecond = ExpectedThird;
                ++ExpectedThird;
            }
            else if (q[i] == ExpectedThird)
            {
                totalBribes += 2;
                ++ExpectedThird;
            }
            else
            {
                System.out.println("Too chaotic");
                return;
            }

        }

        System.out.println(totalBribes);

    }



    public static void main(String[] args) {
        //Read in User input
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //Loop through Bribes Values using above length
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;

            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
