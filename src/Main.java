public class Main {
    public static void main(String[] args) {
        var  dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var boxersWeight = boxerWeight1 + boxerWeight2;
        System.out.printf("Общий вес боксеров " + boxersWeight);
        var difference = boxerWeight2 - boxerWeight1;
        System.out.printf("Разница в весе " + difference + " кг");
        var differenceFunction = (boxerWeight1 + boxerWeight2) % boxersWeight;
        System.out.printf("Разница " + differenceFunction + " кг");

        var commonHours = 640;
        var companyWorkers = commonHours / 8;
        System.out.printf("Всего в компании " + companyWorkers + " человек");
    }
}