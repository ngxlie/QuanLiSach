import java.util.Scanner;

public class BTTuan3 {
    private String masach;
    private String tensach;
    private String tacgia;
    private int namxuatban;
    private double dongia;
    private int soluong;

    // Ma sach
    public void setmasach(String ms) {
        masach = ms;
    }

    public String getmasach() {
        return masach;
    }

    // Ten sach
    public void settensach(String ts) {
        tensach = ts;
    }

    public String gettensach() {
        return tensach;
    }

    // Tac gia
    public void settacgia(String tg) {
        tacgia = tg;
    }

    public String gettacgia() {
        return tacgia;
    }

    // Nam xuat ban
    public void setNamXuatBan(int namxb) {
        namxuatban = namxb;
    }

    public int getNamXuatBan() {
        return namxuatban;
    }

    // Don gia
    public void setDonGia(double gia) {
        dongia = gia;
    }

    public double getDonGia() {
        return dongia;
    }

    // So luong
    public void setSoLuong(int sl) {
        soluong = sl;
    }

    public int getSoLuong() {
        return soluong;
    }

    // Nhap thong tin sach
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        setmasach(sc.nextLine());

        System.out.print("Nhap ten sach: ");
        settensach(sc.nextLine());

        System.out.print("Nhap tac gia: ");
        settacgia(sc.nextLine());

        System.out.print("Nhap nam xuat ban: ");
        setNamXuatBan(sc.nextInt());
        sc.nextLine();

        System.out.print("Nhap don gia: ");
        setDonGia(sc.nextDouble());
        sc.nextLine();

        System.out.print("Nhap so luong: ");
        setSoLuong(sc.nextInt());
        sc.nextLine();
    }

    // Xuat thong tin sach
    public void xuat() {
        System.out.println("\n--- THONG TIN SACH ---");
        System.out.println("Ma sach: " + getmasach());
        System.out.println("Ten sach: " + gettensach());
        System.out.println("Tac gia: " + gettacgia());
        System.out.println("Nam xuat ban: " + getNamXuatBan());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("So luong: " + getSoLuong());
    }

    // Tinh thanh tien
    public double tinhThanhTien() {
        return getDonGia() * getSoLuong();
    }

    // Tinh phi van chuyen  
    public double tinhPhiVanChuyen() {
        return tinhThanhTien() * 5 / 100;
    }

    // Tinh tong tien nhap kho
    public double tinhTongTien() {
        return tinhThanhTien() + tinhPhiVanChuyen();
    }

    // Ham main
    public static void main(String[] args) {
        BTTuan3 s = new BTTuan3();

        s.nhap();
        s.xuat();

        System.out.println("Thanh tien: " + s.tinhThanhTien());
        System.out.println("Phi van chuyen: " + s.tinhPhiVanChuyen());
        System.out.println("Tong tien nhap kho: " + s.tinhTongTien());
    }
}