import java.util.*;
public class Main{
    public static void rec(int[][] arr,int[][] res,int n,int r,int c){
        if(r==n-1 && c==n-1){ res[r][c]=1;return;}
        if(arr[r][c]==1) return;
        res[r][c]=1;
        //move right
        if(c<n-1)
            rec(arr,res,n,r,c+1);
        //move down
        if(r<n-1)
            rec(arr,res,n,r+1,c);
        // res[r][c]=0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        if(arr[n-1][n-1]==1){
            System.out.prinlt("No solution exists");
        }
        else{
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(res[i],0);
        rec(arr,res,n,0,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    }
}
