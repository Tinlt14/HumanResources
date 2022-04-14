public class Employee extends Staff implements ICalculator{
    private int gioLamThem;
    public Employee(int maNV, String tenNV, int tuoi, double hsLuong, String ngayVaoLam, String boPhan, int soNgayNghi, int gioLamThem) {
        super(maNV, tenNV, tuoi, hsLuong, ngayVaoLam, boPhan, soNgayNghi);
        this.gioLamThem = gioLamThem;
    }

    public int getGioLamThem() {
        return gioLamThem;
    }

    public void setGioLamThem(int gioLamThem) {
        this.gioLamThem = gioLamThem;
    }


    public double calculateSalary(){
        return getHsLuong() * 3000000 + gioLamThem * 200000;
    }

    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Giờ làm thêm: " + gioLamThem);
    }

    @Override
    public String toString(){
        return "[Mã nhân viên: " + getMaNV() + ", Tên nhân viên: " + getTenNV() + ", Năm sinh" + getTuoi() + ", Bộ phận: " + getBoPhan() +"]";
    }
}
