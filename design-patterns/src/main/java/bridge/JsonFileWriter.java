package bridge;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class JsonFileWriter implements FileWriter {

    @Override
    public void save(String header, List<Detail> details) {
        String json = getJson(details);
        try (PrintWriter out = new PrintWriter(header + ".json")) {
            out.println(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String getJson(List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (Detail detail : details) {
            builder.append("\n\"");
            builder.append(detail.getLabel());
            builder.append("\":\"");
            builder.append(detail.getValue());
            builder.append("\",");
        }
        builder.setLength(builder.length() - 1);
        builder.append("\n}");
        return builder.toString();
    }


}
