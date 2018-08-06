package Attraction;

import Interfaces.ISecurity;
import Visitor.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        if ((visitor.getAge() < 12) || (visitor.getHeight() < 145)){
            return false;
        }
        return true;
    }
}
