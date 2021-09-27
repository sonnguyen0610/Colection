import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------------");
            System.out.println("1. Add list fraction");
            System.out.println("2. Print list");
            System.out.println("3. Add to list");
            System.out.println("4. Remove fraction in K index");
            System.out.println("5. Remove all list");
            System.out.println("6. Find max fractions");
            System.out.println("7. Update fraction in K index");
            System.out.println("0. Quit");
            System.out.print("Your choose: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Input your fraction have space");
                    String listFraction = sc.nextLine();
                    Fraction.addListToList(listFraction);
                    System.out.print("Your list: ");
                    Fraction.printList();
                    break;
                case 2:
                    System.out.print("Your list: ");
                    Fraction.printList();
                    break;
                case 3:
                    System.out.print("Input your fraction: ");
                    String fr = sc.nextLine();
                    Fraction.addToList(fr);
                    System.out.println("Add successful!: ");
                    System.out.print("Your list: ");
                    Fraction.printList();
                    break;
                case 4:
                    System.out.print("Input index you want to remove: ");
                    int indexRemove = Integer.parseInt(sc.nextLine());
                    Fraction.removeItemInList(indexRemove);
                    System.out.println("Remove successful!");
                    System.out.print("Your list: ");
                    Fraction.printList();
                    break;
                case 5:
                    Fraction.removeAllList();
                    System.out.println("Remove successful!");
                    System.out.print("Your list: ");
                    Fraction.printList();
                    break;
                case 6:
                    System.out.print("Max fractions: ");
                    Fraction.findMaxfraction();
                    break;
                case 7:
                    System.out.print("Input index you want to update: ");
                    int indexUpdate = Integer.parseInt(sc.nextLine());
                    System.out.print("Input fraction:");
                    String updateFraction=sc.nextLine();
                    Fraction.replaceItemInList(indexUpdate,updateFraction);
                    System.out.println("Update successful!");
                    System.out.print("Your list: ");
                    Fraction.printList();
                    break;

                default:
                    return;
            }
        } while (true);
    }
}
