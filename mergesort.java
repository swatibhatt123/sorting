public class mergesort {
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args) {
        int[] inputArr={48,36,13,52,19,94,21};
        mergesort ms = new mergesort();
        ms.sort(inputArr);

        for(int i : inputArr){
            System.out.println(i + " ");
        }
    }

    public void sort(int inputArr[])
    {
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergeArr=new int[length];
        divideArray(0,length-1);
    }

    public void divideArray(int lowerindex ,int higherindex){
        if(lowerindex < higherindex){
            int middle=lowerindex+(higherindex -lowerindex)/2;
            divideArray(lowerindex, middle); //sort left side
            divideArray(middle + 1, higherindex); //sort right side
        

        }
    }
    
}
