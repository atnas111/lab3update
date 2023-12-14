package Worlds;

import Characters.Uncle;

import java.util.Objects;
import java.util.Random;
import Characters.Character;
public class FairyTaleWorld {
    private double[][] ground;
    private double[][] sky;

    public FairyTaleWorld (double[][] ground, double[][] sky){
        this.ground = ground;
        this.sky = sky;
    }

    public void addCharacter(Character character, int i, int j){
        Random random = new Random();
        i= random.nextInt(20);
        j= random.nextInt(20);
        ground[i][j]=1;
    }

    public void moveCharacter(Character character, int i, int j, int i1, int j1){
        Random random = new Random();
        i1= random.nextInt(20);
        j1= random.nextInt(20);
        ground[i+i1][j+j1]=1;
        ground[i][j]=0;
    }
    public void moveCharacterInSky(int i, int j, int i1, int j1){
        Random random = new Random();
        i1= random.nextInt(2);
        j1= random.nextInt(2);
        sky[i+i1][j+j1]=1;
        ground[i][j]=0;
    }
    public void ComeBackToWorld(Character character, int i, int j){
        Random random = new Random();
        i= random.nextInt(20);
        j= random.nextInt(20);
        ground[i][j]=1;
    }
}
