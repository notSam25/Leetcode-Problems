import javax.lang.model.util.ElementScanner14;

public class FirstBadVersion {
  public static void main(String[] args) {
    System.out.println(FirstBadVersion.firstBadVersion(2, 2));
  }

  public static boolean isBadVersion(int version, int badVersion) {
    return version == badVersion ? false : true;
  }

  public static int firstBadVersion(int n, int badVersion) {

    int low = 1, high = n, mid;
    while (low < high) {
      mid = low + (high - low) / 2;
      if (isBadVersion(mid, badVersion)) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }
}