import java.util.*; //データを受け取る機能を引き出す

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //変数scanにデータを受け取る機能を割り当てる
    String ship1 = scan.next(); //1行目を入力
    String ship2 = scan.next(); //2行目を入力
    System.out.println(ship1); //1行目を出力
    System.out.println(ship2); //2行目を出力
  }
}