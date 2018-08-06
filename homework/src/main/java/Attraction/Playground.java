package Attraction;

import Interfaces.ISecurity;
import Visitor.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() > 15) {
            return false;
        }
        return true;
    }
}
