import java.util.*; //データを受け取る機能を引き出す

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //変数scanにデータを受け取る機能を割り当てる
    int ship_number = scan.nextInt();
    System.out.println(ship_number);

    for (int i = 0; i < ship_number; i++) {
      String ship = scan.next();
      System.out.println("Hello " + ship);
    }

  }
}