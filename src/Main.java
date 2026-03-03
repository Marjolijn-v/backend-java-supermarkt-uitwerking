void main() {

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


    SuperMarket halbert = new SuperMarket("halbert eijn", productsHalbert);
    SuperMarket dumbo = new SuperMarket("dumbo", productsDumbo);
    SuperMarket caldi = new SuperMarket("caldi", productsCaldi);

    Map<String, SuperMarket> superMarketMap = new HashMap<>();
    superMarketMap.put("halbert eijn", halbert);
    superMarketMap.put("dumbo", dumbo);
    superMarketMap.put("caldi", caldi);


//    SuperMarket superMarket = new SuperMarket();
    Customer customer = new Customer("Piet");



    while (true){
        IO.println("\nWhat do you want to do?");
        IO.println("1 - Pick a supermarket");
        IO.println("2 - buy a product");
        IO.println("3 - restock a product");
        IO.println("4 - exit");
        int choice = Integer.parseInt(IO.readln());

        switch(choice){
            case 1:
                IO.println("Which supermarket do you want to go to?");
                IO.println("Pick one of the following:");
                IO.println("- Halbert Eijn");
                IO.println("- Dumbo");
                IO.println("- Caldi");
                String superMarketChoice = IO.readln().toLowerCase();
                SuperMarket chosen = superMarketMap.get(superMarketChoice);

                if (chosen == null) {
                    IO.println(superMarketChoice + " is not an option. Try again.");
                } else {
                    customer.goToSuperMarket(chosen);
                }
                break;
            case 2:
                if(customer.superMarket == null) {
                    IO.println("Pick a supermarket first.");
                    break;
                } else {
                    String productName = IO.readln("Which product do you want to buy?");
                    int amount = Integer.parseInt(IO.readln("How many do you want to buy?"));
                    customer.buyItems(productName,amount);
                }
                break;
            case 3:
                IO.println("Which supermarket do you want to restock?");
                IO.println("Pick one of the following:");
                IO.println("- Halbert Eijn");
                IO.println("- Dumbo");
                IO.println("- Caldi");
                superMarketChoice = IO.readln().toLowerCase();
                chosen = superMarketMap.get(superMarketChoice);

                if (chosen == null) {
                    IO.println(superMarketChoice + " is not an option. Try again.");
                } else {
                    String productName = IO.readln("Which product do you want to restock in " + chosen.name);
                    int amount = Integer.parseInt(IO.readln("How many do you want to add?"));
                    chosen.restockItem(productName,amount);
                }
                break;
            case 4:
                IO.println("Thank you and Goodbye!");
                return;
            default:
                IO.println("Invalid input");
                break;

        }
    }
}
