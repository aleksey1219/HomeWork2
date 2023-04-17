public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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

    public static void task3() {
        System.out.println("Решение задачи 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        cat = cat - 1.6;
        paper = paper - 7639;
        dog = dog - 3.5;
        System.out.println(dog + "\n" + cat + "\n" + paper);
    }

    public static void task4() {
        System.out.println("Решение задачи 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 2;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Решение задачи 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Решение задачи 6");
        var sprotsmen1 = 78.2;
        var sportsmen2 = 82.7;
        var vesDvoix = sprotsmen1 + sportsmen2;
        System.out.println("Общий вес двух бойцов " + vesDvoix);
        var raznica = sportsmen2 - sprotsmen1;
        System.out.println("разница в вессе " + raznica);
    }

    public static void task7() {
        System.out.println("Решение задачи 7");
        var sprotsmen1 = 78.2;
        var sportsmen2 = 82.7;
        var raznica1 = sportsmen2 - sprotsmen1;
        var raznica2 = sportsmen2 % sprotsmen1;
        System.out.println(raznica2);
    }

    public static void task8() {
        System.out.println("Решение задачи 8");
        var time = 640;
        var workingHours = 8;
        var worker = time / workingHours;
        System.out.println("Всего работников в компании - " + worker + " человек");
        worker = worker + 94;
        workingHours = time / worker;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + workingHours + " часов работы может быть поделено между сотрудниками");
    }
}