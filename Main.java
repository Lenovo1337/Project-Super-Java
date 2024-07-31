public class Main {

    static double quota;
    static double price;
    private final static String CURRENCY = "UAH";


    public static void main(String[] args) {

        String str = "Product No 1: Smartphone";
        quota = 12000;
        price = 35.99;

        double cost = quota * price;
        quota = 2;
        price = 1000.99;

        double cost1 = quota * price;

        System.out.println(str);
        System.out.println("Total sales for 5 days is EUR:" + cost);
        System.out.println("sales by day is EUR:" + cost1);


    }
}
