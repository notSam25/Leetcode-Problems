public class RotateArray {
  public static void main(String[] args) {
    int[] nums = {
        // 1, 2, 3, 4, 5, 6, 7
      1, 2
    };
    RotateArray.solve(nums, 3);

    for (int i = 0; i < nums.length; i++) {
      System.out.printf("%d ", nums[i]);
    }
  }

  public static void solve(int[] nums, int rotate) {
    int[] arr = nums.clone();
    int index = 0;
    while (index < nums.length) {
      if (index + rotate >= nums.length) {
        arr[rotate - (nums.length - index)] = nums[index];
      } else {
        arr[index + rotate] = nums[index];
      }
      index++;
    }

    for (int i = 0; i < nums.length; i++) {
      nums[i] = arr[i];
    }
  }
}