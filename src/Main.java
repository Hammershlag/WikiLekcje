import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        List<Student> students = new ArrayList<>();
        /**
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        */
        for (int i = 1; i < 1000; i++) list.add((int) (Math.random()*100_000));
        System.out.println(list);

        list.sort((o1, o2) -> o1 - o2);

        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) System.out.println(list.get(i));
//        }

        list.stream().filter(i -> i % 2 == 0).forEach(v -> {
            System.out.println(v);
            v = v+1;
            System.out.println(v);
        });
        list.stream().map(i -> i+1).forEach(System.out::println);

        System.out.println("----------------");
        list.stream().filter(i -> i % 2 == 0).map(v -> v*7).filter(v -> v % 3 == 0)
                .sorted().findFirst().ifPresent(System.out::println);


    }

    public static String datingRange(int age) {
        return String.valueOf(age/2+7) + "-" + String.valueOf((age-7)*2);
    }
}