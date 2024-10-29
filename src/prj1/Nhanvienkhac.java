/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj1;

/**
 *
 * @author homin
 */
public class Nhanvienkhac extends Nhanvien{
    private Khoa_Phong phong;

    public Nhanvienkhac(Khoa_Phong phong, String ma_nhan_vien, String ten_cong_viec, String chuc_bac, Date ngay_vao_lam_viec, double luong_co_ban, double he_so_luong, String email, String ho_ten, Date ngay_sinh, diachi dia_chi, String gioi_tinh, String cccd, String sdt, String quoc_tich) {
        super(ma_nhan_vien, ten_cong_viec, chuc_bac, ngay_vao_lam_viec, luong_co_ban, he_so_luong, email, ho_ten, ngay_sinh, dia_chi, gioi_tinh, cccd, sdt, quoc_tich);
        this.phong = phong;
    }

    public Nhanvienkhac() {
        
    }

    public Khoa_Phong getPhong() {
        return phong;
    }

    public void setPhong(Khoa_Phong phong) {
        this.phong = phong;
    }
    
}
