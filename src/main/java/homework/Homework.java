package homework;

import homework.characters.Building;
import homework.characters.Hero;
import homework.characters.Neutral;

public class Homework {

    public static void main(String[] args) {
        Render render = new Render();

        Building building1 = new Building(100);
        building1.setCurrentHealthPoint(50);

        Hero hero1 = new Hero(100, 100);
        hero1.setCurrentHealthPoint(19);
        hero1.setCurrentManaPoint(28);

        Neutral neutral1 = new Neutral(100);
        neutral1.setCurrentHealthPoint(93);

        System.out.println("Здание 1");
        render.showIndicator(building1); // В консоли должно быть примерно так: Текущий уровень здоровья: 50, максимальный уровень здоровья: 100
        System.out.println("Герой 1");
        render.showIndicator(hero1);
        System.out.println("Нейтральный 1");
        render.showIndicator(neutral1);
    }
}
