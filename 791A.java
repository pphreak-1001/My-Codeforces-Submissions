/*
A. Bear and Big Brother
time limit per test1 second
memory limit per test256 megabytes
Bear Limak wants to become the largest of bears, or at least to become larger than his brother Bob.

Right now, Limak and Bob weigh a and b respectively. It's guaranteed that Limak's weight is smaller than or equal to his brother's weight.

Limak eats a lot and his weight is tripled after every year, while Bob's weight is doubled after every year.

After how many full years will Limak become strictly larger (strictly heavier) than Bob?

Input
The only line of the input contains two integers a and b (1 ≤ a ≤ b ≤ 10) — the weight of Limak and the weight of Bob respectively.

Output
Print one integer, denoting the integer number of years after which Limak will become strictly larger than Bob.

Examples
InputCopy
4 7
OutputCopy
2
InputCopy
4 9
OutputCopy
3
InputCopy
1 1
OutputCopy
1
Note
In the first sample, Limak weighs 4 and Bob weighs 7 initially. After one year their weights are 4·3 = 12 and 7·2 = 14 respectively (one weight is tripled while the other one is doubled). Limak isn't larger than Bob yet. After the second year weights are 36 and 28, so the first weight is greater than the second one. Limak became larger than Bob after two years so you should print 2.

In the second sample, Limak's and Bob's weights in next years are: 12 and 18, then 36 and 36, and finally 108 and 72 (after three years). The answer is 3. Remember that Limak wants to be larger than Bob and he won't be satisfied with equal weights.

In the third sample, Limak becomes larger than Bob after the first year. Their weights will be 3 and 2 then.
*/



/*
Solution:

Lets assume the age of L is a and B is b

A/Q,

initally Age of L = a x 3^0 = a
After 1 year, the age becomes thrice, which mean : Age of L = ax3^1
After 2 years, the age becomes thrice of the previous age: Age of L = ax3^2

and it continues so. 


Similarly, 
Initially the age of B = bx2^0 = b
After 1 year, the age becomes twice, which mean : Age of B = bX2^1
After 2 years, the age becomes twice of the previous age: Age of B = bx2^2

and it continues so. 



So we need to find the year after which Age of L > Age of B 

That means, 

a x 3^x > b x 2^x ( x is the year after which L will be greated than B) 

This inequality gives us:

(3/2)^x > b/a

If we take log, we get 

x > log(b/a) / log(3/2)


So if we find x using this formula and add 1, we will get the actual year. 
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();
        double x = Math.log((double)b / l) / Math.log(3.0 / 2.0); // Find x = log(b/a)/log(3/2) , for e.g a=4 and b=7, this will give us 1.38
        int ans = (int)Math.floor(x) + 1; // From 1.38 , we take the integer before decimal place: 1 and add 1 to it. 
        System.out.println(ans);
    }
}
