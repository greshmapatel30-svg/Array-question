
public class Qseven {

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 2, 2, 1, 1};

        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 0;


        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        
        count1 = 0;
        count2 = 0;

        for (int num : arr) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        int n = arr.length;

        if (count1 > n / 3) {
            System.out.println(candidate1);
        }
        if (count2 > n / 3) {
            System.out.println(candidate2);
        }
    }
}
    

