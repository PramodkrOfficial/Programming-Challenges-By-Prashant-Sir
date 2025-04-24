package in.kgcoding.challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("Thailand", "Bangkok");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Malaysia", "Kuala Lumpur");
        countryMap.put("Nepal", "Kathmandu");
        countryMap.put("Russia", "Moscow");

        Scanner scn =  new Scanner(System.in);
        System.out.print("Please enter the country name: ");
        String country = scn.next();
        if (countryMap.containsKey(country)) {
            System.out.printf("Capital of %s is %s", country, countryMap.get(country));
        } else {
            System.out.println("Sorry we don't know the capital");
        }
    }
}
