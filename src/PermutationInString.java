import javax.lang.model.util.ElementScanner14;

public class PermutationInString {
  public static void main(String[] args) {
    System.out.println(PermutationInString.HasPermutation(args[0], args[1]));
  }

  public static boolean HasPermutation(String s1, String s2) {
    int[] sorted = new int[s2.length()];

    /*
     * Steps
     * sort all s2 into a 0:s1 int array
     * check if any int's inside array are some pattern of s1
     */

    for (int i = 0; i < s1.length(); i++) {
      for (int j = 0; j < s2.length(); j++) {
        if (s2.charAt(j) == s1.charAt(i))
          sorted[j] = i + 1;
      }
    }

    int prevRecord = 0;
    for (int i = 0; i < sorted.length; i++) {
      System.out.print(sorted[i]);
      
    }
    System.out.println();
    return (prevRecord >= s1.length());
  }
}
