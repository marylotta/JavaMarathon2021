package day11.task2;

public class Magician extends Hero implements MagicAttack {
    int magicAtt = 20;

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackMagic = magicAtt * (1 - hero.magicDef);
        if (hero.health - attackMagic < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackMagic;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}