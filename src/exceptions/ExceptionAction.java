package exceptions;

public class ExceptionAction extends Exception {
    public ExceptionAction() {
        System.out.println("Некорректный оператор!");
        System.out.println("Доступные действия: + - * /");
        System.exit(0);
    }
}
