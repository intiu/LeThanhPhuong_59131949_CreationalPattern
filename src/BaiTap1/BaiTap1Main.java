/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author ltpnt
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hd = new HoaDon.HoaDonBuilder().addMaHD("ZA001")
                .addNgayBan("18/05/2020")
                .addTenKH("Lê Thành Phương")
                .build();
        CTHD cthd1 = new CTHD.CTHDBuilder().addTenSP("Điện thoại Iphone")
                .addSoLuong(5)
                .addDonGia(20000000)
                .addChietKhau("10%")
                .build();
        CTHD cthd2 = new CTHD.CTHDBuilder().addTenSP("Laptop Dell")
                .addSoLuong(1)
                .addDonGia(15000000)
                .addChietKhau("10%")
                .build();
        hd.addCTHD(cthd2);
        hd.addCTHD(cthd1);
        hd.xuatHoaDon();
    }
    
}
