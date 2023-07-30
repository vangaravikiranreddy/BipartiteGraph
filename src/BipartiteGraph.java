import java.util.ArrayList;
import java.util.Arrays;

public class BipartiteGraph {
    public void addAdjacentNodes(int[][] arr, ArrayList<ArrayList<Integer>> adjList, int size) {
        for (int i = 0; i < size; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int []a : arr) {
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }
    }

    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adjList, int[] vst) {
        for (int nextNode : adjList.get(node)) {
            if (vst[nextNode] == -1) {
                vst[nextNode] = 1 - vst[node];
                if (!dfs(nextNode, adjList, vst)) {
                    return false;
                }
            } else if (vst[node] == vst[nextNode]) {
                return false;
            }
        }
        return true;
    }
    public boolean isBipartiteGraph(int[][] arr, int size) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();  // storing adjacent nodes of each node

        addAdjacentNodes(arr, adjList, size);

        int[] vst = new int[size];  // keeps track of visited nodes

        Arrays.fill(vst, -1);

        int node = 0;

        vst[node] = 0;

        return dfs(node, adjList, vst);
    }
}
