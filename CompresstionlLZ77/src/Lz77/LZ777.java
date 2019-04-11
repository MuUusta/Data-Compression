/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lz77;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mustafa
 */
public class LZ777 {

    public List<LZ77Tupel> compress(String text) {

        List<LZ77Tupel> list = new ArrayList<LZ77Tupel>();
        String search = "";
        String input = text;

        String next;
        int indexGood = 0;
        int indexFound;
        int searchLen;

        while (input.length() > 0) {
            searchLen = 1;
            next = input.substring(0, searchLen);
            if (input.indexOf(next) == -1) {
                list.add(new LZ77Tupel(0, 0, next));
                System.out.println("taaag " + "0" + "0" + next);
                search += next;
                System.out.println("this is search area  " + search);
                input = input.substring(searchLen);
                 //searchLen++;
                continue;
            }
            do {
                next = input.substring(0, searchLen);
                System.out.println("this is next " + next);
                indexFound = search.indexOf(next);
                System.out.println("this is found " + indexFound);
                if (indexFound != -1) {
                    indexGood = indexFound;
                }
                searchLen++;
                System.out.println("search len now " + searchLen);
            } while (indexFound != -1);
            search += next.substring(0, next.length());
            System.out.println("Search area " + search);
            input = input.substring(next.length());
            list.add(new LZ77Tupel(indexGood, next.length() - 1, next.substring(next.length() - 1)));
            System.out.println("taaag " + indexGood + (next.length() - 1) + next.substring((next.length() - 1)) + "This is a tag");
        }

        return list;

    }
}
