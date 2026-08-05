/*

A. Team
time limit per test2 seconds
memory limit per test256 megabytes
One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests. Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the friends won't write the problem's solution.

This contest offers n problems to the participants. For each problem we know, which friend is sure about the solution. Help the friends find the number of problems for which they will write a solution.

Input
The first input line contains a single integer n (1 ≤ n ≤ 1000) — the number of problems in the contest. Then n lines contain three integers each, each integer is either 0 or 1. If the first number in the line equals 1, then Petya is sure about the problem's solution, otherwise he isn't sure. The second number shows Vasya's view on the solution, the third number shows Tonya's view. The numbers on the lines are separated by spaces.

Output
Print a single integer — the number of problems the friends will implement on the contest.

Examples
InputCopy
3
1 1 0
1 1 1
1 0 0
OutputCopy
2
InputCopy
2
1 0 0
0 1 1
OutputCopy
1
Note
In the first sample Petya and Vasya are sure that they know how to solve the first problem and all three of them know how to solve the second problem. That means that they will write solutions for these problems. Only Petya is sure about the solution for the third problem, but that isn't enough, so the friends won't take it.

In the second sample the friends will only implement the second problem, as Vasya and Tonya are sure about the solution.

*/



/*
Solution:

1. Get n 
2. Initiate n number of 1x3 matrix and fill the matrix with value input 1 or 0
3. For each matrix calculate number of 1s.
4. If value of 1s in one matrix is >=2, it can be solved so count is +1;
5. Similary check for all n 1x3 matrix and finally print the count which mean the total number of problems that can be solved. 
*/


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[3];
        int c=0;
        int f=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<3;j++){
                arr[j]=sc.nextInt();
                if(arr[j]==1){
                    c++;
                }
            }
            if(c>=2){
                f++;
            }
            c=0;
        }
        System.out.println(f);
    }
}
