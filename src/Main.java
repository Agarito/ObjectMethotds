public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");
        basket.add("Bread",50,200,10);
        basket.print("Bread");
    }
}
