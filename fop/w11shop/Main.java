package fop.w11shop;

public class Main {
    public static void main(String[] args) {
        BookShop shop = new BookShop();
        shop.addBooksInStore(5000);

        Customer peter = new Customer("Peter", shop);
        Customer paul = new Customer("Pauls", shop);

        paul.start();
        peter.start();

        try {
            peter.join();
            paul.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        shop.printSummary();
        peter.printSummary();
        paul.printSummary();
    }
}
