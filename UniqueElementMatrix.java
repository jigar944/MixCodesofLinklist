import java.util.ArrayList;


public class UniqueElementMatrix {


    public static void findElement(int ele[][]){

        int i,j;
        ArrayList<Integer> unique = new ArrayList<>();
        for(i=0;i<ele.length;i++){
            for(j=0;j<ele.length;j++){
                if(checkcount(ele,ele[i][j]))
                {
                    unique.add(ele[i][j]);
                }
                else{
                    continue;
                }
            }
        }

        System.out.println(unique);

    }


    public static boolean checkcount(int ar[][],int a){

        int i,j;
        int count =0;
        for(i=0;i<ar.length;i++){
            for(j=0;j<ar.length;j++){
         
                if(a==ar[i][j]){
                    count++;
                }
            }
        }
        if(count==1){
            return true;
        }else{
            return false;
        }

    }



    public static void main(String[] args) {
        
        int mat[][] = {{1, 2, 3, 20},
                   {5, 6, 20, 25},
                   {1, 55, 5, 6},
                   {6, 7, 8, 15}};

        findElement(mat);
    }
    
}
