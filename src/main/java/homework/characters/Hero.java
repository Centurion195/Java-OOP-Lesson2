package homework.characters;

import homework.interfaces.Health;
import homework.interfaces.Mana;

public class Hero implements Health, Mana {

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    private int maxManaPoint; // максимально количество магический энергии
    private int currentManaPoint; // текущее количество магический энергии

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    @Override
    public void isHealthLevel() {
        Health.super.HealthLevel(currentHealthPoint, maxHealthPoint);
    }

    @Override
    public void isManaLevel() {
        Mana.super.ManaLevel(currentManaPoint, maxManaPoint);
    }
}
