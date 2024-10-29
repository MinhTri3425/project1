/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj1;

/**
 *
 * @author homin
 */
public class Benhnhan extends person{
    private Khoa_Phong khoa_kham;
    private String ma_so;
    private Date ngay_kham;
    private String ten_benh_an;
    private boolean Nhap_vien;

    public Benhnhan(Khoa_Phong khoa_kham, String ma_so, Date ngay_kham, String ten_benh_an, boolean Nhap_vien, String ho_ten, Date ngay_sinh, diachi dia_chi, String gioi_tinh, String cccd, String sdt, String quoc_tich) {
        super(ho_ten, ngay_sinh, dia_chi, gioi_tinh, cccd, sdt, quoc_tich);
        this.khoa_kham = khoa_kham;
        this.ma_so = ma_so;
        this.ngay_kham = ngay_kham;
        this.ten_benh_an = ten_benh_an;
        this.Nhap_vien = Nhap_vien;
    }

    public Benhnhan() {

    }

    public Khoa_Phong getKhoa_kham() {
        return khoa_kham;
    }

    public void setKhoa_kham(Khoa_Phong khoa_kham) {
        this.khoa_kham = khoa_kham;
    }

    public String getMa_so() {
        return ma_so;
    }

    public void setMa_so(String ma_so) {
        this.ma_so = ma_so;
    }

    public Date getNgay_kham() {
        return ngay_kham;
    }

    public void setNgay_kham(Date ngay_kham) {
        this.ngay_kham = ngay_kham;
    }

    public String getTen_benh_an() {
        return ten_benh_an;
    }

    public void setTen_benh_an(String ten_benh_an) {
        this.ten_benh_an = ten_benh_an;
    }

    public boolean isNhap_vien() {
        return Nhap_vien;
    }

    public void setNhap_vien(boolean Nhap_vien) {
        this.Nhap_vien = Nhap_vien;
    }
}
