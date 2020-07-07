import com.jeff.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot單元測試
 *
 * 可以在測試期間很方便的類似編碼一樣進行自動注入功能
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringBootApplicationTest {

    @Autowired
    Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }
}
