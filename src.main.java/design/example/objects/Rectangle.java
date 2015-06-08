package design.example.objects;

import design.creation.abstractfactory.Corner;
import design.creation.abstractfactory.Point;
import design.creation.abstractfactory.PointCornerFactory;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void paint(PointCornerFactory factory) {//It's a callback function
        Point point = factory.getPoint();
        Corner corner = factory.getCorner();

        corner.leftUp();
        point.line(width - 2);

        corner.rightUp();
        System.out.println();

        for (int i = 0; i < height - 2; i++) {
            point.line(width);
            System.out.println();
        }

        corner.leftDown();
        point.line(width - 2);

        corner.rightDown();
        System.out.println();
    }

}
