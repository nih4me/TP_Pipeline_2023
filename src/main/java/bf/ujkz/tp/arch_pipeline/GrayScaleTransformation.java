/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.ujkz.tp.arch_pipeline;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author derokabore
 */
public class GrayScaleTransformation implements Handler<Mat, Mat> {

    @Override
    public Mat process(Mat image) {
        // Charger la librarie
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        // de l'image couleur vers le noir blanc
        Imgproc.cvtColor(image, image, Imgproc.COLOR_BGR2GRAY);
        
        return image;
    }
    
}
