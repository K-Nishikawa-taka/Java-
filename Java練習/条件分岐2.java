import java.util.*; //データを受け取る機能を引き出す

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //変数scanにデータを受け取る機能を割り当てる
    String ship = scan.next();
    System.out.println("Hello " + ship);

    if (ship.equals("涼月")) {
      System.out.println("3番艦");
    } else if (ship.equals("冬月")) {
      System.out.println("8番艦");
    } else {
      System.out.println("誰や");
    }

  }
}