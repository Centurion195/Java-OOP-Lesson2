package homework;

import homework.interfaces.Health;
import homework.interfaces.Mana;

public class Render {
    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void showIndicator(Object object) {
        if (object instanceof Health) {
            ((Health) object).isHealthLevel();
        }
        if (object instanceof Mana) {
            ((Mana) object).isManaLevel();
        }
    }

    public static String setColor(int n, int max) {
        if ((n / max * 100) < 20) {
            return ANSI_RED;
        } else if ((n / max * 100) < 40) {
            return ANSI_PURPLE;
        } else if ((n / max * 100) < 80) {
            return ANSI_YELLOW;
        } else if ((n / max * 100) <= 100) {
            return ANSI_GREEN;
        }
        return null;
    }
}
