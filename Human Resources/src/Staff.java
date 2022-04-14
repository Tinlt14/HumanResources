public abstract class Staff {
    private int maNV;
    private String tenNV;
    private int tuoi;
    private double hsLuong;
    private String ngayVaoLam;
    private String boPhan;
    private int soNgayNghi;

    public Staff(int maNV, String tenNV, int tuoi, double hsLuong, String ngayVaoLam, String boPhan, int soNgayNghi) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.hsLuong = hsLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhan = boPhan;
        this.soNgayNghi = soNgayNghi;
    }

    public int getMaNV() {

        return maNV;
    }

    public String getTenNV() {

        return tenNV;
    }

    public int getTuoi() {

        return tuoi;
    }

    public double getHsLuong() {

        return hsLuong;
    }

    public String getNgayVaoLam() {

        return ngayVaoLam;
    }

    public String getBoPhan() {

        return boPhan;
    }

    public int getSoNgayNghi() {

        return soNgayNghi;
    }

    public void setMaNV(int maNV) {

        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {

        this.tenNV = tenNV;
    }

    public void setTuoi(int tuoi) {

        this.tuoi = tuoi;
    }

    public void setHsLuong(double hsLuong) {

        this.hsLuong = hsLuong;
    }

    public void setNgayVaoLam(String ngayVaoLam) {

        this.ngayVaoLam = ngayVaoLam;
    }

    public void setBoPhan(String boPhan) {

        this.boPhan = boPhan;
    }

    public void setSoNgayNghi(int soNgayNghi) {

        this.soNgayNghi = soNgayNghi;
    }

    public void displayInformation() {
        System.out.println("Mã nhân viên: " + maNV);
        System.out.println("Tên nhân viên: " + tenNV);
        System.out.println("Tuổi nhân viên: " + tuoi);
        System.out.println("Hệ số luong: " + hsLuong);
        System.out.println("Ngày vào làm: " + ngayVaoLam);
        System.out.println("Bộ phận: " + boPhan);
        System.out.println("Số ngày nghĩ: " + soNgayNghi);
    }
}
