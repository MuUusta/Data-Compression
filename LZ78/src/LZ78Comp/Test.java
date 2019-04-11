/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LZ78Comp;

import java.util.Scanner;

/**
 *
 * @author Mustafa
 */
public class Test {

    public static void main(String args[]) {
        int tree_size;
        System.out.println("Please Enter Tree Size: ");
        Scanner s = new Scanner(System.in);
                
        
        tree_size = s.nextInt();
    for (int i=0; i < tree_size; i++) {
        System.out.println(Integer.toBinaryString(i));
}
    }

}
