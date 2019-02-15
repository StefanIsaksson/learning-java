package bridge;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class XmlFileWriter implements FileWriter {

    @Override
    public void save(String header, List<Detail> details) {
        String json = getXml(header, details);
        try (PrintWriter out = new PrintWriter(header + ".xml")) {
            out.println(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String getXml(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<root>");
        for (Detail detail : details) {
            builder.append("<");
            builder.append(detail.getLabel());
            builder.append(">");
            builder.append(detail.getValue());
            builder.append("</");
            builder.append(detail.getLabel());
            builder.append(">");
        }
        builder.append("\n</root>");
        return builder.toString();
    }


}
