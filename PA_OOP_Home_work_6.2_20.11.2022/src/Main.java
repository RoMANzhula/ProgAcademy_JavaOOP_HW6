public class Main {
    public static void main(String[] args) {
        containsExceptions();
    }

    public static void containsExceptions() {
        int number;
        String[] arrayStr = new String[4];

        try {
            System.out.println("This is start.");
            number = 6 / 0 ;
            arrayStr[4] = "Hello World!";
            arrayStr[3] = String.valueOf(4);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | ClassCastException e) {
            e.getMessage();
        } finally {
            System.out.println("This is end.");
        }
    }
}

//2.Написати приклади програм, які:
//2.1 Викидає NullPointerException
//2.2 Викидає ArrayIndexOutOfBoundsException (коли запитуєте за неіснуючим номером комірки)
//2.3 Викидає ClassCastException (коли робите неправильне приведення типу).
