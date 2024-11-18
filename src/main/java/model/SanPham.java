/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    
    private int maSP, maLoai;
    private String tenSP, hinh;
    private Double donGia;
    private Boolean KhuyenMai;

    public SanPham(int maSP,String tenSP, Double donGia, String hinh, int maLoai, Boolean KhuyenMai) {
        this.maSP = maSP;
        this.maLoai = maLoai;
        this.tenSP = tenSP;
        this.hinh = hinh;
        this.donGia = donGia;
        this.KhuyenMai = KhuyenMai;
    }

    public SanPham() {
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Boolean getKhuyenMai() {
        return KhuyenMai;
    }

    public void setKhuyenMai(Boolean KhuyenMai) {
        this.KhuyenMai = KhuyenMai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", maLoai=" + maLoai + ", tenSP=" + tenSP + ", hinh=" + hinh + ", donGia=" + donGia + ", KhuyenMai=" + KhuyenMai + '}';
    }
    
}
