package lms;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Shark(), new Turtle(), new Eagle(), new Eagle()};
        for (Animal animal : animals) {
            animal.action();
        }
        System.out.println("__________________");

        Shark[] sharks = new Shark[animals.length];
        Turtle[] turtles = new Turtle[animals.length];
        Eagle[] eagles = new Eagle[animals.length];

        int sharkIndex = 0;
        int turtleIndex = 0;
        int eagleIndex = 0;


        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                System.out.println("Instanceof Shark: true");
                if (animal.getClass() == Shark.class) {
                    sharks[sharkIndex++] = (Shark) animal;
                    System.out.println("getClass() is Shark: true");
                }
            } else if (animal instanceof Turtle) {
                System.out.println("Instanceof Turtle: true");
                if (animal.getClass() == Turtle.class) {
                    turtles[turtleIndex++] = (Turtle) animal;
                    System.out.println("getClass() is Turtle: true");
                }
            } else if (animal instanceof Eagle) {
                System.out.println("Instanceof Eagle: true");
                if (animal.getClass() == Eagle.class) {
                    eagles[eagleIndex++] = (Eagle) animal;
                    System.out.println("getClass() is Eagle: true");
                }
            }
        }
        System.out.println("-------------------");


        System.out.println("Number of Sharks: " + sharkIndex);
        System.out.println("Number of Turtles: " + turtleIndex);
        System.out.println("Number of Eagles: " + eagleIndex);
    }
}//Создайте класс lms.Animal с одним методом которые есть 3 наследника такие как
//Shark, с методом attack(), Turtle с методом swim(), Eagle с методом fly().
//Создайте массив используя lms.Animal и положите туда всех наследников.
//Используя instanceOf и getClass() вызовите свои методы животных из массива lms.Animal.
//Для каждого объекта по отдельности создайте массив и разделите животных из lms.Animal massiva и
// положите в свои массивы.