package org.example;

/**
 * 二分查找
 */
public class BinarySearch {


    public static void main(String[] args) {
        int value = 13;
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int result = binarySearch(nums, value);
        System.out.println(result);
    }

    /**
     * 给定一个数组,查找value是否存在数组中,不存在返回-1
     */
    static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // 注意

        while (left <= right) { // 注意
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1; // 注意
            else if (nums[mid] > target)
                right = mid - 1; // 注意
        }
        return -1;
    }
}
