package oopd_gu_chalmers.view2d;

import oopd_gu_chalmers.polygonModel.Model;
import oopd_gu_chalmers.polygonModel.adapter.Polygon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class View extends JComponent {
    private ArrayList<Polygon> polygons;

    public View(ArrayList<Polygon> poly) {
        polygons = poly;
    }

    @Override
    public void paint(Graphics g) {
        for (Polygon currentPolygon : polygons) {
            currentPolygon.paint(g);
        }
    }//paint
}
