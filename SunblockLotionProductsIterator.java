import java.util.List;

public class SunblockLotionProductsIterator implements Iterator {
    List<Product> products;
    int position = 0;

    public SunblockLotionProductsIterator (List<Product> products){
        this.products = products;
    }

    public Product next() {
        return products.get(position++);
    }

    public boolean hasNext() {
        return products.size() > position;
    }
}

