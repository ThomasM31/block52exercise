package oopd_gu_chalmers.polygonModel.polygon;

/**
 * Created by Niklas on 2016-02-19.
 */
public class PolygonFactory {

    public static Polygon createTriangle(int x, int y){
        return new Triangle(x,y);
    }
    public static Polygon createRectangle(int x, int y) {
        return new Rectangle(x,y); }
    public static Polygon createSquare(int x, int y) {
        return new Square(x,y); }

}
