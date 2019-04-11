/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LZ78Comp;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Mustafa
 */
public class Dictionary {

    private String character_to_be_added;
    private ArrayList<String> dic_list;
    private int last_index_found;

    public Dictionary() { //Constructor.
        character_to_be_added = "";

        dic_list = new ArrayList<String>();
        dic_list.add("");

    }

    public boolean searchDic(String s) {
       // System.out.println(s);
        String search = s;
        last_index_found = 0;

        if (dic_list.contains(search)) {
            last_index_found = dic_list.indexOf(search);
            character_to_be_added ="";
            return true;

        } else {
            dic_list.add(search);

            character_to_be_added = search.substring(search.length()-1);
            return false;

        }

    }

    public ArrayList<String> getDictionary() {
       /* for (int i = 0; i < dic_list.size(); i++) {
            System.out.println("index number : " + i + " " + dic_list.get(i));
        }*/
        return dic_list;
    }

    public int getLastIndex() {
        return last_index_found;
    }

    public String getAddedChar() {
       // System.out.println(character_to_be_added);
        return character_to_be_added;
    }

}
