package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GreeterTest {

    // Mock-imisest ei saa aru :(

//    @Test
//    public void mockTest(){
//        Greeter greeter2 = mock(Counter.nameLength());
//        when(greeter2.sayHello("Moroder")).thenReturn(7);
//        assertThat(greeter2.sayHello("Moroder"), containsString("7"));
//    }


    @Test
    public void greeterSaysHello() {
        Greeter greeter = new Greeter();
        assertThat(greeter.sayHello(), containsString("Hello"));
    }

    @Test
    public void greeterSaysHelloDude() {
        Greeter greeter = new Greeter();
        assertThat(greeter.sayHello("Dude"), containsString("Hello"));
        assertThat(greeter.sayHello("Dude"), containsString("Dude"));
    }

}