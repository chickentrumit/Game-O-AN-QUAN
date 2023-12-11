/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author phi
 */
public class dsO {

    ArrayList<o> list;

    public ArrayList<o> getList() {
        return list;
    }

    public void setList(ArrayList<o> list) {
        this.list = list;
    }

    public dsO() {
        list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            if (i == 11) {
                list.add(new o("oQuan1", 10));
            } else if (i == 5) {
                list.add(new o("oQuan2", 10));
            } else {
                if(i<5)
                    list.add(new o("oDan"+(i+1),5));
                else
                    list.add(new o("oDan"+i,5));
            }
        }
    }
    

}
