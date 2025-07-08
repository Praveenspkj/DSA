package graph.Representation;

//1.)How to represent below graph;

// 1 --- 2
// |     |
// 3 --- 4 --- 5 --- 6

//   u--v
//   mat[u]=1;
//   mat[v]=1;

//     0 1 2 3 4 5 6
//  0 [0,0,0,0,0,0,0]
//  1 [0,0,1,1,0,0,0]
//  2 [0,1,0,0,1,0,0]
//  3 [0,1,0,0,1,0,0]
//  4 [0,0,1,1,0,1,0]
//  5 [0,0,0,0,1,0,1]
//  6 [0,0,0,0,0,1,0]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix {

    public static void main(String[] args) {
       int[][] edges={{1,2},{2,4},{1,3},{3,4},{4,5},{5,6}};
       int vertex=6;

       int[][] graph=matrixRepresentation(edges,vertex);
        System.out.println(Arrays.deepToString(graph));

        //matrix to adjencyList
        List<List<Integer>> adjencyList=matrixToAdjencyList(graph);
        System.out.println(adjencyList);
    }

    private static List<List<Integer>> matrixToAdjencyList(int[][] graph) {
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0; i<graph.length; i++){
            adjList.add(new ArrayList<>());
        }

        for(int u=0; u<graph.length; u++){
            for(int v=0; v<graph[0].length; v++){
                if(graph[u][v]==1){
                    adjList.get(u).add(v);
                }
            }
        }

        return  adjList;
    }

    private static int[][] matrixRepresentation(int[][] edges, int vertex) {
        int[][] graph=new int[vertex+1][vertex+1];

        for(int[] arr:edges){
            graph[arr[0]][arr[1]]=1;
            graph[arr[1]][arr[0]]=1;
        }

        return  graph;
    }
}
