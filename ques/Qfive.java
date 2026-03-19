public class Qfive {
    public static void main(String args[]){
    int arr[]={2,4,6,8,-2};
    int target=0;

    for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
            System.out.println(i + " " + j);
        }
    }
}}}


