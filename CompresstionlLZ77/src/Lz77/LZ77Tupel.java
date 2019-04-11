/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lz77;

/**
 *
 * @author Mustafa
 */
public class LZ77Tupel {

    int index;
    int length;
    String s;

    public LZ77Tupel(int index, int length, String s) {
        this.index = index;
        this.length = length;
        this.s = s;
    }

    public LZ77Tupel(String s) {
        this.s = s;
    }

    public int getIndex() {
        return index;
    }

    public int getLength() {
        return length;
    }

    public String getString() {
        return s;
    }

}
