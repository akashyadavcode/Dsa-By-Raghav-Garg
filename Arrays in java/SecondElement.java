public class SecondElement {

     public int getSecondLargest(int[] arr) {

        int fLargest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > fLargest) {
                sLargest = fLargest;
                fLargest = arr[i];
            }
            else if (arr[i] > sLargest && arr[i] != fLargest) {
                sLargest = arr[i];
            }
        }

        return sLargest;
    }
    public static void main(String[] args){
        int arr[] = {4,10,10,6,3,8};
    }
}
