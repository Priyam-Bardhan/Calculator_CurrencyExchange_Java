import java.util.*;

public class CurrencyExchangeANDcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        while (true) {
            System.out.println("i.Enter 1 for using only the calculator. ");
            System.out.println("ii.Enter 2 for Currency Exchange.");
            System.out.println("iii.Enter 3 for EXIT.");
            n = sc.nextInt();

            System.out.print("\n");

            if (n == 1) {
                calculator();
            } else if (n == 2) {
                System.out.println("A. Enter 1 for Changing INR to US Dollar.");
                System.out.println("B. Enter 2 for changing INR to Euro.");
                System.out.println("C. Enter 3 for changing INR to Dirham.");
                System.out.println("D. Enter 4 for changing INR to Kuwaiti Dinar.");
                System.out.println("E. Enter 5 for changing INR to British Pound.");
                System.out.println("F. Enter 6 for changing INR to Indonesian Rupaiah.");
                System.out.println("G. Enter 7 for changing INR to Vietnamese Dong.");
                System.out.println("H. Enter 8 for changing INR to Japanese Yen.");
                System.out.println("I. Enter 9 for changing INR to Bahraini Dinar.");
                System.out.println("J. Enter 10 for changing INR to Jordanian Dinar.");
                System.out.println("K. Enter 11 for changing INR to Nepalese Rupee.");
                System.out.println("L. Enter 12 for changing INR to Bhutanese Ngultrum.");
                System.out.println("M. Enter 13 for changing INR to Pakistani Rupee.");
                System.out.println("N. Enter 14 for changing INR to Chinese Yuan.");
                x = sc.nextInt();

                System.out.print("\n");

                System.out.println("INR:-");
                double rs = sc.nextFloat();
                double q;
                switch (x) {
                    case 1:
                        q = usdollar(rs);
                        System.out.println("After converting the INR currency to US Dollar the result is: " + q);
                        break;

                    case 2:
                        q = euro(rs);
                        System.out.println("After converting the INR currency to Euro the result is: " + q);
                        break;

                    case 3:
                        q = dirham(rs);
                        System.out.println("After converting the INR currency to Dirham the result is: " + q);
                        break;

                    case 4:
                        q = kuwaiti(rs);
                        System.out.println("After converting the INR currency to Kuwaiti Dinar the result is: " + q);
                        break;

                    case 5:
                        q = british(rs);
                        System.out.println("After converting the INR currency to British Pound the result is: " + q);
                        break;
                    case 6:
                        q = indoneshian(rs);
                        System.out
                                .println("After convering the INR currency to Indoneshian Rupiah the result is: " + q);
                        break;

                    case 7:
                        q = vietnamiz(rs);
                        System.out.println("After converting the INR currency to Vietnamiz Dong the result is: " + q);
                        break;

                    case 8:
                        q = yen(rs);
                        System.out.println("After converting the INR currency to Japanese Yen the result is: " + q);
                        break;

                    case 9:
                        q = baharaini(rs);
                        System.out.println("After converting the INR currency to Baharaini Dinar the result is: " + q);
                        break;

                    case 10:
                        q = jordanian(rs);
                        System.out.println("After converting the INR currency to Jordanian Dinar the result is: " + q);
                        break;

                    case 11:
                        q = Nepalese(rs);
                        System.out.println("After converting the INR currency to Nepalese Rupee the result is: " + q);
                        break;

                    case 12:
                        q = Bhutanese(rs);
                        System.out
                                .println("After converting the INR currency to Bhutanese Ngultrum the result is: " + q);
                        break;

                    case 13:
                        q = Pakistani(rs);
                        System.out.println("After converting the INR currency to Pakistani Rupee the result is: " + q);
                        break;

                    case 14:
                        q = Chinese(rs);
                        System.out.println("After converting the INR currency to Chinese Yuan the result is: " + q);
                        break;

                    default:
                        System.out.println("--->>>WRONG INPUT SELECTED<<<---");
                }

            } else {
                System.exit(0);
            }
            System.out.println("\n");
        }
    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operator{+,-,*,/}:");
        String operator = sc.nextLine();
        double a, b, c;
        System.out.println("Enter the first number: ");
        a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        b = sc.nextDouble();

        switch (operator) {
            case "+":
                c = a + b;
                System.out.println("The result after adding both the values is: " + c);
                break;

            case "-":
                c = a - b;
                System.out.println("The result after subtracting both the values is: " + c);
                break;

            case "*":
                c = a * b;
                System.out.println("The result after multipling both the values is: " + c);
                break;

            case "/":
                c = a / b;
                System.out.println("The result after quotient of both the values is:" + c);
                break;

            default:
                System.out.println("Error!");
        }
    }

    public static double usdollar(double rs) {
        double ans;
        ans = rs / 83.49;
        return ans;
    }

    public static double euro(double rs) {
        double ans;
        ans = rs / 90.28;
        return ans;
    }

    public static double dirham(double rs) {
        double ans;
        ans = rs / 22.73;
        return ans;
    }

    public static double kuwaiti(double rs) {
        double ans;
        ans = rs / 272.69;
        return ans;
    }

    public static double british(double rs) {
        double ans;
        ans = rs / 106.56;
        return ans;
    }

    public static double indoneshian(double rs) {
        double ans;
        ans = rs * 0.0051;
        return ans;
    }

    public static double vietnamiz(double rs) {
        double ans;
        ans = rs * 304.46;
        return ans;
    }

    public static double yen(double rs) {
        double ans;
        ans = rs * 1.89;
        return ans;
    }

    public static double baharaini(double rs) {
        double ans;
        ans = rs * 0.0045;
        return ans;
    }

    public static double jordanian(double rs) {
        double ans;
        ans = rs * 0.0085;
        return ans;
    }

    public static double Nepalese(double rs) {
        double ans;
        ans = rs * 1.60;
        return ans;
    }

    public static double Bhutanese(double rs) {
        double ans;
        ans = rs * 1;
        return ans;
    }

    public static double Pakistani(double rs) {
        double ans;
        ans = rs * 3.33;
        return ans;
    }

    public static double Chinese(double rs) {
        double ans;
        ans = rs / 11.50;
        return ans;
    }
}