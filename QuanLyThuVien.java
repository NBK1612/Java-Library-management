import java.util.Scanner;

public class QuanLyThuVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice;
        do {
            System.out.println("Chọn một trong các lựa chọn sau:");
            System.out.println("1. Độc giả");
            System.out.println("2. Thủ thư");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.docGiaMenu();
                    break;
                case 2:
                    library.thuThuMenu();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 3);
    }
}

class Library {
    Scanner scanner = new Scanner(System.in);

    void docGiaMenu() {
        int choice;
        do {
            System.out.println("\nChọn một trong các lựa chọn sau:");
            System.out.println("1. Đổi mật khẩu");
            System.out.println("2. Cập nhật thông tin cá nhân");
            System.out.println("3. Thông tin thẻ mượn");
            System.out.println("4. Mượn trả sách");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    doiMatKhau();
                    break;
                case 2:
                    capNhatThongTinCaNhan();
                    break;
                case 3:
                    thongTinTheMuon();
                    break;
                case 4:
                    muonTraSach();
                    break;
                case 5:
                    timKiemSach();
                    break;
                case 6:
                    System.out.println("Thoát chức năng độc giả.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 6);
    }

    void doiMatKhau() {
        // Thêm logic đổi mật khẩu ở đây
        System.out.println("Chức năng đổi mật khẩu.");
    }

    void capNhatThongTinCaNhan() {
        // Thêm logic cập nhật thông tin cá nhân ở đây
        System.out.println("Chức năng cập nhật thông tin cá nhân.");
    }

    void thongTinTheMuon() {
        // Thêm logic hiển thị thông tin thẻ mượn ở đây
        System.out.println("Chức năng thông tin thẻ mượn.");
    }

    void muonTraSach() {
        // Thêm logic mượn trả sách ở đây
        System.out.println("Chức năng mượn trả sách.");
    }

    void timKiemSach() {
        // Thêm logic tìm kiếm sách ở đây
        System.out.println("Chức năng tìm kiếm sách.");
    }

    void thuThuMenu() {
        System.out.println("Thủ thư đã được chọn.");
        // Thêm các chức năng cho thủ thư ở đây
    }
}
