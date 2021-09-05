package passenger;

import java.util.Scanner;

public class passenger {
    private String hoTen;
    private boolean gioiTinh;
    private int tuoi;

    public int getTuoi(){
        return this.tuoi;
    }
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        this.hoTen = sc.nextLine();
//        System.out.println("Nam true , nữ false");
//        this.gioiTinh = sc.hasNextBoolean();
        System.out.println("Nhập tuổi: ");
        this.tuoi = sc.nextInt();
    }
    public void printInfor() {
        System.out.println("Họ và tên: "+ this.hoTen);
       // System.out.println("Giới tính"+ this.gioiTinh);
        System.out.println("Tuổi: "+ this.tuoi);
    }
}
