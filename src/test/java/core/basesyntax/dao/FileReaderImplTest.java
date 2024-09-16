package core.basesyntax.dao;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileReaderImplTest {
    private static final String INPUT_FILE = "input.csv";
    private static final String EMPTY_FILE = "empty.csv";
    private static final String INCORRECT_FILE = "incorrect.csv";
    private static final String NON_EXISTENT_FILE = "nonexistent.csv";
    private static final String CORRECT_FILE = "src/test/resources/transactions.csv";
    private static FileReaderImpl fileReader;

    @BeforeEach
    void setUp() {
        fileReader = new FileReaderImpl();
    }

    @Test
    void read_Empty_File_notOk() {
        assertThrows(RuntimeException.class,
                () -> fileReader.read(EMPTY_FILE));
    }

    @Test
    void read_incorrectFile_notOk() {
        assertThrows(RuntimeException.class,
                () -> fileReader.read(INCORRECT_FILE));
    }

    @Test
    void read_correctFile_ok() {
        assertThrows(RuntimeException.class,
                () -> fileReader.read(INPUT_FILE));
    }

    @Test
    public void read_emptyFile_ok() {
        assertThrows(RuntimeException.class,
                () -> fileReader.read(EMPTY_FILE));
    }

    @Test
    public void read_nonExistentFile_notOk() {
        assertThrows(RuntimeException.class,
                () -> fileReader.read(INCORRECT_FILE));
    }

    @Test
    public void read_fileNotFound_notOk() {
        assertThrows(RuntimeException.class,
                () -> fileReader.read(NON_EXISTENT_FILE));
    }

    @Test
    public void read_correctFilePath_ok() {
        fileReader.read(CORRECT_FILE);
    }
}
