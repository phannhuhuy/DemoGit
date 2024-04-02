package application;
import java.util.Scanner;


public class application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Biến để lưu trữ hai số
        int num1, num2;

        // Lựa chọn phép toán
        System.out.println("Chon phep toan (1: +, 2: -, 3: *, 4: /):");
        int choice = scanner.nextInt();

        // Nhập hai số
        System.out.println("Nhap so thu nhat:");
        num1 = scanner.nextInt();
        System.out.println("Nhap so thu hai:");
        num2 = scanner.nextInt();

        // Thực hiện phép toán theo lựa chọn
        int result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Loi: Chia cho 0!");
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Lua chon khong hop le1!");
        }

        // Hiển thị kết quả
        if (choice >= 1 && choice <= 4) {
            System.out.println("Ket qua: " + num1 + " " + getOperator(choice) + " " + num2 + " = " + result);
        }
    }

    private static String getOperator(int choice) {
        switch (choice) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            default:
                return "";
        }
    }


	}