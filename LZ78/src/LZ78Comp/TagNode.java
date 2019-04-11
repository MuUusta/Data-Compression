/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LZ78Comp;

/**
 *
 * @author Mustafa
 */
public class TagNode {
    int dic_index;
    String s;
    
    public TagNode(int length, String s){
        this.dic_index = length;
        this.s  = s;
    }
    public TagNode(String s){
        this.s = s;
    }
    
    public int getDicIndex(){
        return dic_index;
    }
    public String getString(){
        return s;
    }
    
}
