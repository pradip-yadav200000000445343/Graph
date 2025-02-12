

import java.util.ArrayList;

public class DFS {
    static class Edge{
        int src;
        int dst;
        int wt;

        Edge(int s , int d , int w){
            this.src=s;
            this.dst=d;
            this.wt=w;
        }

    }


    public static void constructGraph(ArrayList<Edge>graph[]){

        // make arraylist at every index of graph array
        for(int i=0 ; i<graph.length ; i++){
            graph[i]=new ArrayList<>();
        }

         // Vertex 0
       graph[0].add(new Edge(0,1,1));
       graph[0].add(new Edge(0, 2, 1));

       // Vertex 1
       graph[1].add(new Edge(1,0,1));
       graph[1].add(new Edge(1,3,1));
       
       //Vertex 2
       graph[2].add(new Edge(2, 0, 1));
       graph[2].add(new Edge(2, 4, 1));

       // Vertex 3
       graph[3].add(new Edge(3, 1, 1));
       graph[3].add(new Edge(3, 4, 1));
       graph[3].add(new Edge(3, 5, 1));

       // Vertex 4
       graph[4].add(new Edge(4, 2, 1));
       graph[4].add(new Edge(4, 3, 1));
       graph[4].add(new Edge(4, 5, 1));

       // Vertex 5
       graph[5].add(new Edge(5, 3, 1));
       graph[5].add(new Edge(5, 4, 1));
       graph[5].add(new Edge(5, 6, 1));

       // Vertex 6
       graph[6].add(new Edge(6, 5, 1));


       // By default humne weight ko 1 diya hai , kyu ke ye directed graph hai yaha graph diya nhi hai so humne  ache practice ke liya weight ko 1 le liya hai 



    }

    public static void dfs(ArrayList<Edge>graph[] , int curr , boolean vis[]){  // O(V+E)
        // step 1 , print and Visit our curr
        System.out.print(curr + " ");
        vis[curr]=true;

        // step 2 : check for neighbour , if not visited then call dfs
        for(int i=0 ; i<graph[curr].size() ; i++){ 
         Edge e=graph[curr].get(i);            // mujhe uss particular index par bhoyot sare edge mil raha hoga arraylist ke form me 
         
         if(!vis[e.dst]){
            dfs(graph, e.dst, vis);
         }

        }

    }



    // upper wale function ko hum aasa bhee likh sakthe hai 

    // public static void dfs(ArrayList<Edge>graph[] , int curr , boolean vis[]){
    //     // step 1 , print and Visit our curr
    //     System.out.println(curr + " ");
    //     vis[curr]=true;

    //     // step 2 : check for neighbour , if not visited then call dfs
    //     for(int i=0 ; i<graph[curr].size() ; i++){ 
    //      Edge e=graph[curr].get(i);            // mujhe uss particular index par bhoyot sare edge mil raha hoga arraylist ke form me 
    //      int neighbour=e.dst;

    //      if(!vis[neighbour]){
    //         dfs(graph, neighbour, vis);
    //      }
    //     }

    // }
    public static void main(String args[]){

        /*
                 1---------------- 3
                /                 |  \
               /                  |   \
              /                   |    \
             0                    |     5---------6
             \                    |     /
              \                   |    /
               \                  |   /
                2----------------- 4




        
         */







        int V=7 ;

        // craeting one list of list
        ArrayList<Edge>graph[]=new ArrayList[V]; 

        // shuru me array me null hoga , har index par , so hume har index par arrayList dalna hoga

        constructGraph(graph);
        int src=0;
        boolean vis[]=new boolean[V];
        dfs(graph , src,vis );







    }
    
}


























// By me 

/* 

import java.util.ArrayList;

 public class DFS {
    static class Edge{
        int src;
        int dst;
        int wt;

        Edge(int s , int d , int w){
            this.src=s;
            this.dst=d;
            this.wt=w;
        }

    }


    public static void constructGraph(ArrayList<Edge>graph[]){

        // make arraylist at every index of graph array
        for(int i=0 ; i<graph.length ; i++){
            graph[i]=new ArrayList<>();
        }

         // Vertex 0
       graph[0].add(new Edge(0,1,1));
       graph[0].add(new Edge(0, 2, 1));

       // Vertex 1
       graph[1].add(new Edge(1,0,1));
       graph[1].add(new Edge(1,3,1));
       
       //Vertex 2
       graph[2].add(new Edge(2, 0, 1));
       graph[2].add(new Edge(2, 4, 1));

       // Vertex 3
       graph[3].add(new Edge(3, 1, 1));
       graph[3].add(new Edge(3, 4, 1));
       graph[3].add(new Edge(3, 5, 1));

       // Vertex 4
       graph[4].add(new Edge(4, 2, 1));
       graph[4].add(new Edge(4, 3, 1));
       graph[4].add(new Edge(4, 5, 1));

       // Vertex 5
       graph[5].add(new Edge(5, 3, 1));
       graph[5].add(new Edge(5, 4, 1));
       graph[5].add(new Edge(5, 6, 1));

       // Vertex 6
       graph[6].add(new Edge(6, 5, 1));


       // By default humne weight ko 1 diya hai , kyu ke ye directed graph hai yaha graph diya nhi hai so humne  ache practice ke liya weight ko 1 le liya hai 



    }

    public static void dfs(ArrayList<Edge>graph[] , int curr , boolean vis[]){
        // step 1 , Visit our curr
        System.out.println(curr + " ");
        vis[curr]=true;

        // step 2 : check for neighbour , if not visited then call dfs
        for(int i=0 ; i<graph[curr].size() ; i++){ 
         Edge e=graph[curr].get(i);            // mujhe uss particular index par bhoyot sare edge mil raha hoga arraylist ke form me 
         int neighbour=e.dst;

         if(!vis[neighbour]){
            dfs(graph, neighbour, vis);
         }
        }

    }
    public static void main(String args[]){

        //
        //         1---------------- 3
        //        /                 |  \
        //       /                  |   \
        //      /                   |    \
        //     0                    |     5---------6
        //     \                    |     /
        //      \                   |    /
        //       \                  |   /
        //        2----------------- 4
        //
        //
        //
        //  
        //
         //







        int V=7 ;

        // craeting one list of list
        ArrayList<Edge>graph[]=new ArrayList[V]; 

        // shuru me array me null hoga , har index par , so hume har index par arrayList dalna hoga

        constructGraph(graph);
        int src=0;
        boolean vis[]=new boolean[V];
        dfs(graph , src,vis );







     }
    
 }

*/