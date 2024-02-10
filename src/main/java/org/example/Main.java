package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] nums = {5, 7, 9, 11, 13};
        int target = 13;
        BubbleSort();

//        int result = binarySearch(nums, target, 0, nums.length - 1);
//        if (result != -1) {
//            System.out.println("element found at index " + result);
//        } else {
//            System.out.println("element not found");
//        }

    }

    public static int lenearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;

            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        //int[] nums = {5,7,9,11,13};
        //  int left=0,right=nums.length-1;
//        while (left<=right){
//            int mid=(left+right)/2;
//            if(nums[mid]==target){
//                return  mid;
//            }
//            else if (nums[mid]<target){
//                left=mid+1;
//            }
//            else{
//                right=mid-1;
//            }
//        }

        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, right);
            } else {
                return binarySearch(nums, target, left, mid - 1);
            }

        }

        return -1;
    }

    public static void BubbleSort() {
        int[] nums = {7, 6, 3, 9, 15};
        int temp = 0;

        for(int num :nums){
            System.out.println(num);// testinge
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp   =nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int num :nums){
            System.out.println(num);
        }
    }

}

