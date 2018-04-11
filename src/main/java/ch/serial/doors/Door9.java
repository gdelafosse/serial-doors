package ch.serial.doors;

import javax.ejb.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class Door9 {

    private Map<String, Integer> products = new HashMap<>();

    @Lock(LockType.READ)
    public void addProduct(String product) {
        int count = 0;
        if (products.containsKey(product)) {
            count = products.get(product) + 1;
        }
        products.put(product, count);
    }
}
