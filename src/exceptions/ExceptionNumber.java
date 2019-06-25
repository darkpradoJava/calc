package exceptions;

public class ExceptionNumber extends Exception {
    public ExceptionNumber() {
        System.out.println("Некорректные числа! ");
        System.out.println("Числа должны быть от 1 до 10 или от I до X включительно(одновременно только с одним типом)");
        System.exit(0);
    }
}
