public class Department {
    private String maBoPhan;
    private String tenBoPhan;
    private int slNV;

    public Department(String maBoPhan, String tenBoPhan, int slNV) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.slNV = slNV;
    }

    public Department(){
        this.maBoPhan="";
        this.tenBoPhan = "";
        this.slNV = 0;
    }

    public String getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public int getSlNV() {
        return slNV;
    }

    public void setSlNV(int slNV) {
        this.slNV = slNV;
    }

    @Override
    public String toString(){
        return "Mã bộ phận: " + maBoPhan + ", Tên bộ phận: " + tenBoPhan + ", số lượng NV " + slNV;
    }
}
