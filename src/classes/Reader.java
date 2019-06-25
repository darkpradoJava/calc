package classes;

import exceptions.ExceptionAction;
import exceptions.ExceptionNumber;

import java.util.Scanner;

public class Reader {

    private Scanner reader = new Scanner(System.in);
    private int a;
    private int b;
    private String action;
    private String[] romulNum = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public void readNum() {
        try {
            String strA;
            String strB;
            strA = reader.next();
            action = reader.next();
            strB = reader.next();

            if (isArabianDigit(strA) && isArabianDigit(strB)) {
                a = Integer.parseInt(strA);
                b = Integer.parseInt(strB);
                checkDiapasonDigit(a, b);
                checkDiapasonAction(action);
            } else if (isRomulDigit(strA) && isRomulDigit(strB)) {
                a = convertRomul(strA);
                b = convertRomul(strB);
                checkDiapasonDigit(a, b);
                checkDiapasonAction(action);
            } else {
                throw new ExceptionNumber();
            }

        } catch (ExceptionNumber e) {
            //e.printStackTrace();
        } catch (ExceptionAction e) {
            //e.printStackTrace();
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getAction() {
        return action;
    }

    private boolean isArabianDigit(String num) {
        try {
            Integer.parseInt(num);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private boolean isRomulDigit(String num) {
        for (String s : romulNum) {
            if (num.equals(s)) {
                return true;
            }
        }
        return false;
    }

    private void checkDiapasonDigit(int a, int b) throws ExceptionNumber {
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new ExceptionNumber();
        }
    }

    private void checkDiapasonAction(String action) throws ExceptionAction {
        if (!action.equals("+") && !action.equals("-") && !action.equals("*") && !action.equals("/")) {
            throw new ExceptionAction();
        }
    }

    private int convertRomul(String num) {
        for (int i = 0; i < romulNum.length; i++) {
            if (num.equals(romulNum[i])) {
                return i + 1;
            }
        }
        return -1;
    }

}
