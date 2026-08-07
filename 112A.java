/*
A. Petya and Strings
time limit per test2 seconds
memory limit per test256 megabytes
Little Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

Input
Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

Output
If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.

Examples
InputCopy
aaaa
aaaA
OutputCopy
0
InputCopy
abs
Abz
OutputCopy
-1
InputCopy
abcdefg
AbCdEfF
OutputCopy
1
Note
If you want more formal information about the lexicographical order (also known as the "dictionary order" or "alphabetical order"), you can visit the following site:

http://en.wikipedia.org/wiki/Lexicographical_order
*/



/*
Solution:

Lexicographically mean : comparison based on dictionary order. 

For e.g;

if we have abc and abd , we see abc comes before abd. So The left side is greater. Hence it has to return 1. 
if we have mno mnp , we see mnp comes before mno. So the right side is greater . Hence it has to return -1. 
if we compare abc and abc, both of them appear at the same place in dictionary. Hence it has to return 0. 

For lexicographic comparison, java support compareTo method. 
*/


import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String first = sc.nextLine().toLowerCase();
        String second = sc.nextLine().toLowerCase();
 
        int res = first.compareTo(second);
 
        if (res < 0)
            System.out.println(-1);
        else if (res > 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
