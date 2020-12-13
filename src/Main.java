import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static String choice = "0";

    public static void main(String[] args) {
        do {
            showMenu();
        } while (choice != "0");
    }

    private static void showMenu() {
        System.out.println("----Phần mềm quản lý khách sạn----");
        System.out.println("1.Danh sách phòng cho thuê");
        System.out.println("2.Tạo phòng");
        System.out.println("3.Tìm kiếm thông tin khách hàng");
        System.out.println("4.Thanh toán");
        System.out.println("0.Thoát chương trình");
        System.out.print("Lựa chọn của bạn: ");

        choice = sc.nextLine();
        String regex = "[0-4]";
        boolean result = isValidate(choice,regex);
        if (result) {
            switch (Integer.valueOf(choice)) {
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(3);
                    break;
                case 4:
                    System.out.println(4);
                    break;
                case 0:
                    System.out.println("----------Chương trình kết thúc----------");
                    System.exit(0);
            }
        }else {
            System.out.println("Lựa chọn không phù hợp\n");
        }

    }

    public static boolean isValidate(String val,String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(val);
        boolean result = matcher.matches();
        if (result)
            return true;
        return false;
    }
}
