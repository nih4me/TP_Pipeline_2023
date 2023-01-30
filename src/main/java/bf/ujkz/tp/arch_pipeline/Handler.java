/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bf.ujkz.tp.arch_pipeline;

/**
 *
 * @author derokabore
 */
public interface Handler<I, O> {
    O process(I input);
}
