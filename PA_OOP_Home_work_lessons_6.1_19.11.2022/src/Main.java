public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> strInt = new Pair<>("String", 10);
        Pair<Integer, String> intStr = new Pair<>(10, "String");
        Pair<String, Double> strDoub = new Pair<>("String", 10.5);
        Pair<Double, String> doubStr = new Pair<>(10.5, "String");
        Pair<String, Character> strChar = new Pair<>("String", '1');
        Pair<Character, String> charStr = new Pair<>('1', "String");
        Pair<String, Long> strLong = new Pair<>("String", 10L);
        Pair<Long, String> longStr = new Pair<>(10L, "String");
        Pair<String, Boolean> strBool = new Pair<>("String", true);
        Pair<Boolean, String> boolStr = new Pair<>(true, "String");
        Pair<String, Pair> strPair = new Pair<>("String", strInt);
        Pair<Pair, String> pairStr = new Pair<>(strInt, "String");
        System.out.println(strInt);
        System.out.println(intStr);
        System.out.println(strDoub);
        System.out.println(doubStr);
        System.out.println(strChar);
        System.out.println(charStr);
        System.out.println(strLong);
        System.out.println(longStr);
        System.out.println(strBool);
        System.out.println(boolStr);
        System.out.println(strPair);
        System.out.println(pairStr);

    }
}

//1. Написать класс Pair, который будет содержать два поля разных типов. Класс должен работать с любой парой типов.