package estoque;

public class Product {

    public String name;
    public double price;
    public int quant;

    public double totalValueStock() {
        return price * quant;
    }

    public void addProducts(int quant) {
        this.quant += quant;
    }

    public void removeProducts(int quant) {
        this.quant -= quant;
    }
}
