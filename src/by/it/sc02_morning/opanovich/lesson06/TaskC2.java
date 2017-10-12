package by.it.sc02_morning.opanovich.lesson06;
/*
Головоломка.

1) Напишите статический метод fact(int k) для вычисления факториала числа.

2) Напишите программу, которая рассчитает максимальное значение k,
при котором факториал k без искажений поместится в тип данных long.

3) Выведите на экран найденный (максимально возможный для long) факториал
в десятичном, шестандцатиричном и двоичном виде (через знак равно, без пробелов).

Например, если найденное число k было бы равно 6, то вывелось бы
720 = 2d0 = 1011010000

Но правильное число k и сам факториал конечно будут больше.

 */
public class TaskC2 {

    public static void main(String[] args) {

        int k = 2;
        for (; fact(k - 1) == fact(k) / k; k++);
        k--;
        System.out.printf("%d=%s=%s", fact(k), Long.toHexString(fact(k)), Long.toBinaryString(fact(k)));
    }

    private static long fact(int k) {
        return (k == 1) ? 1 : (long) k * fact(--k);
    }
}
