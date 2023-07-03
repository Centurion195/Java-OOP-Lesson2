package homework.interfaces;

import homework.Render;

public interface Mana {
    default void ManaLevel(int currentManaPoint, int maxManaPoint) {
        System.out.printf(Render.setColor(currentManaPoint, maxManaPoint) +
                String.format("Текущее количество магической энергии: %d, максимально количество магический энергии: %d\n",
                        currentManaPoint, maxManaPoint) +
                Render.ANSI_RESET);
    }
    void isManaLevel();
}
