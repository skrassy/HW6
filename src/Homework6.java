public class Homework6 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Пушок"),
                new Cat("Барсик"),
                new Dog("Дружок"),
                new Dog("Рекс")
        };

        animals[0].run(120);
        animals[1].run(180);
        animals[2].run(340);
        animals[3].run(650);

        animals[0].swim(4);
        animals[1].swim(12);
        animals[2].swim(15);
        animals[3].swim(8);

        int countCat = 0;
        int countDog = 0;
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                countCat++;
            } else if (animal instanceof Dog) {
                countDog++;
            } else {
                System.out.println("Кошек и собак нет!");
            }
        }
        System.out.println("Всего кошек: " + countCat);
        System.out.println("Всего собак: " + countDog);

    }
}
