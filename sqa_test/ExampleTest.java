import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ExampleTest {
    @Test
    public void testTinhTienNuoc() {
        // Arrange
        String input = "7"; // Số nước sử dụng nhập vào
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setIn(inputStream);
        System.setOut(new PrintStream(outputStream));

        // Act
        Main.main(null); // Gọi phương thức main của lớp chứa đoạn mã

        // Assert
        String expectedOutput = "48083"; // Số tiền phải trả kỳ vọng
        String actualOutput = outputStream.toString().trim();
        Assertions.assertEquals(expectedOutput, actualOutput, "Số tiền phải trả không chính xác");
    }

    @Test
    public void testTinhTienNuoc_Input10() {
        // Arrange
        String input = "10"; // Số nước sử dụng nhập vào
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setIn(inputStream);
        System.setOut(new PrintStream(outputStream));

        // Act
        Main.main(null); // Gọi phương thức main của lớp chứa đoạn mã

        // Assert
        String expectedOutput = "68690"; // Số tiền phải trả kỳ vọng
        String actualOutput = outputStream.toString().trim();
        Assertions.assertEquals(expectedOutput, actualOutput, "Số tiền phải trả không chính xác");
    }
}
