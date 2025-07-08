package graph.Representation;

//1.)How to represent below graph;

// 1 --- 2
// |     |
// 3 --- 4 --- 5 --- 6

//   u--v
//   adj[u].add(u);
//   adj[v].add(v);

//
//  0 {}
//  1 {2,3}
//  2 {1,4}
//  3 {1,4}
//  4 {2,3,5}
//  5 {4,6}
//  6 {5}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AdjencyList {
    public static void main(String[] args) {
        int[][] edges={{1,2},{2,4},{1,3},{3,4},{4,5},{5,6}};
        int vertex=6;

        //Graph representation in AdjencyList
        List<List<Integer>> graph=adjencenyList(edges,vertex);
        System.out.println(graph);

        //Adjecnylist to matrix
        int[][] matrix=adjencyListToMatrix(graph);
        System.out.println(Arrays.deepToString(matrix));

    }

    private static int[][] adjencyListToMatrix(List<List<Integer>> adjList) {
        int[][] graph=new int[adjList.size()][adjList.size()];
        //adj(u)={v,v,v};
        //mat[u][adj.get(u).get(v)]=1;

       for(int u=0; u<graph.length; u++){
           for(int v=0; v<adjList.get(u).size(); v++){
               graph[u][adjList.get(u).get(v)]=1;
           }
       }

       return graph;
    }

    private static List<List<Integer>> adjencenyList(int[][] edges, int vertex) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0; i<=vertex; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] arr:edges){
            graph.get(arr[0]).add(arr[1]);
            graph.get(arr[1]).add(arr[0]);
        }

        return graph;
    }

}
