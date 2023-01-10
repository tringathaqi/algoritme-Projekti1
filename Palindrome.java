public class Palindrome{
  public static boolean isPalindrome1(String str) {
    long startTime = System.nanoTime();
    boolean palindrome = str.equals(new StringBuilder(str).reverse().toString());
    long endTime = System.nanoTime();
    long time = endTime - startTime;
    System.out.println(time);

    return palindrome;
  }
  public static boolean isPalindrome2(String str) {
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
  public static boolean isPalindrome3(String str) {
    long startTime = System.nanoTime();
    int n = str.length();
    for (int i = 0; i < n/2; ++i) {
      if (str.charAt(i) != str.charAt(n-i-1)) return false;
    }
    long endTime = System.nanoTime();
    long time = endTime - startTime;
    System.out.println(time);

    return true;
  }
  public static void main(String[] args){
    System.out.print("Rasti i pare \nKoha: ");
    System.out.println(isPalindrome1("madam") ? "Po, kjo fjalë është Palindrom" : "Jo, nuk është Palindrom");
    System.out.println("\n");
    System.out.print("Rasti i dyte \nKoha: ");
    System.out.println(isPalindrome2("madam") ? "Po, kjo fjalë është Palindrom" : "Jo, nuk është Palindrom");
    System.out.println("\n");
    System.out.print("Rasti i trete apo algoritmi i permiresuar \nKoha: ");
    System.out.println(isPalindrome3("madam") ? "Po, kjo fjalë është Palindrom" : "Jo, nuk është Palindrom");
  }
}
