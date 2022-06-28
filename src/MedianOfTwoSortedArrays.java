import java.util.*;

import javax.lang.model.util.ElementScanner14;

class medianOfTwoSortedArrays {
  public static void main(String[] args) {
    final int arr1[] = {
      1, 2
    };
    int arr2[] = {
      3, 4, 9, 10
    };
    System.out.printf("findMedianSortedArrays -> [ %f ]\n", findMedianSortedArrays(arr1, arr2));
  }

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    double median = 0;
    List<Integer> array = new ArrayList<>();
    for(int i = 0; i < nums1.length; i++) {
      array.add(nums1[i]);
    }
    for(int i = 0; i < nums2.length; i++) {
      array.add(nums2[i]);
    }
    Collections.sort(array);

    int max = array.get(array.size() - 1);
    System.out.printf("%B\n", array.size() / 2);
    if(array.size() / 2 == 1) {
      //number is odd
        median = (double)array.get(max / 2);

    } else {
      //number is even
      double rightMiddle = (double)array.get(max / 2), leftMiddle = (double)array.get((max - 1) / 2);

      median = (leftMiddle + rightMiddle) / 2;
    }

    return median;
  }
}