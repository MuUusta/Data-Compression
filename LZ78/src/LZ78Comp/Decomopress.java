/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LZ78Comp;

import java.util.ArrayList;

/**
 *
 * @author Mustafa
 */
public class Decomopress {

    ArrayList<TagNode> tagsList;
    ArrayList<String> dic;
    String outPut;

    public Decomopress(ArrayList<TagNode> tagsList, ArrayList<String> dic) {
        this.tagsList = tagsList;
        this.dic = dic;
        outPut = "";
    }

    public String Decompresstion() {
        for (int i = 0; i < tagsList.size(); i++) {

            outPut += dic.get(tagsList.get(i).dic_index) + tagsList.get(i).s;

        }
        System.out.println(outPut);
        return outPut;
    }
}
