package design.creation.abstractfactory;

import design.example.objects.Rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(20, 10);

        PointCornerFactory factory =
            new PointCornerFactory() {
                public Point getPoint() {
                    return new Point() {
                        public void line(int width) {
                            for(int i = 0; i < width; i++) {
                                System.out.print("-");
                            }
                        }
                    };
                }
                public Corner getCorner() {
                    return new Corner() {
                        public void leftUp() { System.out.print('+'); }
                        public void rightUp() { System.out.print('+'); }
                        public void leftDown() { System.out.print('+'); }
                        public void rightDown() { System.out.print('+'); }
                    };
                }
            };
        rect.paint(factory);        
    }
}
