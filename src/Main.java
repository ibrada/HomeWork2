public class Main {
    public static void main(String[] args) {

        //Task 1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

//Task 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

//Task 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

//Task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

//Task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

//Task 6
        var fighter1Weight = 78.2;
        var fighter2Weight = 82.7;
        var totalWeight = fighter1Weight + fighter2Weight;
        System.out.println("Общая масса двух бойцов " + totalWeight + " кг");
        var diffWeight = fighter2Weight - fighter1Weight;
        System.out.println("Разница между массами бойцов " + diffWeight + " кг");

//Task 7
        System.out.println("Из большей массы меньшую уже вычли и получилось " + diffWeight + " кг");
        var diffWeight2 = fighter2Weight % fighter1Weight;
        System.out.println("Разница с помощью функции остаток от деления " + diffWeight2 + " кг");

//Task 8
        //Task 8.1
        var allTime = 640;
        var oneWorkerTime = 8;
        var allWorker = allTime / oneWorkerTime;
        //Method 1
        System.out.println("Всего работников в компании " + allWorker + " человек");
        //Method 2
        System.out.println("Всего работников в компании " + (allTime / oneWorkerTime) + " человек");

        //Task 8.2
        var moreWorker = 94;
        var allWorker = allWorker + moreWorker;
        var totalTime = allWorker * oneWorkerTime;
        //Method 1
        System.out.println("Если в компании работает " + allWorker + " человека, то всего " + totalTime + " часа работы может быть поделено между сотрудниками");
        //Method 2
        System.out.println("Если в компании работает " + (allTime / oneWorkerTime + moreWorker) + " человека, то всего " + (moreWorker * oneWorkerTime + allTime) + " часа работы может быть поделено между сотрудниками");

        /* The End */

    }
}