public class SearchInArray {

    public static int searchArr(int[] arr, int key) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 34, 5, 6, 7, 8, 9, 10 };
        int key = 5;
        searchArr(arr, key);
    }
}
