package fourthpackage;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice2 {

    public static void main(String[] args) {

        //USA---NY,NJ,DC
        //Canada---CO,NH

        //HashMap<String, String> countryMap = new HashMap<>();

        ArrayList<String> listOfStateUSA = new ArrayList<>();
        listOfStateUSA.add("NY");
        listOfStateUSA.add("NJ");
        listOfStateUSA.add("DC");

        ArrayList<String> listOfStateCanada = new ArrayList<>();
        listOfStateCanada.add("CO");
        listOfStateCanada.add("NH");

        HashMap<String,ArrayList<String>> countryMap = new HashMap<>();
        countryMap.put("USA",listOfStateUSA);
        countryMap.put("Canada",listOfStateCanada);

        System.out.println(countryMap);
        System.out.println(countryMap.get("Canada"));
        System.out.println(countryMap.get("USA"));

        System.out.println("*****************");

        HashMap<String,Integer> cityAndZipUSA = new HashMap<>();
        cityAndZipUSA.put("RegoPark",11374);
        cityAndZipUSA.put("ForestHills",35356);

        HashMap<String,Integer> cityAndZipCANADA = new HashMap<>();
        cityAndZipCANADA.put("gjhjkjj",456);
        cityAndZipCANADA.put("Forestkjhj",54);

        ArrayList<HashMap<String,Integer>>cityAndZipCodes = new ArrayList<>();
        cityAndZipCodes.add(cityAndZipUSA);
        cityAndZipCodes.add(cityAndZipCANADA);
        System.out.println(cityAndZipCodes);



    }
}