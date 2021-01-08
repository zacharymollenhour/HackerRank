import java.io.*;
import java.util.Scanner;
import java.util.HashSet;
/**
 * Project: HackerRank_Practice
 * Package: SalesByMatch
 * <p>
 * Author: Zachary Mollenhour
 * Date: 1/8/2021
 * Time: 10:39 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Main{

    public static void main(String[] args) throws IOException {

        //Initiate Scanner to get user input
        Scanner scan = new Scanner(System.in);

        //Parse out the number of individual socks
        int n = scan.nextInt();

        /*
         * Loop through pairs and count sets
         */
        HashSet<Integer> sockpairs = new HashSet<>();
        int PairCount = 0;
        for(int i = 0; i < n; i++)
        {
           int individual_sock = scan.nextInt();
           if(sockpairs.contains(individual_sock))
           {
               sockpairs.remove(individual_sock);
               PairCount++;
           }
           else
           {
               sockpairs.add(individual_sock);
           }
        }
        System.out.println(PairCount);
    }
}

