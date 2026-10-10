package string;

public class reverseStr {

    static String reverse(String str){
        char[] arr=str.toCharArray();
        int left=0, right=str.length()-1;

         System.out.println(str);

        System.out.println(arr);

        while(left < right){
            char tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            
            left++; 
            right--;
        
        }
        return new String(arr);

    }
    public static void main(String[] args){

        String name="anand";
        System.out.println(reverse(name));
    }


}
