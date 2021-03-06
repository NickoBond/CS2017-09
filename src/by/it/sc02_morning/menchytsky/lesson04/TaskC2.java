package by.it.sc02_morning.menchytsky.lesson04;
/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {

    static int sumDigitsInNumber(int a){
       int b = (a-a%1000)/1000;
       int c = ((a%1000)-(a%1000)%100)/100;
       int d = ((a%1000)%100-((a%1000)%100)%10)/10;
       int e = ((a%1000)%100)%10;

        return b+c+d+e;
    }



    public static void main(String[] args) {
       System.out.println(sumDigitsInNumber(5467));
}

}
