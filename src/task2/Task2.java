package task2;

/**
 * 2.Написать класс Калькулятор (необобщенный),
 * который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа,
 * над которыми должна быть произведена операция.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(Calc.sum(5, 5));
        System.out.println(Calc.divide(16, 4.0));
        System.out.println(Calc.subtract(10.0, 3.0));

    }
}