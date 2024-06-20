public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte first = 47;
        byte second = 13;
        int whole = first / second;
        int reminder = first % second;
        System.out.println("В результате деления 47/13, целая часть равна " + whole + " , а остаток равен " + reminder);

        System.out.println("Задание 2");
        int num2 = 44;
        int tens2 = num2 / 10;
        int ones2 = num2 % 10;
        int sum2 = tens2 + ones2;
        System.out.println("Сумма десятков и единиц числа " + num2 + " равна " + sum2);

        System.out.println("Задание 3");
        int num3 = 345;
        int hundreds3 = num3 / 100;
        int tensReminders = num3 % 100;
        int tens3 = tensReminders / 10;
        int ones3 = tensReminders % 10;
        int sum3 = hundreds3 + tens3 + ones3;
        System.out.println("Сумма сотен, десятков и единиц числа " + num3 + " равна " + sum3);

        System.out.println("Задание 4");
        short flowers = 4899;
        short card = 157;
        byte sale = 10;
        int purchaseWithSale = (flowers + card) * (100-sale)/100;
        int saleRub = (flowers + card) * sale / 100;
        System.out.println("Сумма двух покупок с учетом скидки равна " + purchaseWithSale + " рублей, скидка составила " + saleRub + " рублей.");

    }
}