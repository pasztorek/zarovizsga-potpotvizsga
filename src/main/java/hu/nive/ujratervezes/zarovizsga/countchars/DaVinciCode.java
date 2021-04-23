package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {


    public int encode(String file, Character chr){

        if(chr!='1' && chr!='0' && chr !='x'){
            throw new IllegalArgumentException();
        }

        String line = "";
        int sum = 0;


        try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {

            while ((line = reader.readLine()) != null) {

               for(int i=0; i<line.length(); i++){

                   if(line.charAt(i)==chr){
                   sum++;

                   }

               }

            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);

        }

        return sum;
    }
}
