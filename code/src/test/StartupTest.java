package test;

import main.Startup;
import org.junit.jupiter.api.Test;

public class StartupTest {

    @Test
    public void startupTest(){
        Startup startup = new Startup();
        startup.main();
    }

}