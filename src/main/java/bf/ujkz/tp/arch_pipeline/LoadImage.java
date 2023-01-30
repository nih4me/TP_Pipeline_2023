/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.ujkz.tp.arch_pipeline;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author derokabore
 */
public class LoadImage implements Handler<String, Mat> {

    @Override
    public Mat process(String image_path) {
        // Charger la librarie
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        // Creer une instance du codec
        Imgcodecs imageCodecs = new Imgcodecs();
        
        // Lire l'image via son chemin : Retourne une matrix
        Mat matrix = imageCodecs.imread(image_path);
        
        return matrix;
    }
    
}

