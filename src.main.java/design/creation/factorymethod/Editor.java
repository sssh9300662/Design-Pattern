package design.creation.factorymethod;

import java.util.ArrayList;
import java.util.List;

abstract class Editor {

    private List<Document> docs = new ArrayList<Document>();

    void open(String file) {
        Document doc = createDocument();
        doc.setTitle(file);
        doc.open();
        docs.add(doc);
    }

    void save(Document doc) {
        doc.save();
    }

    void close(Document doc) {
        doc.close();
        docs.remove(doc);
    }

    void close() {
        for (Document doc : docs) {
            close(doc);
        }
    }

    abstract Document createDocument(); // Factory method
}