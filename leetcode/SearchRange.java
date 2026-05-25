import java.util.Arrays;

public class SearchRange {

    public static int[] searchRange(int[] nums, int target) {

        int[] res = {-1, -1};

        int left = 0;
        int right = nums.length - 1;

        // First occurrence
        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target &&
               (mid == 0 || nums[mid - 1] < target)) {

                res[0] = mid;
                break;

            } else if(nums[mid] >= target) {

                right = mid - 1;

            } else {

                left = mid + 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        // Last occurrence
        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target &&
               (mid == nums.length - 1 ||
                nums[mid + 1] > target)) {

                res[1] = mid;
                break;

            } else if(nums[mid] <= target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};

        int[] result = searchRange(nums, 8);

        System.out.println(Arrays.toString(result));
    }
}