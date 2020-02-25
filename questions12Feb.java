// 1. Frequency 
// 2. sum of array
// 3. given 2 strings a, b print 1 if both strings are anagrams otherwise print 0
// 4. sort an array of integers using ......
// 5. U are given an array of length no of sticks when a term begins u must count the no of sticks. 
//    Deterimine the stick with the shortest length and discard any sticks of that length.
//    Remove that length from each of the longer sticks. REpeat until there are no sticks left
//    1 1 2 3 -> 4     1
//        1 2 -> 2     1
//          1 -> 1     1
// 6. A kaprekar is a no
// 7. Class name shape is being extended to subclasses rectangle and square. The objective is to print the hieght width and area of both shapes

import java.util.*;

class shape
{
    
}

public class questions12Feb
{
    static int smallest(int a[])
    {
        int mi = a[0];
        for(int i=1;i<a.length;i++)
        {
            if (mi == 0 && a[i]!=0)
                mi=a[i];
            else if (a[i] < mi && a[i] !=0)
                mi = a[i];
        }
        return mi;
    }
    
    static int length(int a[])
    {
        int s=0;
        for(int i=0;i<a.length;i++)
            if(a[i] != 0)
                s++;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :-");
        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"]: ");
            a[i] = sc.nextInt();
        }

        int s=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if (a[i] == a[j])
                    c++;
            }
            b[i] = c;
            s += a[i];
        }

        for(int i=0;i<n;i++)
            System.out.println("Frequency of a["+i+"] : "+b[i]);
        System.out.println("Sum : "+s);

        // =====================================================

        System.out.println("=====================================");

        System.out.println("Enter the no of Sticks :-");
        int p = sc.nextInt();

        int q[] = new int[p];
        
        for(int i=0;i<p;i++)
        {
            System.out.print("q["+i+"]: ");
            q[i] = sc.nextInt();
        }
        System.out.println("Sticks  :   Smallest");

        int sm=1;
        while(sm!=0)
        {
            sm = smallest(q);
            int le = length(q);
            System.out.println(le+"     :   "+sm);
            for(int j=0;j<p;j++)
                if(q[j] != 0)
                    q[j] -= sm;
        }

    }
}