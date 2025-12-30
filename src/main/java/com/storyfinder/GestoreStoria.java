import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

public class GestoreStoria {

    /**
     *  Carica una storia specifica e converti l'InputStream in stringa da passare
     *  a gson. Richiede un file json con struttura specifica
     *
     *  @param storyName Il nome del file della storia da caricare
     *  @return Il file JSON in formato stringa
     */
    public static String getStory(String storyName) {
        ClassLoader classloader =
            Thread.currentThread().getContextClassLoader();

        InputStream is = classloader.getResourceAsStream(storyName);
        if (is == null) {
            System.err.println("File inesistente");
        }

        String result = null;
        try (InputStream inputStream = is) {
            result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
