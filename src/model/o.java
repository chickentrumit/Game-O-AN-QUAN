/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author phi
 */
public class o {
    String tenO;
    int soLuongDa;

    public o() {
    }

    public o(String tenO, int soLuongDa) {
        this.tenO = tenO;
        this.soLuongDa = soLuongDa;
    }
    
    public String getTenO() {
        return tenO;
    }

    public void setTenO(String tenO) {
        this.tenO = tenO;
    }

    public int getSoLuongDa() {
        return soLuongDa;
    }

    public void setSoLuongDa(int soLuongDa) {
        this.soLuongDa = soLuongDa;
    }

    @Override
    public String toString() {
        return "o{" + "tenO=" + tenO + ", soLuongDa=" + soLuongDa + '}';
    }
    
}
