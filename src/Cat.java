public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " метров!");
        } else {
            System.out.println("Ошибка! Кошка не может пробежать больше 200 метров!");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошка не умеет плавать!");

    }
}
