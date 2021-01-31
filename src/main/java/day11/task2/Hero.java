package day11.task2;

public abstract class Hero implements PhysAttack {

    final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;
    int health;
    int physAtt;
    double magicDef;
    double physDef;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackPhys = physAtt * (1 - hero.physDef);
        if (hero.health - attackPhys < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackPhys;
        }
    }
}