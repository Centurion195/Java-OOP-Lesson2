package homework.characters;

import homework.interfaces.Health;

public class Building implements Health {

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    @Override
    public void isHealthLevel() {
        Health.super.HealthLevel(currentHealthPoint, maxHealthPoint);
    }
}
