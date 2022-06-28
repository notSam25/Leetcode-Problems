public class BinarySearch {
  public static void main(String[] args) {
    int[] nums = {
        -1, 0, 3, 5, 9, 12
    };
    System.out.println(BinarySearch.Search(nums, 9));
  }

  public static int Search(int[] nums, int target) {
    int arrayTarget = -1;
    for (int i = 0; i < nums.length; i++) {
      if (arrayTarget != -1 || nums[i] > target)
        break;

      if (nums[i] == target)
        arrayTarget = i;
    }
    return arrayTarget;
  }

}
