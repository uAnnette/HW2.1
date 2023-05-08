import org.example.Main;
import org.example.User;
import org.example.UserNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTests {

    @Test
    public void getUserByLoginAndPasswordTest() throws UserNotFoundException {

        String expected = "jhon@gmail.com";

        User res = Main.getUserByLoginAndPassword("jhon", "pass");

        Assertions.assertEquals(expected, res.getEmail());
    }

    @Test
    public void ageTest() throws UserNotFoundException {

        String expected = "Возраст меньше 18-ти лет";

        String res = Main.validateUser(Main.getUserByLoginAndPassword("elle", "passw"));

        Assertions.assertEquals(expected, res);
    }

    @Test
    public void exclusionTest() {
        UserNotFoundException exception = Assertions.assertThrows(UserNotFoundException.class,
                () -> {
                    Main.getUserByLoginAndPassword("kate", "pas");
                });

        Assertions.assertEquals("Пользователь не найден", exception.getMessage());
    }
}
