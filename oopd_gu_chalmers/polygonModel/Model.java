package oopd_gu_chalmers.polygonModel;

import oopd_gu_chalmers.polygonModel.adapter.PolygonFactory;
import oopd_gu_chalmers.polygonModel.adapter.Polygon;

import javax.swing.*;
import java.util.ArrayList;

public class Model extends JComponent {
    public ArrayList<Polygon> polygons;
    public boolean direction = true;
    public int ticker = 0;
    public Model(){
        polygons = new ArrayList<>(10);

        polygons.add(PolygonFactory.createSquare(50,50));
        polygons.add(PolygonFactory.createTriangle(100,100));
        polygons.add(PolygonFactory.createRectangle(50,150));

    }//constructor

    public void update() {
        ticker++;
        int value = direction ? 10 : -10;
        for (Polygon p: polygons){
            p.updateCenter(p.getCenterX()+value, p.getCenterY()+value);
        }
        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
    }
}
