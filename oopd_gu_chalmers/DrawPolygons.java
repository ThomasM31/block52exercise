package oopd_gu_chalmers;

/* This is now all we (can) use from the sub-package */
import oopd_gu_chalmers.polygonModel.Model;
import oopd_gu_chalmers.view2d.View;

/* By commenting out the imports above, and instead importing the adapter package,
 * we effectively switch to using the DIT953.model.shapes package.
 */
//import DIT953.model.adapter.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPolygons extends JComponent{
    //public ArrayList<Polygon> polygons;
    public JFrame frame;
    public Model model;
    public View view;

    public DrawPolygons() {
        model = new Model();
        view = new View(model.polygons);
    }
    public void update() {
        model.update();
        view.repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();
        polygons.frame = frame;

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons.view);
        frame.setVisible(true);


        try {
            while (true) {
                Thread.sleep(500);
                polygons.update();
            }
        } catch (InterruptedException e) {}

    }//main
}//DIT953.DrawPolygons