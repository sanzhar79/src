package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

import java.util.Random;


public class Thor extends Hero {

    private boolean stunBoss;
    public boolean isStunBoss(){
        return stunBoss;
    }
    public Thor (int health, int damage, String name){
        super(health, damage, SuperAbility.STUN, name);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        double chance = Math.random();
                if (chance< 0.3){
                    stunBoss=true;
                    System.out.println("босс оглушен");
                }else{
                    stunBoss=false;
                    System.out.println("босс не оглушен");
                }
        }
}


