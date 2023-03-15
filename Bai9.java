import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String s = input.nextLine();
        int lower_count = 0;
        int upper_count = 0;
        int digit_count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                lower_count++;
            } else if (Character.isUpperCase(c)) {
                upper_count++;
            } else if (Character.isDigit(c)) {
                digit_count++;
            }
        }
        System.out.println("Số ký tự thường trong chuỗi là: " + lower_count);
        System.out.println("Số ký tự hoa trong chuỗi là: " + upper_count);
        System.out.println("Số chữ số trong chuỗi là: " + digit_count);
    }
}