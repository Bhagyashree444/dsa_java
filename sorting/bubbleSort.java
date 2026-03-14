// Bubble Sort TC = O(n^2)

//homework - 1 -> done
// using swap==0 check whether atleast one swap happened
// in first turn, if no swap i.e swap==0 then the array is 
// already sorted and gives TC O(n) in best case scenario
// (array is already sorted)




public class bubbleSort{
    public static void bubblesort(int a[])
    {
       int n = a.length;
       for(int turn=0;turn<=n-2;turn++)
       {
          int swap = 0;
          for(int j=0;j<=n-2-turn;j++)
          {
              if(a[j] > a[j+1])
              {
                 int temp = a[j];
                 a[j] = a[j+1];
                 a[j+1] = temp;
                 swap++;
              }
              
          }
          if(swap == 0)
              {
                  break;
              }
       }

    }

    
    public static void main(String args[])
    {
       int a[] = {5,3,2,1,4};
       //int a[] = {1,2,3,4,5};
       bubblesort(a);
       
       for(int i=0;i<a.length;i++)
       {
          System.out.println(a[i]+" ");
       }
    }

     

}