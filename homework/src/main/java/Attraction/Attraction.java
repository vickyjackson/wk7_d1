package Attraction;

public abstract class Attraction {

    String name;

    Attraction(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
