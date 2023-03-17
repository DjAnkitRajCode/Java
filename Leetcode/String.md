# LeetCode String Questions

## <a href="https://leetcode.com/problems/remove-vowels-from-a-string" target="_blank">1119. Remove Vowels from a String</a>
| [alternative geeksforgeeks](https://www.geeksforgeeks.org/program-remove-vowels-string/) | 

```java
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class RemoveVowvel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i =0; i<s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                || s.charAt(i) == 'O'
                || s.charAt(i) == 'U') {
                continue;
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
}

public class RemoveVowvel{
    static String remvol(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String args[]){
        String str = "geeks for geeks";
        System.out.print(remvol(str));
    }
}
```

## <a href="" target="_blank"></a>

```java

```


## <a href="https://leetcode.com/problems/split-a-string-in-balanced-strings/description/" target="_blank">1221. Split a String in Balanced Strings</a>

```java
class Solution {
    public int balancedStringSplit(String s) {
        int countr=0;
        int answer =0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='R'){
                countr++;
            }
            else{
                countr--;
            }
            if(countr==0){
                answer++;
            }
        }
        return answer;
    }
}
```








## <a href="" target="_blank"></a>

```java

```



