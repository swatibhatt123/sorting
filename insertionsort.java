public class insertionsort
 {
    public static void main(String[] args) {
        int[] a={4,1,6,8,3,10,4};
        int temp;
        for(int i=0;i<a.length; i++)
        {
            temp=a[i];
            int j=i;
            while(j>0 && a[j-1] >temp)
            {
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for (int i=0; i<a.length ;i++)   
        {
            System.out.print(a[i] + " ");
    }
    
}
 }
