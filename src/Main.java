void main() {

//    Product bread = new Product("Volkoren brood", 2.95f, 4);
//    Product fruit = new Product("Sinaasappels", 3.50f, 2);
//    Product cheese = new Product("Belegen kaas", 6.95f, 3);
//    Product toiletPaper = new Product("Page toiletpapier", 7.50f, 6);
List<Product> productsHalbert = new ArrayList<>();
productsHalbert.add(new Product("bread", 2.95f, 4));
productsHalbert.add(new Product("fruit", 3.50f, 2));
productsHalbert.add(new Product("cheese", 6.95f, 3));
productsHalbert.add(new Product("toilet paper", 7.50f, 6));

List<Product> productsDumbo = new ArrayList<>();
    productsDumbo.add(new Product("bread", 2.00f, 10));
    productsDumbo.add(new Product("fruit", 3.75f, 15));
    productsDumbo.add(new Product("cheese", 6.50f, 5));
    productsDumbo.add(new Product("toilet paper", 6.50f, 4));

List<Product> productsCaldi = new ArrayList<>();
    productsCaldi.add(new Product("bread", 1.95f, 8));
    productsCaldi.add(new Product("fruit", 2.50f, 10));
    productsCaldi.add(new Product("cheese", 5.95f, 6));
    productsCaldi.add(new Product("toilet paper", 5.50f, 10));


SuperMarket halbert = new SuperMarket("Halbert Eijn", productsHalbert);
SuperMarket Dumbo = new SuperMarket("Dumbo", productsDumbo);
SuperMarket Caldi = new SuperMarket("Caldi", productsCaldi);

Map<String, List<Product>> superMarket = new HashMap<>();
superMarket.put("Halbert Eijn", productsHalbert);
superMarket.put("Dumbo", productsDumbo);
superMarket.put("Caldi", productsCaldi);


//    SuperMarket superMarket = new SuperMarket();
    Customer customer = new Customer("Piet");

    String productName = IO.readln("Which product do you want to buy?");
    int amount = Integer.parseInt(IO.readln("How many do you want to buy?"));

    customer.goToSuperMarket(superMarket);
    customer.buyItems(productName,amount);
}
