package Characters;

import Activity.Actions;
import Enums.Gender;
import Enums.HappinessLevels;
import Interfaces.Flyable;
import Worlds.FairyTaleWorld;

import java.util.Objects;

public class Witch extends Character implements Flyable {
    private String name;
    private int flyheight;
    public Witch(String name, Gender gender, double weight, double height){
        super(name, gender, weight, height);
    }
    public Witch(String name, Gender gender, double weight, double height, int flyheight){
        super(name, gender, weight, height);
        this.flyheight = flyheight;
    }
    @Override
    public void fly(int flyheight) {
        this.flyheight = 10;
        System.out.println("пролетает ведьма");
    }
    public void flyPastTheWindow(FairyTaleWorld fairyTaleWorld){
        fairyTaleWorld.moveCharacterInSky(10, 10, 0, 0);
        flyheight+=2;
        System.out.print("мимо окна пролетает ведьма"+", это он "+ Actions.DONTDENY.getDescription()+", но... ");
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (this.getClass()!=object.getClass()){
            return false;
        }
        Witch witch = (Witch) object;
        return Objects.equals(name, witch.name);
    }

    @Override
    public String toString() {
        return name;
    }
    public int getFlyheight(){
        return flyheight;
    }
}
