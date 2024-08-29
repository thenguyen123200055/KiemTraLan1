/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De02;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.OptionalDouble;

/**
 *
 * @author ADMIN
 */
public class QuanLyCauThu {

    public static ArrayList<CauThu> DanhSachCauThu = new ArrayList<>();

    public QuanLyCauThu() {
        DanhSachCauThu = new ArrayList<>();

        DanhSachCauThu.add(new CauThu(7, "Nguyen Van Met", 1995, 5999, 584, 50));
        DanhSachCauThu.add(new CauThu(10, "Nguyen Van Moi", 1980, 8889, 384, 50));
        DanhSachCauThu.add(new CauThu(17, "Nguyen Van Lam", 1998, 7999, 584, 0));
        DanhSachCauThu.add(new CauThu(12, "Nguyen Van lam", 1999, 5999, 584, 50));
        DanhSachCauThu.add(new CauThu(19, "Nguyen Van Roi", 2005, 97999, 784, 50));
        DanhSachCauThu.add(new CauThu(21, "Nguyen Van Troi", 1970, 5999, 584, 0));
        DanhSachCauThu.add(new CauThu(47, "Nguyen Van Oi", 1993, 2999, 584, 50));
        DanhSachCauThu.add(new CauThu(66, "Nguyen Van Cuu", 2006, 6999, 504, 590));
        DanhSachCauThu.add(new CauThu(11, "Nguyen Van Toi", 2000, 6999, 884, 0));
        DanhSachCauThu.add(new CauThu(1, "Nguyen Van Voi", 1999, 5899, 504, 50));
        DanhSachCauThu.add(new CauThu(14, "Nguyen Van Voiii", 2000, 11999, 584, 50));

    }

    private boolean kiemTraSoAo(int soAo) {
        for (CauThu cauThu : DanhSachCauThu) {
            if (cauThu.getSoao() == soAo) {
                return true;
            }
        }
        return false;
    }

    public boolean themCauThu(CauThu cauThu) {
        if (!kiemTraSoAo(cauThu.getSoao())) {
            DanhSachCauThu.add(cauThu);
            return true;
        }
        return false;
    }

    public void xuatDanhSachCauThu() {
        double tongLuong = 0;
        for (CauThu cauThu : DanhSachCauThu) {
            System.out.println(cauThu);
            tongLuong += cauThu.tinhLuongThucLanh();
        }
        System.out.printf("Tien luong clb phai tra: %.2f%n", tongLuong);
    }

    public void timCauThuLuongThapNhat() {
        OptionalDouble minLuong = DanhSachCauThu.stream()
                .mapToDouble(CauThu::tinhLuongThucLanh)
                .min();

        if (minLuong.isPresent()) {
            double min = minLuong.getAsDouble();
            System.out.println("Cau Thu co luong thuc thap nhat: ");
            DanhSachCauThu.stream()
                    .filter(cauThu -> cauThu.tinhLuongThucLanh() == min)
                    .forEach(System.out::println);
        }
    }
    public void sapXepTheoLuongThucLanh() {
        DanhSachCauThu.sort(Comparator.comparingDouble(CauThu::tinhLuongThucLanh).reversed());
        System.out.println("Danh sach cau thu sau khi sap xep theo luong giam dan: ");
        xuatDanhSachCauThu();
    }
    public void tinhDoTuoiTrungBinh() {
        int namHienHanh = 2024; // Thay đổi nếu cần thiết
        double TuoiTrungBinh = DanhSachCauThu.stream()
                .mapToInt(cauThu -> namHienHanh - cauThu.getNamsinh())
                .average()
                .orElse(0);
        
        System.out.printf("Do tuoi trung binh cua cac cau thu: ", TuoiTrungBinh);
    }
}

