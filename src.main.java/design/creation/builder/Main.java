package design.creation.builder;

public class Main {
    public static void main(String[] args) {
        final int[][] material = {
                {1, 1, 1, 1, 1, 1, 1}, 
                {1, 0, 0, 0, 0, 2, 1}, 
                {1, 0, 1, 0, 1, 0, 1}, 
                {1, 0, 2, 1, 0, 1, 1}, 
                {1, 1, 0, 1, 0, 1, 1}, 
                {1, 0, 0, 2, 0, 0, 1}, 
                {1, 1, 1, 1, 1, 1, 1}};

        MazeDirector director = new MazeDirector(material, 
                new PlainBuilder(material.length, material[0].length));
        director.build().paint();
    }
}
