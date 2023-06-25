package kg.geeks.game.players;

public class Magic extends Hero {


    public Magic(int health, int damage, String name) {

        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int boostHeroes=3;
        for (int i = 0; i < getDamage(); i++) {
        }for(Hero hero: heroes) {
            int newDamage = hero.getDamage() + boostHeroes;
            hero.setDamage(newDamage);
            System.out.println(hero.getName()+ " получил новое значение атаки: " + newDamage);

        }
    }
}
