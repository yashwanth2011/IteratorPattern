public class ProductsHandler {
    Products sunblockLotionProducts, sunblockCreamProducts;

    public ProductsHandler(Products sunblockLotionProducts, Products sunblockCreamProducts) {
        this.sunblockLotionProducts = sunblockLotionProducts;
        this.sunblockCreamProducts = sunblockCreamProducts;
    }

    public void displayProducts() {
        Iterator sunblockLotionProductsIterator = sunblockLotionProducts.createIterator();
        Iterator sunblockCreamProductsIterator = sunblockCreamProducts.createIterator();

        System.out.println("These are our products\n-------------------------\nLOTIONS");
        displayProducts(sunblockLotionProductsIterator);
        System.out.println("\nCREAMS");
        displayProducts(sunblockCreamProductsIterator);

    }

    private void displayProducts(Iterator iterator) {
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if(product == null){
                break;
            }
            System.out.print(product.getName() + ", ");
            System.out.print(product.getPrice() + " -- ");
            System.out.println(product.getDescription());


        }
    }

    public void displayNaturalProducts() {
        Iterator sunblockLotionProductsIterator = sunblockLotionProducts.createIterator();
        Iterator sunblockCreamProductsIterator = sunblockCreamProducts.createIterator();

        System.out.println("\n-------Displaying products made out of natural materials---------\n");
        displayNaturalProducts(sunblockLotionProducts.createIterator());
        displayNaturalProducts(sunblockCreamProducts.createIterator());
    }

    private void displayNaturalProducts(Iterator iterator) {
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if(product == null){
                break;
            }
            if (product.isNatural()) {
                System.out.print(product.getName());
                System.out.print("\t" + product.getPrice());
                System.out.print("\t" + product.getDescription() + "\n");
            }
        }
    }

    /*Product Handler can be extended further with features like
     *filtering the products based on price, Manufacturing location, etc..,
     */
}
