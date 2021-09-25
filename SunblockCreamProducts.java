public class SunblockCreamProducts implements Products {
    static final int NUMBER_OF_VARITIES = 6;
    int count = 0;
    Product[] products;

    public SunblockCreamProducts() {
        products = new Product[NUMBER_OF_VARITIES];

        addItem("Turmeric Cream",
                "Made out of raw turmeric and Milk", true, 3.69);
        addItem("Sandalwood cream",
                "Magic of Sandal and Besan", true, 6.69);
        addItem("Aloevera cream",
                "Protection Aloevera all over your body", true, 2.69);
        addItem("ZincOxide cream",
                "This is a perfect mixture of unharmful chemicals at your service",
                false, 1.69);

    }

    public void addItem(String name, String description, boolean isNatural, double price) {
        Product product = new Product(name, description, isNatural, price);
        if (count >= NUMBER_OF_VARITIES) {
            System.err.println("Sorry, can't add a new one. We are supporting only" + NUMBER_OF_VARITIES + "Varities of SunBlock creams.");
        } else {
            products[count] = product;
            count++;
        }
    }

    public Iterator createIterator() {
        return new SunblockCreamProductsIterator(products);

    }
}

