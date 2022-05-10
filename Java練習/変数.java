import java.util.*; //データを受け取る機能を引き出す

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //変数scanにデータを受け取る機能を割り当てる
    String ship = scan.next(); //scanが持っているメソッドnext(データ入力)を引き出して入力文字列を変数shipに代入
    //System.out.println(ship);
    System.out.println("Hello " + ship); //println内の文字列と入力文字列は連結できる
  }
}