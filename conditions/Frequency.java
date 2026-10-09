package conditions;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 1, 2, 4 };
        int target = 2;
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}
