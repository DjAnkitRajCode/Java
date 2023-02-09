# Questions Ask


*  [Swap two number without using third variable](#1)
*  [Second Largest element of an Array](#2)
*  [remove duplicate of an array](#3)
*  [longest palindromic substring](#4)


## <a name="1"></a> Q1 Swap two number without using third variable

```java
// using operators
import java.io.*;
 
class Geeks {
 
    public static void main(String a[])
    {
        int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"+ " x = " + x + ", y = " + y);
    }
}
```

```java
// Java code to swap using XOR --> Bitwise
/*
XOR table for bitwise

| A | B | Q |
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 0 |
*/
import java.io.*;
 
public class GFG {
 
    public static void main(String a[])
    {
        int x = 10;
        int y = 5;
 
        // Code to swap 'x' (1010) and 'y' (0101)
        x = x ^ y; // x now becomes 15 (1111)
        y = x ^ y; // y becomes 10 (1010)
        x = x ^ y; // x becomes 5 (0101)
 
        System.out.println("After swap: x = "+ x + ", y = " + y);
    }
}
```

```java
// using single Line code
import java.io.*;
 
class GFG {
    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;
        x = (x * y) / (y = x);
        System.out.println("After swapping:"+ " x = " + x + ", y = " + y);
    }
}
```

## <a name="2"></a> Q2 Second Largest element of an Array

| [JavaTpoint](https://www.javatpoint.com/java-program-to-find-second-largest-number-in-an-array) | [Geeksforgeeks](https://www.geeksforgeeks.org/find-second-largest-element-array/) |

```java 
import java.io.*;
 
class GFG {
 
    /* Function to print the second largest elements */
    public static void print2largest(int arr[],int arr_size){
        int i, first, second;
 
        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }
 
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is greater than first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            /* If arr[i] is in between first and second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
 
        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"+ " element\n");
        else
            System.out.print("The second largest element"+ " is " + second);
    }
 
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
    }
}
```

## <a name="3"></a> Q3 Remove duplicate of an array

| [JavaTpoint](https://www.javatpoint.com/java-program-to-remove-duplicate-element-in-an-array) | [Geeksforgeeks](https://www.geeksforgeeks.org/remove-duplicates-sorted-array/) |

```java
// simple java program to remove
// duplicates

class Main
{
	// Function to remove duplicate elements
	// This function returns new size of modified
	// array.
	static int removeDuplicates(int arr[], int n)
	{
		if (n == 0 || n == 1)
			return n;
	
		// To store index of next unique element
		int j = 0;
	
		// Doing same as done in Method 1
		// Just maintaining another updated index i.e. j
		for (int i = 0; i < n-1; i++)
			if (arr[i] != arr[i+1])
				arr[j++] = arr[i];
	
		arr[j++] = arr[n-1];
	
		return j;
	}
	
	public static void main (String[] args)
	{
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		int n = arr.length;
		
		n = removeDuplicates(arr, n);

		// Print updated array
		for (int i=0; i<n; i++)
		System.out.print(arr[i]+" ");
	}
}

```

## <a name="4"></a> Q4 longest palindromic substring

| [Geeksforgeeks](https://www.geeksforgeeks.org/longest-palindromic-substring-using-dynamic-programming/) | [Leetcode](https://leetcode.com/problems/longest-palindromic-substring/) | [Leetcode-solution](https://leetcode.com/problems/longest-palindromic-substring/solutions/127837/longest-palindromic-substring/) |

```java
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
```