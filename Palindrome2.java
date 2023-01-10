public class Palindrome2{
  public static boolean isPalindrom(String str) {
    long startTime = System.nanoTime();
    int n = str.length();
    for (int i = 0; i < n; ++i) {
      if (str.charAt(i) != str.charAt(n-i-1)) return false;
    }
    long endTime = System.nanoTime();
    long time = endTime - startTime;
    System.out.println(time);
    return true;
  }
  public static void main(String[] args){
     System.out.print(isPalindrom("madam") ? "Po, kjo fjalë është Palindrom" : "Jo, nuk është Palindrom");
  }
}
