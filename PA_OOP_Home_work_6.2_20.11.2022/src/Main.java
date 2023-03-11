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

//2.Написать примеры программ, которые:
//2.1 Выбрасывает NullPointerException
//2.2 Выбрасывает ArrayIndexOutOfBoundsException (когда запрашиваете по несуществующему номеру ячейки)
//2.3 Выбрасывает ClassCastException (когда делаете неправильное явное приведение типа).