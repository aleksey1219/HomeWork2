public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Решение задачи 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper);
    }

    public static void task2() {
        System.out.println("Решение задачи 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        cat = cat + 4;
        paper = paper + 4;
        dog = dog + 4;
        System.out.println(dog + "\n" + cat + "\n" + paper);
    }

}