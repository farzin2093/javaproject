package fourthpackage;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> countryList = new ArrayList();
        countryList.add("USA");
        countryList.add("CANADA");
        countryList.add("MEXICO");
        countryList.add("CHINA");
        System.out.println(countryList);
        System.out.println(countryList.size());

        for(int i=0;i<countryList.size();i++){
            String country = countryList.get(i);
            System.out.println(country);
        }
    }
}
