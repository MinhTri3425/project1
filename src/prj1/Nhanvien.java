/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj1;

/**
 *
 * @author homin
 */
public class Nhanvien extends person{
    private String ma_nhan_vien;
    private String ten_cong_viec;
    private String chuc_bac;
    private Date ngay_vao_lam_viec;
    private double luong_co_ban;
    private double he_so_luong;
    private String email;

    public Nhanvien(String ma_nhan_vien, String ten_cong_viec, String chuc_bac, Date ngay_vao_lam_viec, double luong_co_ban, double he_so_luong, String email, String ho_ten, Date ngay_sinh, diachi dia_chi, String gioi_tinh, String cccd, String sdt, String quoc_tich) {
        super(ho_ten, ngay_sinh, dia_chi, gioi_tinh, cccd, sdt, quoc_tich);
        this.ma_nhan_vien = ma_nhan_vien;
        this.ten_cong_viec = ten_cong_viec;
        this.chuc_bac = chuc_bac;
        this.ngay_vao_lam_viec = ngay_vao_lam_viec;
        this.luong_co_ban = luong_co_ban;
        this.he_so_luong = he_so_luong;
        this.email = email;
    }

    public Nhanvien(){
        
    }

    public String getMa_nhan_vien() {
        return ma_nhan_vien;
    }

    public void setMa_nhan_vien(String ma_nhan_vien) {
        this.ma_nhan_vien = ma_nhan_vien;
    }

    public String getTen_cong_viec() {
        return ten_cong_viec;
    }

    public void setTen_cong_viec(String ten_cong_viec) {
        this.ten_cong_viec = ten_cong_viec;
    }

    public String getChuc_bac() {
        return chuc_bac;
    }

    public void setChuc_bac(String chuc_bac) {
        this.chuc_bac = chuc_bac;
    }

    public Date getNgay_vao_lam_viec() {
        return ngay_vao_lam_viec;
    }

    public void setNgay_vao_lam_viec(Date ngay_vao_lam_viec) {
        this.ngay_vao_lam_viec = ngay_vao_lam_viec;
    }

    public double getLuong_co_ban() {
        return luong_co_ban;
    }

    public void setLuong_co_ban(double luong_co_ban) {
        this.luong_co_ban = luong_co_ban;
    }

    public double getHe_so_luong() {
        return he_so_luong;
    }

    public void setHe_so_luong(double he_so_luong) {
        this.he_so_luong = he_so_luong;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 
}
