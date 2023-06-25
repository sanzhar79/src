package kg.geeks.game.players;

import java.util.Random;

public class Witcher extends Hero {

    private boolean canRevive;
    private Random random;

    public Witcher(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, ability, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
    public boolean isCanRevive(){
        return canRevive;
    }

        }


