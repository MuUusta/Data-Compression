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
public class Lz78Compression {

   
    ArrayList<TagNode> tags;
    Dictionary d;

    public Lz78Compression() {
        
        tags = new ArrayList<TagNode>();
        d = new Dictionary();
    }

    public void compress(String text) {

        String s = text;
        boolean check;
        int lastIndex=0;
        String container = "";

        for (int i = 0; i < s.length(); i++) {
            lastIndex = 0;

            for (int k = i+1; k <= s.length(); k++) {
                check = d.searchDic(s.substring(i, k));
                System.out.println("String sent to dic: "+s.substring(i, k)+"  k at :"+k);
                if (check == false) {
                    container += s.charAt(k-1);// el moshkela hena !!!!!!!!!!!!!!!!!!!!!
                
                    tags.add(new TagNode(lastIndex, container));
                    s = s.substring(k);
                    System.out.println("this is the string now: "+s);
                    i--;
                    container = "";
                    break;
                } else {
                    lastIndex = d.getLastIndex();
                    System.out.println("string now is : "+s);
                    if(i==s.length()-k && k==s.length()){
                        tags.add(new TagNode(lastIndex, ""));
                       s = s.substring(k);
                        System.out.println("string now is2 : "+s);
                      //  break;
                    }

                }
            }
            
            
           

        }
         

    }

    public ArrayList<TagNode> getTags() {
        for (int i = 0; i < tags.size(); i++) {
          //  System.out.println("<" + tags.get(i).dic_index + "," + tags.get(i).s + ">");
        }
        return tags;
    }

    public ArrayList<String> getDic() {
        return d.getDictionary();
    }
    
    public String tagsCopy(){
        String output="";
        for(int i=0 ;i < tags.size(); i++){
            output+="<"+tags.get(i).dic_index+","+tags.get(i).s+">\n";
        }
        
        return output;
    }
    public String dicCopy(){
        String output="";
        for(int i=0 ;i < d.getDictionary().size(); i++){
            output+="  "+i+" -    "+d.getDictionary().get(i)+"\n";
        }
        
        return output;
    }
}
