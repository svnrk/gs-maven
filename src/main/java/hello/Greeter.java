package hello;

public class Greeter {
    public String sayHello() {
        return "Hello!";
    }

    public String sayHello(String name) {
        Counter counter = new Counter();

        int len = counter.nameLength(name);
        int letters = counter.nameLetterCount(name);

        return String.format("Hello %s, with name length %d and %d letters.", name, len, letters );
    }
}