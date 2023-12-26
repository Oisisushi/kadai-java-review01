
public class Review01 {

    public static void main(String[] args) {
        int price;
        //ここに税抜き額を記入する
        price = 1500;

        int result = tax(price);
        System.out.println
        (price + "円の商品の税込み価格は" + (result + price) + "円（消費税は" + result + "円）です。");

    }

    public static int tax(int price) {
        int tax;
        //ここに税率を整数で入力する
        tax = 10;

        int result = ((int)(price * ((double)tax / 100)));
        return result;
    }
}
