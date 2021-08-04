import java.io.IOException;
import java.util.List;

import org.apache.http.client.methods.CloseableHttpResponse;

public class FirstHomeWork {
    final static String REQUEST_URL = "https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1" +
            "/cats";

    public static void main(String[] args) {

        try {
            CloseableHttpResponse response = Request.executeRequest(REQUEST_URL);
            List<FactsAboutCats> factsAboutCatsList = Parser.JsonToObj(response.getEntity().getContent());
             factsAboutCatsList
                    .stream()
                    .filter((FactsAboutCats facts) -> facts.getUpvotes()==null)
                    .forEach(System.out::println);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


    }


}
