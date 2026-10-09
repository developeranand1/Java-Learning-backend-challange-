package conditions;

public class secondLargest {

    public  static int secondLar(int[] arr){
        int n=arr.length;

        int first=arr[0], second=Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            if(first < arr[i]){
            
            second=first;
            first=arr[i];
            }
            else if(second < arr[i] && first != arr[i]){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 20, 8, 15,20};

        System.out.print(secondLar(arr));
    }
}
