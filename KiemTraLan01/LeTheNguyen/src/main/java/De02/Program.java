/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package De02;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyCauThu qlCauThu = new QuanLyCauThu();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Xuat danh sach cau thu");
            System.out.println("2. Them moi cau thu");
            System.out.println("3. Tìm cau thu co luong thuc cao nhat");
            System.out.println("4. Sap xep");
            System.out.println("5. Tinh luong trung binh cua cac cau thu");
            System.out.println("0. Out");
            System.out.print("Chon chuc nang (0-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng newline còn lại

            switch (choice) {
                case 1:
                    // Xuất thông tin danh sách cầu thủ
                    qlCauThu.xuatDanhSachCauThu();
                    break;

                case 2:
                    // Thêm cầu thủ mới
                    System.out.print("Nhap so ao: ");
                    int soAo = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng newline còn lại

                    System.out.print("Nhap ho ten: ");
                    String hoTen = scanner.nextLine();

                    System.out.print("Nhap nam sinh: ");
                    int namSinh = scanner.nextInt();

                    System.out.print("Nhap luong cung: ");
                    double luongCung = scanner.nextDouble();

                    System.out.print("Nhap tien thuong: ");
                    double tienThuong = scanner.nextDouble();

                    System.out.print("Nhap tien phat: ");
                    double tienPhat = scanner.nextDouble();

                   CauThu cauthu = new CauThu(soAo, hoTen, namSinh, luongCung, tienThuong, tienPhat);
                    if (qlCauThu.themCauThu(cauthu)) {
                        System.out.println("Them cau thu thanh cong!");
                    } else {
                        System.out.println("So ao da ton tai!");
                    }
                    break;

                case 3:
                    qlCauThu.timCauThuLuongThapNhat();
                    break;
                case 4:
                    qlCauThu.sapXepTheoLuongThucLanh();
                    break;
                case 5:
                    qlCauThu.tinhDoTuoiTrungBinh();
                    break;
                case 6:
                    System.out.println("Thoat.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 6.");
            }
        }

        
    }
}
