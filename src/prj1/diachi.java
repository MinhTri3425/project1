/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj1;

/**
 *
 * @author homin
 */
public class diachi {
    private String so_nha;
    private String duong;
    private String phuong;
    private String quan_huyen;

    public diachi(String so_nha, String duong, String phuong, String quan_huyen) {
        this.so_nha = so_nha;
        this.duong = duong;
        this.phuong = phuong;
        this.quan_huyen = quan_huyen;
    }
    
    public diachi(){
        
    }

    public String getSo_nha() {
        return so_nha;
    }

    public void setSo_nha(String so_nha) {
        this.so_nha = so_nha;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan_huyen() {
        return quan_huyen;
    }

    public void setQuan_huyen(String quan_huyen) {
        this.quan_huyen = quan_huyen;
    }    
}
