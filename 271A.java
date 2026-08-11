/*
A. Beautiful Year
time limit per test2 seconds
memory limit per test256 megabytes
It seems like the year of 2013 came only yesterday. Do you know a curious fact? The year of 2013 is the first year after the old 1987 with only distinct digits.

Now you are suggested to solve the following problem: given a year number, find the minimum year number which is strictly larger than the given one and has only distinct digits.

Input
The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.

Output
Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. It is guaranteed that the answer exists.

Examples
InputCopy
1987
OutputCopy
2013
InputCopy
2013
OutputCopy
2014

*/


/*
Solution:

The best solution is to loop the year to 9999+ and check for the nearest year after input year that has all digits unique. 
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        while (++year <= 9999) {
            boolean[] used = new boolean[10];
            int x = year;
            boolean unique = true;

            while (x > 0) {
                int digit = x % 10;

                if (used[digit]) {
                    unique = false;
                    break;
                }

                used[digit] = true;
                x /= 10;
            }

            if (unique) {
                System.out.println(year);
                return;
            }
        }
    }
}
