package homework.interfaces;

import homework.Render;

public interface Health {
    default void HealthLevel(int currentHealthPoint, int maxHealthPoint) {
        System.out.printf(Render.setColor(currentHealthPoint, maxHealthPoint) +
                String.format("Текущий уровень здоровья: %d, максимальный уровень здоровья: %d\n", currentHealthPoint, maxHealthPoint) +
                Render.ANSI_RESET);
    }

    void isHealthLevel();
}
