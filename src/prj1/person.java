/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj1;

/**
 *
 * @author homin
 */
public class person {
    private String ho_ten;
    private Date ngay_sinh;
    private diachi dia_chi;
    private String gioi_tinh;
    private String cccd;
    private String sdt;
    private String quoc_tich;

    public person(String ho_ten, Date ngay_sinh, diachi dia_chi, String gioi_tinh, String cccd, String sdt, String quoc_tich) {
        this.ho_ten = ho_ten;
        this.ngay_sinh = ngay_sinh;
        this.dia_chi = dia_chi;
        this.gioi_tinh = gioi_tinh;
        this.cccd = cccd;
        this.sdt = sdt;
        this.quoc_tich = quoc_tich;
    }

    public person(){
        
    }
    
    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public diachi getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(diachi dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getQuoc_tich() {
        return quoc_tich;
    }

    public void setQuoc_tich(String quoc_tich) {
        this.quoc_tich = quoc_tich;
    }
    
    
}
