/**
 * Created by zyan on 05/04/15.
 */
import org.freedesktop.cairo.Context;
import org.freedesktop.cairo.ImageSurface;
import org.freedesktop.cairo.Format;
import org.gnome.gtk.Gtk;

import java.io.IOException;
import java.util.ArrayList;


public class maine {
    /*#------ Configuration --------*/
    public static ArrayList<Integer> IMAGE_SIZE;/* =(1000,1000)*/
    int NUM_SUBDIVISIONS = 8;
          /*  #-----------------------------*/

    double goldenRatio = (1 + Math.sqrt(5)) / 2;
    public maine() throws IOException {
        ImageSurface surface = new ImageSurface(Format.ARGB32, IMAGE_SIZE.get(0), IMAGE_SIZE.get(1));
        Context cr = new Context(surface);
        cr.translate(IMAGE_SIZE.get(0) / 2.0, IMAGE_SIZE.get(1) / 2.0);
        double wheelRadius = 1.2 * Math.sqrt((IMAGE_SIZE.get(0) / 2.0) * 2 + (IMAGE_SIZE.get(1) / 2.0) * 2);
        cr.scale(wheelRadius, wheelRadius);
        surface.writeToPNG("penrose.png");
        System.out.print("ada");
    }

    public static void main(String[] args) throws IOException {
        IMAGE_SIZE = new ArrayList();
        IMAGE_SIZE.add(1000);
        IMAGE_SIZE.add(1000);
        /*IMAGE_SIZE.add(1000);*/
        Gtk.init(args);
        new maine();
        //Gtk.main();

    }
}
