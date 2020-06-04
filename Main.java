import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Task 1

        Car c1 = new Car("X", 1999);
        Car c2 = new Car("S", 2000);
        Car c3 = new Car("Y", 2001);
        Car c4 = new Car("Z", 2002);
        Car c5 = new Car("I", 2024);
        Car c6 = new Car("2", 1999);
        Car c7 = new Car("e", 2000);
        Car c8 = new Car("r", 2001);
        Car c9 = new Car("d", 2002);
        Car c10 = new Car("f", 2024);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);

        Collections.sort(cars);

        for (Car c : cars) {
            System.out.println(c.toString());
        }


        //Task 2
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("i0001", "a"));
        items.add(new Item("i0002", "b"));
        items.add(new Item("i0003", "c"));
        items.add(new Item("i0004", "d"));
        items.add(new Item("i0005", "e"));

        for (Item i : items) {
            i.show();
        }

        HashMap<String, String> itemsMap = new HashMap();
        for (Item i : items) {
            itemsMap.put(i.getId(), i.getName());
        }

        for (Map.Entry<String, String> entries : itemsMap.entrySet()) {
            System.out.println(entries.getKey());
            System.out.println(entries.getValue());
        }

        //Task 3
        List<Item> items2 = items.subList(2, 5);

        //Task 4
        int[] arr = new int[10];
        fillArray(arr);

        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number: ");
        int num = sc.nextInt();
        if (num < 0) {
            throw new NegativeNumberException();
        }
        return num;
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = readNumber();
            } catch (NegativeNumberException exc) {
                System.out.println("The number is negative");
                arr[i] = 0;
            }
        }
    }

}
