package service;

import model.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneService {
    public List<SmartPhone> priceRange(List<SmartPhone> smartPhones, int minPrice, int maxPrice) {
        List<SmartPhone> result = new ArrayList<SmartPhone>();
        for (SmartPhone sm : smartPhones) {
            if (sm.getPrice() >= minPrice && sm.getPrice() <= maxPrice) {
                result.add(sm);
            }
        }
        return result;
    }
}
