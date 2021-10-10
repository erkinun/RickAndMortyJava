import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class CharacterAPI {

  private static final String REST_URI = "https://rickandmortyapi.com/api/character";

  public static Character getCharacterById(String id) throws Exception {

    URL api = new URL(REST_URI + "/" + id);

    HttpURLConnection conn = (HttpURLConnection) api.openConnection();
    conn.setRequestMethod("GET");
    conn.connect();

    int responsecode = conn.getResponseCode();
    if (responsecode != 200) {
      throw new RuntimeException("HttpResponseCode: " + responsecode);
    } else {

      String inline = "";
      Scanner scanner = new Scanner(api.openStream());

      while (scanner.hasNext()) {
        inline += scanner.nextLine();
      }
      scanner.close();

      ObjectMapper objectMapper = new ObjectMapper();

      return objectMapper.readValue(inline, Character.class);
    }
  }
}
