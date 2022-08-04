import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        NodeManager manager = new NodeManager(new Comparator<Node>() {
            public int compare(Node o1, Node o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        manager.add(50);
        manager.add(25);
        manager.add(35);
        manager.add(15);
        manager.add(45);
        manager.add(10);
        manager.add(30);
        manager.add(5);
        manager.add(75);
        manager.add(65);
        manager.add(85);
        manager.add(55);
        manager.add(95);
        manager.add(70);
        manager.add(80);
        manager.add(60);
        manager.add(90);
        manager.add(100);
        System.out.println(manager.getGreaterThen(15));
    }
}
