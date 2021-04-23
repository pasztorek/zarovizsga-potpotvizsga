package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.*;

public class UniqueFinder {

    public List<Character> uniqueChars (String input){
        if(input == null){
            throw new IllegalArgumentException();

        }
        List<Character> result = new ArrayList<>();
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for(int i=0; i<input.length(); i++) {
            chars.put(input.charAt(i),1);
        }

        for(Map.Entry<Character,Integer> chr: chars.entrySet() ){
            result.add(chr.getKey());
        }
            return result;
    }
}
