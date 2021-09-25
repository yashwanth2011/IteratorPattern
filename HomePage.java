public class HomePage {
    public static void main(String[] args) {
        Products sunblockLotionProducts = new SunblockLotionProducts();
        Products sunblockCreamProducts = new SunblockCreamProducts();

        ProductsHandler productsHandler = new ProductsHandler(sunblockLotionProducts, sunblockCreamProducts);

        //If user wants to see full list of products this method will be executed
        productsHandler.displayProducts();

        //If user wants to only see Natural products this method will be executes
        productsHandler.displayNaturalProducts();


    }
}