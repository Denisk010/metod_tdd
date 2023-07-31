import org.junit.Test;
import org.junit.Assert;
import ru.netology.PhoneBook;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    public void addTest(){
        final int addPhonebookExpected = 1;
        final int actual = phoneBook.add("Денис" , "395521");
        Assert.assertEquals(addPhonebookExpected, actual);
    }
    @Test
    public void findByNumber(){
        final String findPhonebookExpected = "Денис";
        final String actual = phoneBook.findByNumber("395521");
        Assert.assertEquals(findPhonebookExpected, actual);
    }
}
