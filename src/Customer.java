import java.util.Objects;

public class Customer {
    String name;
    SuperMarket superMarket;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", superMarket=" + superMarket +
                '}';
    }

    public Customer(String name) {
        this.name = name;
    }

    public void goToSuperMarket(SuperMarket superMarket){

        this.superMarket = superMarket;
    }

    public void buyItems(String productName, int amount) {
        if (this.superMarket == null) {
            IO.println("Select a supermarket to go to first");
            return;
        }
        for (Product product : superMarket.products) {
            if (productName.equalsIgnoreCase(product.name)) {
                superMarket.buyItem(product, amount);
                return;
            }
        }
        IO.println(superMarket + " does not sell " + productName);



//        else if (productName.equals("bread")) {
//            superMarket.buyBread(amount);
//        } else if (productName.equals("fruit")) {
//            superMarket.buyFruit(amount);
//        } else if (productName.equals("cheese")) {
//            superMarket.buyCheese(amount);
//        } else if (productName.equals("toilet paper")) {
//            superMarket.buyToiletPaper(amount);
//        } else {
//            IO.println("We do not sell this item");
//        }
    }
}

