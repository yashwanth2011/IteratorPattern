class Product {
    String name;
    String description;
    boolean natural;
    double price;

    public Product(String name,
                   String description,
                   boolean natural,
                   double price)
    {
        this.name = name;
        this.description = description;
        this.natural = natural;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isNatural() {
        return natural;
    }
    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }
}

