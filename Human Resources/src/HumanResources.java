import java.util.*;
public class HumanResources {
    private static final ArrayList<Staff> staffList = new ArrayList<Staff>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        themNVThuong(1,"Nguyễn Văn A",1997, 3.2,"21/3/2019","BSN",3, 5);
        themNVThuong(2,"Nguyễn Văn B",1996, 3.0,"21/4/2019","TNC",2, 8);
        themNVThuong(3,"Nguyễn Văn C",2000, 3.3,"21/5/2020","PRJ",0, 6);
        themQuanly(4,"Lê Thị Thị",1992,4.0,"23/5/2019","BSN",2,"Business Leader");
        themQuanly(5,"Lê Thị Nở",1990,4.2,"22/8/2019","PRJ",2,"Project Leader");
        themQuanly(6,"Lê Văn Văn",1993,4.0,"19/5/2019","TNC",2,"Technical Leader");
        int answer;
        do{
            Scanner input = new Scanner(System.in).useDelimiter("\n");
            System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty");
            System.out.println("2. Hiển thị các bộ phận trong công ty");
            System.out.println("3. Hiển thị các nhân viên theo từng bộ phận");
            System.out.println("4. Thêm nhân viên mới vào công ty: bao gồm 2 loại");
            System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên");
            System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty");
            System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần");
            System.out.println("8. Hiển thị bảng lương của nhân viên theo thứ tự giảm dần");
            System.out.println("0. Thoát");
            System.out.print("Nhập 1 số từ 0 - 8 để thực hiện các chức năng trên: ");
            answer = input.nextInt();
            System.out.println();
            switch (answer){
                case 1:
                    System.out.println("Danh sách nhân viên hiện có tại công ty: ");
                    dsNhanVien();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Các bộ phận trong công ty: ");
                    hienThiBoPhan();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Nhập vào bộ phận muốn hiển thị nhân viên: ");
                    String s = input.next();
                    System.out.println("Danh sách nhân viên trong bộ phận " + s + ":");
                    hienThiNhanvien(s);
                    System.out.println();
                    break;
                case 4:
                    themNV();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Tìm kiếm thông tin theo tên nhập 1.");
                    System.out.println("Tìm kiếm thông tin theo mã nhân viện nhập 2.");
                    int number =  input.nextInt();
                    if(number == 1){
                        System.out.print("Nhập tên đầy đủ của nhân viên: ");
                        String s1 = input.next();
                        thongTinNV(s1);
                        System.out.println();
                    } else if(number == 2){
                        System.out.print("Nhập mã nhân viên: ");
                        int maNV = input.nextInt();
                        thongTinNV(maNV);
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Lương của nhân viên trong công ty: ");
                    hienThiBangLuongNV();
                    System.out.println();
                    break;
                case 7:
                    luongTangDan();
                    System.out.println();
                    break;
                case 8:
                    luongGiamDan();
                    System.out.println();
                case 0:
                    break;
            }
        }while (answer != 0);
    }
    //Hiển thị danh sach nhân viên
    public static void dsNhanVien(){
        xepLaiDSNV();
        for(Staff staff : staffList){
            if(staff instanceof Employee employee){
                System.out.println(employee);
            } else if(staff instanceof Manager manager){
                System.out.println(manager);
            }
        }
    }

    // Thêm nhân viên cho lựa chọn 1 và 2 để thêm nhân viên và quản lý

    public static void themNV(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int maNV = staffList.size() + 1;
        String ngayVaoLam, boPhan = "", chucVu;
        int tuoi, soNgayNghi, gioLamThem, soBoPhan;
        double hsLuong;
        System.out.println("Nhập 1 nếu thêm Nhân Viên!");
        System.out.println("Nhập 2 nếu thêm Quản lý!");
        int number = sc.nextInt();

        if(number == 1){
            System.out.print("Nhập vào tên nhân viên: ");
            String tenNV = sc.next();
            System.out.print("Nhâp vào năm sinh nhân viên: ");
            tuoi = sc.nextInt();
            System.out.print("Nhập vào hệ số lương của nhân viên: ");
            hsLuong = sc.nextDouble();
            System.out.print("Nhâp vào ngày vào làm của nhân viên: ");
            ngayVaoLam = sc.next();
            System.out.print("Nhâp vào chọn bộ phận làm việc của nhân viên của nhân viên!");
            System.out.print(" 1.BSN    2.PRJ   3TNC");
            soBoPhan = sc.nextInt();
            boolean test = true;
            do {
                if (soBoPhan == 1) {
                    boPhan = "BSN";
                    test = false;
                }
                if (soBoPhan == 2) {
                    boPhan = "PRJ";
                    test = false;

                }
                if (soBoPhan == 3) {
                    boPhan = "TNC";
                    test = false;

                }
            } while(test);
            System.out.print("Nhâp vào số ngày nghĩ của nhân viên: ");
            soNgayNghi = sc.nextInt();
            System.out.print("Nhâp vào giờ làm thêm của nhân viên: ");
            gioLamThem = sc.nextInt();
            themNVThuong(maNV, tenNV, tuoi, hsLuong, ngayVaoLam, boPhan, soNgayNghi, gioLamThem);
        } else if(number == 2){
            System.out.print("Nhập vào tên quản lý: ");
            String tenNV = sc.next();
            System.out.print("Nhâp vào năm sinh quản lý: ");
            tuoi = sc.nextInt();
            System.out.print("Nhập vào hệ số lương của quản lý: ");
            hsLuong = sc.nextDouble();
            System.out.print("Nhâp vào ngày vào làm của quản lý: ");
            ngayVaoLam = sc.next();
            System.out.print("Nhâp vào chọn bộ phận làm việc của nhân viên của nhân viên!");
            System.out.print(" 1.BSN    2.PRJ   3TNC");
            soBoPhan = sc.nextInt();
            boolean test = true;
            do {
                if (soBoPhan == 1) {
                    boPhan = "BSN";
                    test = false;
                }
                if (soBoPhan == 2) {
                    boPhan = "PRJ";
                    test = false;

                }
                if (soBoPhan == 3) {
                    boPhan = "TNC";
                    test = false;

                }
            } while(test);
            System.out.print("Nhâp vào số ngày nghĩ của quản lý: ");
            soNgayNghi = sc.nextInt();
            System.out.print("Nhâp vào chức vụ của quản lý: ");
            chucVu = sc.next();
            themQuanly(maNV, tenNV, tuoi, hsLuong, ngayVaoLam, boPhan, soNgayNghi, chucVu);
        }
    }
    // Thêm nhân viên thường
    public static void themNVThuong(int maNV, String tenNV, int tuoi, double hsLuong, String ngayVaoLam,String boPhan, int soNgayNghi, int gioLamThem){
        Staff employee = new Employee(maNV, tenNV,tuoi, hsLuong, ngayVaoLam, boPhan, soNgayNghi, gioLamThem);
        staffList.add(employee);
    }
    // Thêm nhân quản lý
    public static void themQuanly(int maNV, String tenNV, int tuoi, double hsLuong, String ngayVaoLam,String boPhan, int soNgayNghi, String chucVu){
        Staff manager = new Manager(maNV, tenNV,tuoi, hsLuong, ngayVaoLam, boPhan, soNgayNghi, chucVu);
        staffList.add(manager);
    }
    //Hiển thị bộ phận
    public static void hienThiBoPhan(){
        int count1 =0;
        int count2 =0;
        int count3 =0;
        // Duyệt qua hết danh sách để đếm số lượng nhân viên của từng bộ phận
        for(int i = 0; i< staffList.size(); i++){
            if(staffList.get(i).getBoPhan().equals("BSN")){
                count1++;
            } else if(staffList.get(i).getBoPhan().equals("PRJ")) {
                count2++;
            } else if(staffList.get(i).getBoPhan().equals("TNC")) {
                count3++;
            }
        }
        Department boPhan1 = new Department("BSN","Business",count1);
        Department boPhan2 = new Department("PRJ","Project",count2);
        Department boPhan3 = new Department("TNC","Technical",count3);

        System.out.println(boPhan1.toString());
        System.out.println(boPhan2.toString());
        System.out.println(boPhan3.toString());
    }
//Hiện thị nhân viên với tham số nhập từ bàn phím là bộ phận làm việc
    public static void  hienThiNhanvien(String boPhan){
        for (Staff staff : staffList) {
            if (staff.getBoPhan().equals(boPhan)) {
                System.out.println(staff.toString());
            }
        }
    }
//Hiển thị thông tin nhân viên từ mã nhân viên
    public static void thongTinNV(int maNV) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getMaNV() == maNV) {
                staffList.get(i).displayInformation();
                System.out.println("");
            }
        }
    }

    public static void thongTinNV(String tenNV){
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getTenNV().toLowerCase().equals(tenNV.toLowerCase())) {
                staffList.get(i).displayInformation();
                System.out.println("");
            } else {
                System.out.println("Không có nhân viên bạn muôn tìm!!");
                break;
            }
        }
    }

    public static void hienThiBangLuongNV(){
        for(Staff staff : staffList){
            if(staff instanceof Employee){
                Employee employee =(Employee) staff;
                System.out.println("Mã nhân viên: " + employee.getMaNV() + ", Tên nhân viên: " + employee.getTenNV() + ", Lương: " + Math.round(employee.calculateSalary()) + "vnd");
            } else if(staff instanceof Manager){
                Manager manager = (Manager) staff;
                System.out.println("Mã nhân viên: " + manager.getMaNV() + ", Tên nhân viên: " + manager.getTenNV() + ", Lương: " + Math.round(manager.calculateSalary()) + "vnd");
            }
        }
    }

    public static void luongTangDan(){
        System.out.println("Bảng Lương từ nhỏ đến lớn của công ty");
        //Sử dụng Comparator để sắp xết lại danh sách
        Collections.sort(staffList, new Comparator<Staff>() {
            double salary1;
            double salary2;
            @Override
            public int compare(Staff o1, Staff o2) {
                if(o1 instanceof Employee){
                    Employee employee1 = (Employee) o1;
                    salary1 = employee1.calculateSalary();
                } else if(o1 instanceof Manager){
                    Manager manager1 = (Manager) o1;
                    salary1 = manager1.calculateSalary();
                }

                if(o2 instanceof Employee){
                    Employee employee2 = (Employee) o2;
                    salary2 = employee2.calculateSalary();
                }else if(o2 instanceof Manager){
                    Manager manager2 = (Manager) o2;
                    salary2 = manager2.calculateSalary();
                }

                if(salary1 > salary2){
                    return 1;
                }else if(salary1 < salary2){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        hienThiBangLuongNV();

    }

    public static void luongGiamDan(){
        System.out.println("Bảng Lương từ lớn đến nhỏ của công ty");

        Collections.sort(staffList, new Comparator<Staff>() {
            double salary1;
            double salary2;
            @Override
            public int compare(Staff o1, Staff o2) {
                if(o1 instanceof Employee employee1){
                    salary1 = employee1.calculateSalary();
                } else if(o1 instanceof Manager manager1){
                    salary1 = manager1.calculateSalary();
                }

                if(o2 instanceof Employee employee2){
                    salary2 = employee2.calculateSalary();
                }else if(o2 instanceof Manager manager2){
                    salary2 = manager2.calculateSalary();
                }

                if(salary1 < salary2){
                    return 1;
                }else if(salary1 > salary2){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        hienThiBangLuongNV();
    }

    public static void xepLaiDSNV(){
        Collections.sort(staffList, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                return o1.getMaNV() > o2.getMaNV() ? 1 : -1;
            }
        });
    }

}
