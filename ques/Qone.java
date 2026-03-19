import java.util.*;
public class Qone {
    public static void MissingNo(){
        int[] arr = {1, 2, 3, 5, 6};
        int n = 6;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int i=0;i<arr.length;i++) {
            arraySum += arr[i];
        }
        int missing = totalSum - arraySum;
        System.out.println("Missing number is: " + missing);
    }
    public static void main(String[] args) {
        MissingNo();
}    
}
