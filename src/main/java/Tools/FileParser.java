package Tools;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FileParser {

    public static List<Object> parseFile(String filename, int expectedLineCount) throws IOException {
        Path path = Paths.get("src/main/resources", filename);
        List<String> lines = Files.readAllLines(path);

        List<Object> parsedData = new ArrayList<>();

        for (String line : lines) {
            if (line.contains(",")) {
                List<String> list = line.equals("(empty)") ? List.of() : Arrays.asList(line.split(","));
                parsedData.add(list.stream().map(String::trim).toList()); // Trim whitespace
            } else if (line.equals("(empty)")) {
                parsedData.add(List.of());
            } else {
                parsedData.add(line);
            }
        }
        return parsedData;
    }
}



