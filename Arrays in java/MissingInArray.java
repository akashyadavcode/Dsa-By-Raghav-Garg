public class MissingInArray {

     int missingNum(int arr[]) {
        
        long n = arr.length+1;
        
        long totalSum = n*(n+1)/2;
        
        long sum = 0;
        for(int i = 0; i<arr.length; i++){
           sum = sum + arr[i]; 
        }
        
        return (int)(totalSum-sum);
    }
    public static void main(String[] args){

    }
}
