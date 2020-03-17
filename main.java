import java.util.Scanner;

public class Tabuada {

  public static void main(String[] args) {

    Scanner valor = new Scanner(System.in);
    int num, op;
    num = valor.nextInt();
    for (int i = 1; i < 10; ++i)
    System.out.println (num * i);
  }
}
