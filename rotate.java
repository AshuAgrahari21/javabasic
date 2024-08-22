public class rotate {

    public void reverse(int[] nums, int i, int j) {
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        rotate rotate = new rotate();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate.Rotate(nums, k);
    }

    public void Rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle cases where k is greater than n
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }
}