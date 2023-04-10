
import com.ssm.config.SpringConfig;
import com.ssm.domain.Book;
import com.ssm.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.security.RunAs;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    public BookService bookService;

    @Test
    public void getAllTest(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
    @Test
    public void getByIdTest(){
        Book byId = bookService.getById(1);
        System.out.println(byId);
    }
    // @Test
    // public void saveTest(){
    //     bookService.save();
    // }
}
