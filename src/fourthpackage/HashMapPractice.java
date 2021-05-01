package fourthpackage;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String,String> informationMap = new HashMap<>();
        informationMap.put("dbName","com.oracle");
        informationMap.put("dbUser","testUser");
        informationMap.put("dbPassword","com.oracle");

        System.out.println(informationMap);


    }
}
