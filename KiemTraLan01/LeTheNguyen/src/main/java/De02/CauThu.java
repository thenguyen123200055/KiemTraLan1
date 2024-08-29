/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De02;

/**
 *
 * @author ADMIN
 */
public class CauThu {
    public String hoten;
    public int soao;
   
    public int namsinh;
    public int tienthuong;
    public int tienphat;
    public int luongcung;

    public CauThu(int soao, String hoten, int namsinh, int luongcung, int tienthuong, int tienphat) {
        this.soao = soao;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    CauThu(int soAo, String hoTen, int namSinh, double luongCung, double tienThuong, double tienPhat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getSoao() {
        return soao;
    }

    public String getHoten() {
        return hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public int getTienthuong() {
        return tienthuong;
    }

    public int getTienphat() {
        return tienphat;
    }

    public int getLuongcung() {
        return luongcung;
    }

    public double tinhLuongThucLanh() {
        return luongcung + tienthuong - tienphat;
    }

    @Override
    public String toString() {
        return "CauThu{" + "soao=" + soao + ", hoten='" + hoten + '\'' + ", namsinh=" + namsinh + ", luongcung=" + luongcung + ", tienthuong=" + tienthuong + ", tienphat=" + tienphat + ", luongThucLanh=" + tinhLuongThucLanh() + '}';
    }

}
