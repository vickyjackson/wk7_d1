package Stall;

import Interfaces.ISecurity;
import Visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() < 18){
            return false;
        }
        return true;
    }
}
