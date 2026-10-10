package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    static void  main(String[] args){
        String str1="listen", str2="slient";

        char[] arr1=str1.toLowerCase().toCharArray();
        char[] arr2=str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);;
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.print("Anangram");
        }
    }
}
