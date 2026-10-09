package conditions;

public class reverseArr {


    public static int[] reverseA(int[] arr){
        int left=0, right=arr.length-1;

        while(left <right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }

    public  static void main(String[] args){
        int[] arr={10, 20, 30, 40, 50};
        int[] ans =reverseA(arr);

        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }

    }
}
