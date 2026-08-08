/*
A. Soldier and Bananas
time limit per test1 second
memory limit per test256 megabytes
A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one and so on (in other words, he has to pay i·k dollars for the i-th banana).

He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?

Input
The first line contains three positive integers k, n, w (1  ≤  k, w  ≤  1000, 0 ≤ n ≤ 109), the cost of the first banana, initial number of dollars the soldier has and number of bananas he wants.

Output
Output one integer — the amount of dollars that the soldier must borrow from his friend. If he doesn't have to borrow money, output 0.

Examples
InputCopy
3 17 4
OutputCopy
13
*/

/*
Solution:
Simply calculate the total of the bananas he want and see his budget is sufficeint or not. Based on that find how much loan he has to take. 

*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c1 = sc.nextInt();
        int bud = sc.nextInt();
        int demand = sc.nextInt();
        int total=0;
        for(int i=1;i<=demand;i++){
            total = total + c1*i;
        }
        if(total>bud){
        System.out.println(total-bud);
        }
        else if(bud>=total){
         System.out.println(0);   
        }
    }
}
