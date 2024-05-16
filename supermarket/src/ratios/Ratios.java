package ratios;

import java.io.*;
import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.Date;
import java.util.concurrent.*;
import java.util.stream.*;
import java.util.function.Function;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float positiveRatio = 0.0f;
        float negativeRatio = 0.0f;
        float zeroRatio = 0.0f;

        for(Integer i : arr) {
            if(i > 0) positiveRatio++;
            else if(i < 0) negativeRatio++;
            else zeroRatio++;
        }

        System.out.printf("%.6f\n",positiveRatio / arr.size());
        System.out.printf("%.6f\n",negativeRatio / arr.size());
        System.out.printf("%.6f\n",zeroRatio / arr.size());
    }

    public static void miniMaxSum(List<Integer> arr) {
        if (arr != null && arr.size() == 5) {
            long base = 0;
            for (Integer num : arr) {
                base += num;
            }

            long min = base;
            long max = 0;

            for (Integer num : arr) {
                min = Math.min(min, base - num);
                max = Math.max(max, base - num);
            }
            System.out.println(min + " " + max);
        }
    }

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");

        // Parse the input time
        Date date = null;
        String formattedTime = "";
        try {
            date = parseFormat.parse(s);
            formattedTime = displayFormat.format(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return formattedTime;
        // Format the parsed time in 24-hour format
    }

    //Given an array of integers, where all elements but one occur twice, find the unique element.
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        return a.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting())
                ).entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .get().getKey().intValue();
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int diffAbs = 0;
        //arr.remove(0);
        int size = arr.get(0).size();
        System.out.println("size: "+size);

        int di = 0;
        int dd = 0;
        int i = 0;
        for(List<Integer> row :arr) {
            di += row.get(i);
            i++;
            dd += row.get(size-i);
            System.out.println("i: "+i+" size-i: "+(size-i)+" di: "+di+" dd: "+dd);
        }
        diffAbs = Math.abs(di-dd);
        return diffAbs;
    }
}

public class Ratios {
    public static void main(String[] args) throws IOException {
        int n = 6;
        List<Integer> arr = List.of(-4, 3, -9, 0, 4, 1);
        Result.plusMinus(arr);
    }
}
