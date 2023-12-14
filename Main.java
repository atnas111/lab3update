import Characters.*;
import Enums.*;
import Worlds.FairyTaleWorld;


public class Main {
    public static void main(String args[]) {
        Uncle uncle = new Uncle("Дядя Юлиус", Gender.MALE, 70, 185, HappinessLevels.DEFAULT.getHappinessLevel(), Marriagestatus.SINGLE);
        PropellerMan carlson = new PropellerMan("Карлсон", Gender.MALE, 50, 140, 0);
        Witch witch = new Witch("ведьма", Gender.FEMALE, 62, 167, 0);
        Princess princess = new Princess("Принцесса", Gender.FEMALE, 57, 160, Marriagestatus.MARRIED);
        double[][] ground = new double[20][20];
        for(double i=0; i<20; i++){
            for(double j=0; j<20; j++){
                ground[(int) i][(int) j]=0;
            }
        }
        double[][] sky = new double[20][20];
        for(double i=0; i<20; i++){
            for(double j=0; j<20; j++){
                sky[(int) i][(int) j]=0;
            }
        }
        FairyTaleWorld fairyTaleWorld = new FairyTaleWorld(ground, sky);
        uncle.thankTo(carlson);
        uncle.beHappy(Day.YESTERDAY);
        uncle.beHappy(Day.TODAY);
        uncle.goToWorld(Time.NOW, fairyTaleWorld, uncle);
        uncle.beAfraid(witch);
        witch.flyPastTheWindow(fairyTaleWorld);
        uncle.goToWorld(Time.FUTURE, fairyTaleWorld, uncle);
        princess.beConquered(uncle);
        princess.beMarriaged(uncle);

    }
}