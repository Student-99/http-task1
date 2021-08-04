import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parser {
    public static ObjectMapper mapper =
            new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public static List<FactsAboutCats> JsonToObj(InputStream stream) throws IOException {
        return mapper.readValue(stream, new TypeReference<>() {
        });
    }

    public static PlanetaryNasa JsonToPlanetaryNasa(InputStream stream) throws IOException {
        return mapper.readValue(stream,new TypeReference<>(){});
    }
}
