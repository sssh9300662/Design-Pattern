package design.creation.factorymethod;

class TextEditor extends Editor {

    Document createDocument() {
        return new Document() {
            void open() {
                System.out.println("開啟文字檔案 " + this.getTitle());
            }
            void save() {
                System.out.println("儲存文字檔案 " + this.getTitle());
            }
            void close() {
                System.out.println("關閉文字檔案 " + this.getTitle());
            }
        };
    }

}
