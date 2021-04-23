package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

        private List<Fish> Fishes = new ArrayList<>();


   public List<String> getStatus(){
       List<String> result = new ArrayList<>();

       for(Fish fish: Fishes){
           result.add(fish.getName() + ", weight: "+ fish.weight+", color: " + fish.getColor() + ", short term memory loss: " + fish.hasMemoryloss);

       }
       return result;
   }

   public void addFish(Fish fish){
        Fishes.add(fish);

   }

   public void removeFish() {

       for (Iterator<Fish> i = Fishes.iterator(); i.hasNext();) {
           Fish fish = i.next();
           if (fish.getWeight() >= 11) {
                i.remove();
           }

       }
   }

   public void feed(){
       for(Fish fish: Fishes){
           fish.feed();
       }

   }

}
