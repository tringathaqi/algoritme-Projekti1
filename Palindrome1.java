public class Palindrome1{
  public static boolean isPalindrom(String str) {
    long startTime = System.nanoTime();
    boolean palindrome = str.equals(new StringBuilder(str).reverse().toString());
    long endTime = System.nanoTime();
    long time = endTime - startTime;
    
    System.out.println(time);

    return palindrome;
  }
  public static void main(String[] args){
    System.out.print(isPalindrom("madam") ? "Po, kjo fjalë është Palindrom" : "Jo, nuk është Palindrom");
  }
}
