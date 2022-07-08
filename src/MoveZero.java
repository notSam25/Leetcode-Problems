import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZero {
  public static void main(String[] args) {
    int[] nums = {
        0, 0, 1, 3, 0, 12, 0, 0
    };
    MoveZero.moveZeros(nums);
  }

  public static void moveZeros(int[] nums) {

    // TODO: redo this solution. I must have been drunk when I made this...
    List<Integer> copy = Arrays.stream(nums).boxed().collect(Collectors.toList());
    int index = 0, totalZero = 0;
    while(index < copy.size()) {
      if(copy.get(index) == 0) {
        copy.remove(index);
        totalZero++;
        index--;
      }
      index++;
    }
    for(int i = 0; i < copy.size(); i++) {
      if(totalZero > 0) {
        copy.add(0);
        totalZero--;
      }
      nums[i] = copy.get(i);
    }

    for(int i = 0; i < nums.length; i++) {
      System.out.print(" " + nums[i]);
    }
  }
}