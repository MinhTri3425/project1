/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj1;

/**
 *
 * @author homin
 */
public class Bacsi extends Nhanvien{
    private Khoa_Phong khoa;

    public Bacsi(Khoa_Phong khoa, String ma_nhan_vien, String ten_cong_viec, String chuc_bac, Date ngay_vao_lam_viec, double luong_co_ban, double he_so_luong, String email, String ho_ten, Date ngay_sinh, diachi dia_chi, String gioi_tinh, String cccd, String sdt, String quoc_tich) {
        super(ma_nhan_vien, ten_cong_viec, chuc_bac, ngay_vao_lam_viec, luong_co_ban, he_so_luong, email, ho_ten, ngay_sinh, dia_chi, gioi_tinh, cccd, sdt, quoc_tich);
        this.khoa = khoa;
    }

    public Bacsi() {
        
    }

    public Khoa_Phong getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa_Phong khoa) {
        this.khoa = khoa;
    }
}
