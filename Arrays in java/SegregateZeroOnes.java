public class SegregateZeroOnes {
    void segregate0and1(int[] arr) {
        // code here
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            if(arr[start] == 1 && arr[end] == 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if(arr[start] == 0){
                start++;
            }else{
                end--;
            }
        }
    }


    public static void main(String[] args){
        
    }
}
