import com.frog.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class DaoTest {

    @Value("${jdbc.otto}")
    String otto;

    @Test
    public void Resource(){
        System.out.println(otto);
    }
}
