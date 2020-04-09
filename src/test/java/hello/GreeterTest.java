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
    private Counter counter;

    @InjectMocks
    private Greeter mockGreeter;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void greeterSaysHelloWithMock() {
        //given
        when(counter.nameLetterCount("kalamaja")).thenReturn(4);
        when(counter.nameLength("kalamaja")).thenReturn(6);
        
        //when
        String result = mockGreeter.sayHello("kalamaja");

        //then
        assertEquals("Hello kalamaja, with name length 6 and 4 letters.", result);

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