package dev.mirrord.knote;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "minio.reconnect.enabled=false")
public class KnoteJavaApplicationTests {

    @Test
    public void contextLoads() {
    }

}
