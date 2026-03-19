public class Qthree{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        int j = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while (j < n) {
            arr[j] = 0;
            j++;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}