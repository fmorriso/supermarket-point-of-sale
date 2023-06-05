public class Item
{
    String SKU;
    String name;
    PricingMethod pricingMethod;
    double unitPrice;

    public Item(String name, String SKU, PricingMethod pricingMethod, double unitPrice){
        this.name = name;
        this.SKU = SKU;
        this.pricingMethod = pricingMethod;
        this.unitPrice = unitPrice;
    }

    private Item() {/* prevent uninitialized instances */}

    @Override
    public String toString()
    {
        return "Item{" +
                "SKU='" + SKU + '\'' +
                ", name='" + name + '\'' +
                ", pricingMethod=" + pricingMethod +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
