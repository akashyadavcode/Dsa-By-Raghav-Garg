import java.util.Arrays;

public class BuiltinSort {
    public static void main(String[] args){
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
