package gb;
//1. Задан массив, например, nums = [1,7,3,6,5,6]. Написать программу,
// которая найдет индекс i для этого массива такой,
// что сумма элементов с индексами < i равна сумме элементов с индексами > i.

public class Task01 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,0,5,6};
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int count = 1;
        int sumLeft = 0;
            while (count < nums.length-1) {
                for (int j = 0; j < count; j++) {
                    sumLeft += nums[j];
                }
                int sumRight = sum - sumLeft - nums[count];
                if (sumRight == sumLeft) {
                    System.out.printf("Искомый индекс равен " + count);
                    break;
                }
                sumLeft = 0;
                count+=1;
            }
        }
}

