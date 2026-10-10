package string;

public class plaindrome {

    static boolean isPlaindrome(String str){
        char [] arr=str.toCharArray();

        int left=0, right=arr.length-1;

        while(left < right){
            char tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;

            left++;
            right--;
        }


       return str.equals(new String(arr));
    }
    public static void main(String[] args){
        String str="madam";

        System.out.print(isPlaindrome(str));
    }
}
