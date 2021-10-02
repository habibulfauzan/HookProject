import java.util.Locale;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Locale bahasa = new Locale("id");
    Scanner input = new Scanner(System.in);
    int harga = input.nextInt();
    int a = 80;
    int b = 90;
    
    System.out.println(a+b);
    
    System.out.printf(bahasa, "Rp%,d,-", harga);
    
  }
}
