package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;

import org.junit.Test;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class GreeterTest {

    @Mock
    public Counter counter;

    @InjectMocks
    public Greeter mockGreeter = new Greeter();

    @Before
    public void init() {
        MockitoAnnotations.initMocks((this));

    }

    @Test
    public void greeterSaysHelloWithMock() {
        //given
        when(counter.nameLength("kalamaja")).thenReturn(4);
        //when
        String result = mockGreeter.sayHello("kalamaja");
        //then
        assertThat(mockGreeter.sayHello("kalamaja"), containsString("4"));


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