package hello;

public class Greeter {
    public String sayHello() {
        return "Hello!";
    }

    public String sayHello(String name) {

        return "Hello " + name + ", with name length " + Counter.nameLength(name) + " and letter count " + Counter.nameLetterCount(name);
    }
}