package conditions;

public class LargeSmall {
    public  static void main(String[] args){
        int[] arr = {10, 5, 20, 8, 15};

        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]> maxi){
                maxi=arr[i];
            }
            if (arr[i] < mini){
                mini=arr[i];
            }
        }

        System.out.print("Minimum val "+mini + " Maximum val "+maxi);
    }
}
