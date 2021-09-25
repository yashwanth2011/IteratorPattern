public class SunblockCreamProductsIterator implements Iterator {
    Product[] products;
    int position = 0;

    public SunblockCreamProductsIterator (Product[] products){
        this.products = products;
    }

    public Product next() {
        return products[position++];
    }

    public boolean hasNext() {
        return products.length > position;
    }
}
