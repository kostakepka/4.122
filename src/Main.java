import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("введите a ");
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();

        System.out.print("введите b ");
        Scanner sb = new Scanner(System.in);
        int b = sb.nextInt();

        System.out.print("введите c ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();


        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            System.out.println("Может");

        } else {
            System.out.println("Нет");

        }
    }}