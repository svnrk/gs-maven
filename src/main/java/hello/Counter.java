package hello;

public class Counter {

    public int nameLength(String name){
        int len = name.length();
        return len;
    }

    public int nameLetterCount(String name){
        int len = name.length();
        int letterCount = 0;
        for (int i = 0; i<len; i++){
            if (Character.isLetter(name.charAt(i))){
                letterCount++;
            }
        }
        return letterCount;
    }
    public int count(String name) {
        return name.length();
    }
}
