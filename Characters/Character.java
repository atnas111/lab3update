package Characters;

import Enums.Gender;

import java.util.Objects;

public class Character extends AbstaractCharacter{

    private String name;
    private Gender gender;
    private double weight;
    private double height;

    public Character (String name, Gender gender, double weight, double height) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public Gender getGender(){
        return gender;
    }

    public void setGender(){
        this.gender = gender;
    }

    public Double getWeight(){
        return weight;
    }

    public void setWeight(){
        this.weight = weight;
    }

    public Double getHeight(){
        return weight;
    }

    public void setHeight(){
        this.height = height;
    }

    public boolean isMale() {
        return gender == Gender.MALE;
    }


    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String pronunciation() {
        return isMale() ? "его" : "её";
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
        Character character = (Character) object;
        return Objects.equals(name, character.name);
    }

    @Override
    public String toString() {
        return name;
    }


}
