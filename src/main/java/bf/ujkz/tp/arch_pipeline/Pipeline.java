/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.ujkz.tp.arch_pipeline;

/**
 *
 * @author derokabore
 */
public class Pipeline<I, O> {
    
    private final Handler<I, O> currentHandler;
    
    Pipeline(Handler<I, O> firstHandler) {
        this.currentHandler = firstHandler;
    }
    
    <K> Pipeline<I, K> addHandler(Handler<O, K> newHandler) {
        return new Pipeline<>(input -> newHandler.process(this.currentHandler.process(input)));
    }
    
    O execute(I input) {
        return this.currentHandler.process(input);
    }
}