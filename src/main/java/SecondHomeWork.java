import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;

public class SecondHomeWork {
    final static String NASA_URL = "https://api.nasa.gov/planetary/apod?api_key" +
            "=h0IfDlY6yZnyPFXoZkU1pDszdBHOXYsY5rDqSDgW";

    public static void main(String[] args) {
        try {
            CloseableHttpResponse response = Request.executeRequest(NASA_URL);
            PlanetaryNasa planetaryNasa = Parser.JsonToPlanetaryNasa(response.getEntity().getContent());
            String fileName = planetaryNasa.getUrl().substring(planetaryNasa.getUrl().lastIndexOf("/") + 1);
            SaveToFile.saveImageToFile(fileName,
                    Request.executeRequest(planetaryNasa.getUrl())
                            .getEntity()
                            .getContent()
                            .readAllBytes());

        } catch (
                IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
