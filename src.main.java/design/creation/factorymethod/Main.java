package design.creation.factorymethod;

public class Main {
    public static void main(String[] args) {
        Editor editor = new TextEditor();
        editor.open("Main.java");
        editor.open("Editor.java");
        editor.close();
    }
}
