package ch.serial.doors;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class Door8 {

    private List<String> products = new ArrayList<>();

    public void addProduct(String product) {
        products.add(product);
    }
}
