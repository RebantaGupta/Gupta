import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static ArrayList<Node> graph;
    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS();
    }

    private static void BFS() {
        //Your code here.  Feel free to modify signature or add helper functions.
        Node[] bfs = new Node[graph.size()];
        bfs[0] = graph.get(0);
        bfs[0].setVisited(true);
        ArrayList<Node> q = new ArrayList<>(List.of(bfs[0]));
        while (!q.isEmpty()) {
            Node currNode = q.remove(0);
            System.out.println(currNode.getKey());
            for (int neighborIdx : currNode.getNodes()) {
                Node neighborNode = graph.get(neighborIdx - 1);
                if (!neighborNode.isVisited()) {
                    neighborNode.setVisited(true);
                    q.add(neighborNode);
                }
            }
        }

    }



    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("src/tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}