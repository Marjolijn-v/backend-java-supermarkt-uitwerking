import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
//    Product bread;
//    Product fruit;
//    Product toiletPaper;
//    Product cheese;
//    Product product;

    List<Product> products;
    String name;



    public SuperMarket(String name, List<Product> products) {
//        this.bread = bread;
//        this.fruit = fruit;
//        this.toiletPaper = toiletPaper;
//        this.cheese = cheese;
        this.name = name;

        if ( products != null) {
            this.products = products;
        } else {
            this.products = new ArrayList<>();
        }
    }

//    public void setProduct(Product product) { this.product = product; }

    public void buyItem(Product product, int amount) {
        if (amount <= product.amount ) {
            product.amount = product.amount - amount;
            IO.println("You bought " + amount + " " + product.name + " for €" + (amount * product.price));
        } else {
            IO.println("You cannot buy " + amount + " " + product.name + ", we only have " + product.amount + " " + product.name + " in stock.");
        }
    }

    public void restockItem(String productName, int amount){
        for (Product product : this.products){
            if (product.name.equalsIgnoreCase(productName)){
                product.amount += amount;
                return;
            } else {
                IO.println("Something went wrong, can't restock this item.");
            }
        }
    }

//    public void buyBread(int amount) {
//        buyItem(this.bread, amount);
//    }
//
//    public void buyFruit(int amount) {
//        buyItem(this.fruit, amount);
//    }
//
//    public void buyCheese(int amount) {
//        buyItem(this.cheese, amount);
//    }
//
//    public void buyToiletPaper(int amount) {
//        buyItem(this.toiletPaper, amount);
//    }
}
