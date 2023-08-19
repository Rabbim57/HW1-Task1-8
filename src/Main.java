public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Количсетво собак = " + dog);
        System.out.println("Количество кошек = " + cat);
        System.out.println("Количсетво Бумаг = " + paper);

        var dogPlus = (dog + 4);
        var catPlus = (cat + 4);
        var paperPlus = (paper + 4);

        System.out.println("Количсетво собак после прибовления 4, равняется = " + dogPlus);
        System.out.println("Количество кошек после прибовления 4, равняется = " + catPlus);
        System.out.println("Количсетво Бумаг после прибовления 4, равняется = " + paperPlus);

        var dogMinus = (dogPlus - 3.5);
        var catMinus = (catPlus - 1.6);
        var paperMinus = (paperPlus - 7639);

        System.out.println("Количсетво собак после убавления 3,5, равняется = " + dogMinus);
        System.out.println("Количество кошек после убавления 1,6, равняется = " + catMinus);
        System.out.println("Количсетво Бумаг после убавления 7639, равняется = " + paperMinus);

        var friend = 19;
        var friendPlus = friend + 2;
        var friendDivision = friendPlus / 7;
        System.out.println("Количсетво друзей, равняется = " + friend);
        System.out.println("Количсетво друзей, после прибавления 2, равняется = " + friendPlus);
        System.out.println("Количсетво друзей, после деления на 7, равняется = " + friendDivision);

        var frog = 3.5;
        var frogIncrease = frog * 10;
        var frogDivision = frogIncrease / 3.5;
        var frogPlus = frogDivision + 4;

        System.out.println("Количсетво лягушек, равняется = " + frog);
        System.out.println("Количсетво ляшушек, после увелечения на 10, равняется = " + frogIncrease);
        System.out.println("Количсетво ляшушек, после деления на 3,5, равняется = " + frogDivision);
        System.out.println("Количсетво ляшушек, после прибавления, равняется = " + frogPlus);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weightBoxers = firstBoxer + secondBoxer;
        System.out.println("Общая масса бойцов " + weightBoxers + "кг");
        var differenceFirstBoxer = secondBoxer - firstBoxer;
        var differenceSecondBoxer = firstBoxer - secondBoxer;
        System.out.println("Разница первого боксера " + differenceSecondBoxer + " Разница второго боксера " + differenceFirstBoxer);
        var massDifference =(firstBoxer-secondBoxer) % weightBoxers;
        System.out.println("Разница между боксерами " + massDifference + " кг ");
        var totalTime = 640;
        var workingHours = 8;
        var numberEmployees = totalTime / workingHours + 94;
        System.out.println("Всего работников в комании " + numberEmployees + " человек ");
        var distributionWorkers = totalTime / numberEmployees;
        System.out.println("Если в компании работает " + numberEmployees  + " человек, то всего " + distributionWorkers + " часов работы может быть поделено между сотрудниками");










    }
}