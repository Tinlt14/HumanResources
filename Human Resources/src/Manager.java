public class Manager extends Staff implements ICalculator{
    private String chucVu;

    public Manager(int maNV, String tenNV, int tuoi, double hsLuong, String ngayVaoLam, String boPhan, int soNgayNghi, String chucVu) {
        super(maNV, tenNV, tuoi, hsLuong, ngayVaoLam, boPhan, soNgayNghi);
        this.chucVu = chucVu;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Chức vụ: " + chucVu);
    }

    public double calculateSalary() {
        double luong = 0;
        if(chucVu.equals("Business Leader")){
            luong = getHsLuong() * 5000000 + 8000000;
        } else if(chucVu.equals("Project Leader")){
            luong = getHsLuong() * 5000000 + 5000000;
        }else if(chucVu.equals("Technical Leader")){
            luong = getHsLuong() * 5000000 + 6000000;
        }
        return luong;
    }

    @Override
    public String toString(){
        return "[Mã nhân viên: " + getMaNV() + ", Tên nhân viên: " + getTenNV() + ", Năm sinh: " + getTuoi() + ", Bộ phận: " + getBoPhan() + ", Chức vụ: " + getChucVu() +"]";
    }
}
