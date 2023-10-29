package Produtos;

import java.util.Date;

public class UsedProduct extends Produto {

    private Date data;

    public UsedProduct(String name, Double price, Date data) {
        super(name, price);
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return name + "(used) $ " + price + " Manufatura date: " + getData();
    }
}
