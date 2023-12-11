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
public class luotThayDoi {
    int viTri,soLuongDa;

    public luotThayDoi() {
    }

    public luotThayDoi(int viTri, int soLuongDa) {
        this.viTri = viTri;
        this.soLuongDa = soLuongDa;
    }

    public int getViTri() {
        return viTri;
    }

    public void setViTri(int viTri) {
        this.viTri = viTri;
    }

    public int getSoLuongDa() {
        return soLuongDa;
    }

    public void setSoLuongDa(int soLuongDa) {
        this.soLuongDa = soLuongDa;
    }
    
}
