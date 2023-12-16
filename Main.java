import Characters.*;
import Enums.*;
import Worlds.FairyTaleWorld;


public class Main {
    public static void main(String args[]) {
        Uncle uncle = new Uncle("Дядя Юлиус", Gender.MALE, 70, 185, HappinessLevels.DEFAULT.getHappinessLevel(), Marriagestatus.SINGLE);
        PropellerMan carlson = new PropellerMan("Карлсон", Gender.MALE, 50, 140, 0);
        Witch witch = new Witch("ведьма", Gender.FEMALE, 62, 167, 0);
        Princess princess = new Princess("Принцесса", Gender.FEMALE, 57, 160, Marriagestatus.SINGLE);
        String[][] ground = new String[10][10];
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                ground[i][j]="";
            }
        }
        String[][] sky = new String[10][10];
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                sky[i][j]="";
            }
        }
        FairyTaleWorld fairyTaleWorld = new FairyTaleWorld(ground, sky);
        uncle.thankTo(carlson, uncle);
        uncle.beHappy(Day.YESTERDAY);
        uncle.beHappy(Day.TODAY);
        uncle.goToWorld(Time.NOW, fairyTaleWorld, uncle);
        witch.flyPastTheWindow(fairyTaleWorld, witch);
        uncle.beAfraid(witch);
        uncle.goToWorld(Time.FUTURE, fairyTaleWorld, uncle);
        princess.beConquered(uncle, princess);
        princess.beMarriaged(uncle);
    }
}