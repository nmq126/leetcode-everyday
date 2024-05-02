import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void modify(int x, int y) {
        x = 100;
        y = 200;
        System.out.println("X - Y from modidy: " + x + " - " + y);
    }
    public static void main(String[] args) {
//        String first = "InterviewBit";
//        String second = new String("InterviewBit");
//        System.out.println(first == second);
//        String third = new String("InterviewBit");
//        System.out.println(second == third);
//        System.out.println('b' + 'i' + 't');
//        System.out.println("b" + "i" + "t");
//
//        int x = 1;
//        int y = 2;
//        System.out.println("X - Y before modidy: " + x + " - " + y);
//
//        modify(x, y);
//        System.out.println("X - Y after modidy: " + x + " - " + y);
        List<String> result = Stream.of("bạn", "hãy", "like", "Fanpage", "loda","dể","cập","nhật","nhiều","hơn")
                .filter(s -> {
                    System.out.println("[filtering] " + s);
                    return s.length()>=4;
                })
                .map(s -> {
                    System.out.println("[mapping] " + s);
                    return s.toUpperCase();
                })
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("----------------------");
        System.out.println("Result:");
        result.forEach(System.out::println);
        String s = null;
        System.out.println("String" + s.equals(null));

    }
}