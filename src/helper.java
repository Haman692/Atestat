import java.util.ArrayList;
import java.util.Scanner;

public class helper {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList addToys(ArrayList<toys> toysList){

        System.out.println("Введите имя игрушки");
        String name = sc.next();
        System.out.println("Введите количесвто");
        int count = sc.nextInt();
        System.out.println("Введите шанс выйграша");
        int weight = sc.nextInt();
        toysList.add(new toys(toysList.size(),name,count,weight));
        return toysList;
    }

    public static ArrayList chenge(ArrayList<toys> toysList) {
        System.out.println("Введите id игрушки");
        int id = sc.nextInt();
        System.out.println("Новый шанс");
        int weight = sc.nextInt();
        toysList.get(id).setWeight(weight);
        return toysList;
    }

    public static ArrayList draw(ArrayList<toys> toysList) {
        int weight = 0;
        for (int i = 0; i < toysList.size(); i++) {
            weight += toysList.get(i).getWeight();
        }
        double rnd = Math.random() * ++ weight;
        for (int i = 0; i < toysList.size(); i++) {
            if (toysList.get(i).getWeight() >= rnd){
                System.out.println("Выдана игрушка " + toysList.get(i).getName());
                toysList.get(i).setCount(toysList.get(i).getCount() - 1);
                break;
            }
        }
        return toysList;
    }
}
