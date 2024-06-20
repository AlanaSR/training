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
        float purchaseWithSale = (flowers + card) * (100f-sale)/100f;
        float saleRub = (flowers + card) * sale / 100f;
        System.out.println("Сумма двух покупок с учетом скидки равна " + purchaseWithSale + " рублей, скидка составила " + saleRub + " рублей.");

        System.out.println("Задание 5");
        int orangesPrice = 73;
        int saleOranges = 15;
        int bananasPrice = 95;
        int orangesBuy = 10;
        int bananasBuy = 2;
        float orangesWithSale = orangesPrice * (100 - saleOranges) / 100f;
        float totalSum1 = bananasPrice * bananasBuy + orangesBuy * orangesWithSale;
        System.out.println("Сумма покупки с учетом скидки составила " + totalSum1 + " рублей.");

        int champaign = 2870;
        int champaignSale = 50;
        int bread = 27;
        int champaignBuy = 7;
        int breadBuy = 1;
        float champaignWithSale = champaign * (100-champaignSale)/100f;
        float totalSum2 = champaignWithSale * champaignBuy + bread * breadBuy;
        System.out.println("Сумма покупки с учетом скидки составила " + totalSum2 + " рублей.");

        int champPrice = 436;
        int whiteMushroomPrice = 578;
        int whiteMushroomSale = 5;
        float champBuy = 2.5f;
        float whiteMushBuy = 3.75f;
        float whiteMushWithSale = whiteMushroomPrice * (100 - whiteMushroomSale)/100f;
        float totalSum3 = champPrice * champBuy + whiteMushWithSale * whiteMushBuy;
        System.out.println("Сумма покупки с учетом скидки составила " + totalSum3 + " рублей.");

        System.out.println("Задание 6");
        double x = 0.40;
        double y = 0.87;
        System.out.println(11 * x + y);
        System.out.println((x + 10 * y) - 15 * (x / y));
    }
}