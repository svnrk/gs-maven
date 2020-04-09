package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class GreeterTest {

    @Mock
    Counter counter;

    @InjectMocks
//    public Greeter mockGreeter;
    public Greeter mockGreeter = new Greeter();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void greeterSaysHelloWithMock() {
        //given
        when(counter.nameLetterCount("kalamaja")).thenReturn(4);
        when(counter.nameLength("kalamaja")).thenReturn(4);
        //when
        String result = mockGreeter.sayHello("kalamaja");

        System.out.println(counter.nameLength("kalamaja"));             // saab counteri tulemuseks 4
        System.out.println(mockGreeter.sayHello("kalamaja"));   // saab counteri tulemuseks 8

        //then
        assertThat(result, containsString("4"));

    }

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