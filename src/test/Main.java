package test;

import model.SmartPhone;
import service.SmartPhoneService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SmartPhone SamsungGalacyA50 = new SmartPhone("Samsung",
                "Galaxy A50",
                "Black",
                6.4f,
                4,
                64,
                4000,
                166,
                25,
                259
                );
        SmartPhone SamsungGalacyA70 = new SmartPhone("Samsung",
                "Galaxy A70",
                "Blue",
                6.7f,
                6,
                128,
                4500,
                183,
                32,
                329
        );
        SmartPhone xiaomiRedmiNote8Pro = new SmartPhone("Xiaomi",
                "Redmi Note 8 Pro",
                "Blue",
                6.53f,
                6,
                64,
                4500,
                200,
                64,
                230
        );
        SmartPhone appleIphone11 = new SmartPhone("Apple",
                "iPhone 11",
                "Black",
                6.1f,
                4,
                128,
                3110,
                194,
                12,
                770
        );

        List<SmartPhone> smartPhones = Arrays.asList(SamsungGalacyA50, SamsungGalacyA70, xiaomiRedmiNote8Pro, appleIphone11);
/*
        for(SmartPhone sm: smartPhones) {
            sm.printCharacteristics();
        }
*/
        SmartPhoneService service = new SmartPhoneService();
        List<SmartPhone> filtered = service.priceRange(smartPhones, 200, 260);
        for(SmartPhone sm: filtered) {
            sm.printCharacteristics();
        }
    }
}
