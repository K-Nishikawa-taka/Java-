import java.util.*; //データを受け取る機能を引き出す

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //変数scanにデータを受け取る機能を割り当てる
    String ship = scan.next(); //1行目を入力
    System.out.println(ship); //1行目を出力
    int ship_number = scan.nextInt();
    System.out.println("ship_number" * 10);
    System.out.println(ship + "は" + ship_number + "番艦です");
  }
}