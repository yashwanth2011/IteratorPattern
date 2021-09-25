import java.util.List;
import java.util.ArrayList;

public class SunblockLotionProducts implements Products {
    List<Product> products;

    public SunblockLotionProducts() {

        products = new ArrayList<Product>();

        addItem("DMDM Lotion",
                "developed with latest technology for high protection from UV radation", false, 2.69);
        addItem("Saffron Lotion",
                "Rich minerals preseve natural glow while protecting you", true, 6.69);
        addItem("Parabens Lotion",
                "A scientific mixture of butylparaben, isobutylparaben, methylparaben, propylparaben", false, 1.69);
        addItem("Cocunut Lotion",
                "Lotion with Refreshing carribean essence.",
                true, 2.69);
    }

    public void addItem(String name, String description, boolean isNatural, double price) {
        Product product = new Product(name, description, isNatural, price);
        products.add(product);
    }

    public Iterator createIterator() {
        return new SunblockLotionProductsIterator(products);

    }
}

