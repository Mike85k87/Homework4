public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Task 1");
        int age = 17; // Возраст человека
        if (age>=18){
            System.out.println("Если возраст человека равен "+age+
                    ", то он совершеннолетний");}
        else {
            System.out.println("Если возраст человека равен "+age+
                ", то он не достиг совершеннолетия, нужно немного подождать");}

        // Задача 2
        System.out.println("Task 2");
        int temp = 12; // Значение введеной температуры
        if (temp>=5){
            System.out.println("На улице "+temp+" градусов, можно идти без шапки");}
        else {
            System.out.println("На улице "+temp+" градусов, нужно надеть шапку");}

        // Задача 3
        System.out.println("Task 3");
        int score = 55; // Значение введеной скорости движения
        if (score>60) {
            System.out.println("Если скорость "+score+", то придется заплатить штраф");}
        else {
            System.out.println("Если скорость "+score+", то можно ездить спокойно");}

        // Задача 4
        System.out.println("Task 4");
        int ageMan = 55; // Возраст человека
        if (ageMan >= 2 && ageMan <= 6) {
            System.out.println("Если возраст человека равен "+ageMan+", " +
                    "то ему нужно ходить в детский сад");}
        else if (ageMan >= 7 && ageMan <= 17) {
            System.out.println("Если возраст человека равен "+ageMan+", " +
                    "то ему нужно ходить в школу");}
        else if (ageMan >= 18 && ageMan <= 24) {
            System.out.println("Если возраст человека равен "+ageMan+", " +
                    "то ему нужно ходить в университет");}
        else {System.out.println("Если возраст человека равен "+ageMan+", " +
                "то ему пора ходить на работу");}

        // Задача 5
        System.out.println("Task 5");
        int ageChild = 15; // Возраст ребенка
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен "+ageChild+", " +
                    "то ему нельзя кататься на аттракционе");}
        else if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("Если возраст ребенка равен "+ageChild+", " +
                    "то ему можно кататься на аттракционе в сопровождении взрослого");}
        else {System.out.println("Если возраст ребенка равен "+ageChild+", " +
                "то ему можно кататься на аттракционе без сопровождения взрослого");}

        // Задача 6
        System.out.println("Task 6");
        int place = 75; // Количество занятых в вагоне мест
        if (place <= 60) {
            System.out.println("В вагоне есть "+(60-place)+" сидячих мест и 42 стоячих места");
        }
        else if (place > 60 && place < 102) {
            System.out.println("В вагоне нет сидячих мест, но есть "+(102-place)+
                    " стоячих места");}
        else {System.out.println("В вагоне нет свободных мест");}

        // Задача 7
        System.out.println("Task 7");
        int one = 55;
        int two = 456;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Наибольшее из трех чисел - "+one);}
        else if (two > one && two > three) {
            System.out.println("Наибольшее из трех чисел - "+two);}
        else {System.out.println("Наибольшее из трех чисел - "+three);}

    }
}