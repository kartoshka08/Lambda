public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}

// код не работал по причине деления на ноль (b становиться равным нулю и мы делим a на b, а так нельзя)
// первое решение проблемы - написание класса main через try и catch, где в
// catch будет ловить арифметические ошибки как наша
// второе - написать лямба переменную для функции devide, в котором возникла ошибка. Реализуем второе решение.