package design.creation.factorymethod;

abstract class Document {

    private String title;

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    abstract void open();

    abstract void save();

    abstract void close();
}
