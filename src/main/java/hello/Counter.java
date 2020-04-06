package hello;

public class Counter {

    public static int nameLength(String name){
        int len = name.length();
        return len;
    }

    public static int nameLetterCount(String name){
        int len = name.length();
        int letterCount = 0;
        for (int i = 0; i<len; i++){
            if (Character.isLetter(name.charAt(i))){
                letterCount++;
            }
        }
        return letterCount;
    }
}
