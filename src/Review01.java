
public class Review01 {

    public static void main(String[] args) {
        /*ここでは商品の税抜き金額の変数定義とtaxメソッドの呼び出し、
         そして戻り値とその合計金額を表示するコードを書く*/
        int price;
        //ここに税抜き額を記入
        price = 1500;
        int result = consumptionTax(price);
        System.out.println(result + price);

    }

    public static int consumptionTax(int price) {
        //こっちでは商品代金を引数に、税額を戻り値にするコードを書く
        //ここに税率を整数で入力
        int tax = 10;
        int result = ((int)(price * ((double)tax / 100)));
        return result;
    }
}
