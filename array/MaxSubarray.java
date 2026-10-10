package array;

public class MaxSubarray {

    // O(n2)
     static int maxSubArray(int[] arr){
        int maxi=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            int sum=0;

            for(int j=i; j<arr.length; j++){

                sum+=arr[j];

                maxi=Integer.max(maxi, sum);
            }
        }
        return maxi;
    }


    // O(n)

    static  int kadanesAlgo(int [] arr){
        int maxi=Integer.MIN_VALUE;

        int sum=0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];

            maxi=Integer.max(maxi, sum);

            if(sum < 0){
                sum=0;
            }
        }

        return maxi;
    }

  public static void main (String[] args){
        int[] arr={2, 3, -8, 7, -1, 2, 3};

        System.out.print(maxSubArray(arr));
         System.out.print(kadanesAlgo(arr));
    }
}
