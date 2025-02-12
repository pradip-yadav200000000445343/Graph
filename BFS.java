import java.util.*;

public class BFS {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s , int d , int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }

    }

    public static void createGraph(ArrayList<Edge>graph[]){
                // shuru me array me null hoga , har index par , so hume har index par arrayList dalna hoga

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

    public static void bfs(ArrayList<Edge>graph[]){
        Queue<Integer>q=new LinkedList<>();

        boolean vis[]=new boolean[graph.length];

        q.add(0);  // Humene source 0 liya hai , hum source kuch bhee le sakthe hai , hum 2 , 4, 3, 5 ,6,0 , 1 bhee le sakthe hai

        while(!q.isEmpty()){
            int curr=q.remove();

            if(!vis[curr]){
                System.out.print(curr + " ");          // print
                vis[curr]=true;                   //  vistit

                for(int i=0 ; i<graph[curr].size() ; i++){   // add neighbour 
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }


    }

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

        createGraph(graph);
        bfs(graph);







    }
    
}
