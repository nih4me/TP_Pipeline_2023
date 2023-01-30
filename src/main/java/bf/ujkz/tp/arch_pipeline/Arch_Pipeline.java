/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bf.ujkz.tp.arch_pipeline;

/**
 *
 * @author derokabore
 */
public class Arch_Pipeline {

    public static void main(String[] args) {
        
        String image_path = "/Users/derokabore/Downloads/flowers.jepg";
        Pipeline pipeline = new Pipeline<>(new LoadImage())
                .addHandler(new GrayScaleTransformation());
        pipeline.execute(image_path);
    }
}
