import java.util.*;

class SearchingAndSorting {

    //linear search is basically the loops,
    //binarySearch
    public static int binarySearch(int[] arr,int x){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int m=l+((r-l)/2);
            if(arr[m]==x){
                return m;
            }
            else if(arr[m]<x){
                l=m+1;
            }
            else{
                r=m-1;
            }

        }

        return -(1);
    }
  
    //binarySearchRecursive
    public static int binarySearchRecursive(int[] arr, int x,int l, int r) {

        if (l <= r) {
            int m=l+(r-l)/2;
            if(arr[m]==x){
                return m;
            }
            else if(arr[m]<x){
                return binarySearchRecursive(arr,x,m+1,r);
            }
            else{
                return binarySearchRecursive(arr, x, l, m-1);
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(binarySearch(arr,556));
        System.out.println(binarySearchRecursive(arr,56,0, arr.length-1));
      // using inbuilt method of Arrays class 
      System.out.println(Arrays.binarySearch(arr,556));

    }

}
