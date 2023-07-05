package Homework_s2;

public class Main {
    

    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealthPoint(50);
        render.showIndicator(building, "Здание");
        System.out.println();

        Hero hero = new Hero(100, 50);
        hero.setCurrentHealthPoint(100);
        hero.setCurrentManaPoint(50);
        render.showIndicator(hero, "Герой");
        System.out.println();

        Neutral neutral = new Neutral(100);
        neutral.setCurrentHealthPoint(80);
        render.showIndicator(neutral, "Нейтральный персонаж");
    }
}