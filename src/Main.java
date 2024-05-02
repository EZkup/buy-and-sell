import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);
        String[] arraystring = {" 1ไก่ทอดหาดใหญ่ "," 2KFC "," 3น้ำโค้ก "," 4น้ำเป๊ปซี่ "," 5อื่นๆ "};
        //System.out.println(arraystring[0]+" "+arraystring[1]+" "+arraystring[2]+" "+arraystring[3]+" "+arraystring[4]);
        System.out.println(" 1ไก่ทอดหาดใหญ่ " + "\n" + " 2KFC " + "\n" + " 3น้ำโค้ก " + "\n" + " 4น้ำเป๊ปซี่ " + "\n" + " 5อื่นๆ ");
        int Menu = scnner.nextInt();
        System.out.print("เลือกรายการสินค้าของท่าน");
        String name = scnner.next();

       int yes =  printname(Menu);

                }

    public static void printname(int Menu) {
        String[] arraystring = {" 1ไก่ทอดหาดใหญ่ ", " 2KFC ", " 3น้ำโค้ก ", " 4น้ำเป๊ปซี่ ", " 5อื่นๆ "};
        if (Menu == 5) {
            System.out.println(arraystring[Menu - 1]);
        } else if (Menu == 4) {
            System.out.println(arraystring[Menu - 1]);

        } else if (Menu == 3) {
            System.out.println(arraystring[Menu - 1]);

        } else if (Menu == 2) {
            System.out.println(arraystring[Menu - 1]);

        } else if (Menu == 1) {
            System.out.println(arraystring[Menu - 1]);

        }
    }
 }