package Produtos ;

public class ImportedProduct extends Produto {

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;

    }
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double TotalPrice(Double customsFee){
        return getPrice()+ this.customsFee;
    }

    @Override
    public String toString() {
        return name + " $ " + TotalPrice(price) + " Custom Fee: " + getCustomsFee();
    }
}
