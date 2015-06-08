package design.creation.builder;

public interface MazeBuilder {

    void buildRoad(int i, int j);

    void buildWall(int i, int j);

    void buildTreasure(int i, int j);

    Maze getMaze();

}
