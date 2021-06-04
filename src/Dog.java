public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " метров!");
        } else {
            System.out.println("Ошибка! Собака не может пробежать больше 500 метров!");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " метров!");
        } else {
            System.out.println("Ошибка! Собака не может проплыть больше 10 метров!");
        }
    }
}
