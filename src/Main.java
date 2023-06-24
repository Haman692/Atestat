
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList toysList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1. Список игрушек\n2.Добавить игрушку\n3.Розыгрыш игрушек");
            int i = scan.nextInt();
            if(i == 1) {
                System.out.println("Список игрушек:\n" + toysList);
                System.out.println("Изменить шанс выпадения?\n1.Да\n2.Нет");
                i = scan.nextInt();
                if(i == 1){
                    toysList = helper.chenge(toysList);
                }
            }
            else if (i == 2){
                toysList = helper.addToys(toysList);
            } else if (i ==3) {
                toysList = helper.draw(toysList);
            } else {
                System.out.println("Невернный ввод");
            }
        }
    }
}