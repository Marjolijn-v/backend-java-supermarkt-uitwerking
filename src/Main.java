void main() {

    Product bread = new Product("Volkoren brood", 2.95f, 4);
    Product fruit = new Product("Sinaasappels", 3.50f, 2);
    Product cheese = new Product("Belegen kaas", 6.95f, 3);
    Product toiletPaper = new Product("Page toiletpapier", 7.50f, 6);

    SuperMarket superMarket = new SuperMarket(bread, fruit, toiletPaper,cheese);
    Customer customer = new Customer("Piet");

    String productName = IO.readln("Which product do you want to buy?");
    int amount = Integer.parseInt(IO.readln("How many do you want to buy?"));

    customer.goToSuperMarket(superMarket);
    customer.buyItems(productName,amount);
}
