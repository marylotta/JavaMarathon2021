package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    int attackMagic = 15;

    static final int HEAL_SELF = 50;
    static final int HEAL_TEAMMATE = 30;

    public Shaman() {
        physAtt = 10;
        magicDef = 0.2;
        physDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_SELF;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAMMATE;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.health - attackMagic < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackMagic;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}