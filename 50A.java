/*
A. Domino piling
time limit per test2 seconds
memory limit per test256 megabytes
You are given a rectangular board of M × N squares. Also you are given an unlimited number of standard domino pieces of 2 × 1 squares. You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:

1. Each domino completely covers two squares.

2. No two dominoes overlap.

3. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.

Find the maximum number of dominoes, which can be placed under these restrictions.

Input
In a single line you are given two integers M and N — board sizes in squares (1 ≤ M ≤ N ≤ 16).

Output
Output one number — the maximal number of dominoes, which can be placed.

Examples
InputCopy
2 4
OutputCopy
4
InputCopy
3 3
OutputCopy
4

*/




/*
Solution

1. Every matrix is r x c orientation and each domino is of orientation of 2x1
2. So for number of possible dominoes to cover the board will be r*c/2*1
*/


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((r*c)/2);
    }
}
