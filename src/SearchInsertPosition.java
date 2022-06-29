import javax.lang.model.util.ElementScanner14;

public class SearchInsertPosition {
  public static void main(String[] args) {
    int[] nums = {
      1, 3, 5, 6
    };
    System.out.println(SearchInsertPosition.solution(nums, 4));
  }

  public static int solution(int[] nums, int target) {
    int start = 0, mid = nums.length / 2, end = nums.length - 1;
    while(start <= end) {
        
      if(nums[mid] == target) 
          return mid;
          else if(nums[mid] > target) {
              end = mid - 1;
          }
          else
            start++;

          mid = (start + end) / 2;
    }
    return start;
  }
}