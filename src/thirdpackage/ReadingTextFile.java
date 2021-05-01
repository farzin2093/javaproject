package thirdpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile {
    public static void main(String[] args) {

        String tempContainer;
        String finalContainer = "";

        try {
            FileReader fileReader = new FileReader("src/thirdpackage/data.text");
            BufferedReader bufferReader = new BufferedReader(fileReader);
            while ((tempContainer = bufferReader.readLine()) != null) {
                if (finalContainer.equals("")) {
                    finalContainer = finalContainer + tempContainer;
                } else {
                    finalContainer = finalContainer + "\n" + tempContainer;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();


        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println(finalContainer);


    }

}

