/*
Given a undirected graph having A nodes. A matrix B of size M x 2 is given which represents the edges such that there is an edge between B[i][0] and B[i][1].

        Find whether the given graph is bipartite or not.
        A graph is bipartite if we can split it's set of nodes into two independent subsets A and B such that every edge in the graph has one node in A and another node in B

        Note:
        There are no self-loops in the graph.

        No multiple edges between two pair of vertices.

        The graph may or may not be connected.

        Nodes are Numbered from 0 to A-1.

        Your solution will run on multiple testcases. If you are using global variables make sure to clear them.

        Input 1:

        A = 2
        B = [ [0, 1] ]
        output : true

       Input 2:

       A = 3
       B = [ [0, 1], [0, 2], [1, 2] ]
       output :  false
        */

public class Main {
    public static void main(String[] args) {
         BipartiteGraph bipartiteGraph = new BipartiteGraph();
         boolean isBipartite =  bipartiteGraph.isBipartiteGraph(new int[][]{{0, 1}}, 2);
         System.out.println(isBipartite);
    }
}