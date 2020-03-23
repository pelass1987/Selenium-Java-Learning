import com.google.common.io.Files;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

public class ZapisDoPliku {



    @Test
    public void ZapisDoPliku() throws IOException {

        File file = new File("scr/main/resources/zapis.txt");

        BufferedWriter writer = Files.newWriter(file, Charset.defaultCharset());
        writer.write("To jest tekst do zapisaniu w pliku");
        writer.close();
    }
}


