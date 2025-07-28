public class arraysTravarsal {
    public static void main(String[] args) {
         int []arr={1,2,1,3,1,4,5,2,1,8};
         int count=0;
         for ( int i =0;i<arr.length;i++){
           if(arr[i]==1){
            count ++;
           }     
    }
    System.out.println("Occurance of 1 in array is "+count +" times");
     int max=arr[0];
     for ( int i =0;i<arr.length;i++){
           if(arr[i]>max){
            max=arr[i];
           }     
    }
    System.out.println("Maximum "+ max);
    int min=arr[0];
     for ( int i =0;i<arr.length;i++){
           if(arr[i]<max){
            min=arr[i];
           }     
    }
    System.out.println("Minimum " +min);
    //ARRAY REVERSAL 2 POINTER
    int []arr1={1,2,3,4,5};

    System.out.println("Original");
    print(arr1);
    reverseArr(arr1);
    System.out.println("Reverse");
    print(arr1);
    System.out.println("Even odd separate");
    EvenOddSeparate(arr);
    print(arr);
    }

public static void reverseArr(int []arr1) {
     int i =0, j=arr1.length-1, temp;
    while(i<j){
             temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp ;
            i++; 
            j--;
    }
}
// ODD AND EVEN SEPARATE
public static void EvenOddSeparate(int []arr){
    if(arr.length<=1){
        return;
    }
    int left =0 , right=arr.length-1;
    while(left<right){
        while(arr[left]%2==0 && left<right){
            left++;
        }
       while(arr[right]%2!=0 && left<right){
            right--;
        }
    
    if(left<right){
        int temp =arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

       }
    }

}
public static void print(int []arr){
       for( int i =0;i<arr.length;i++)  {
            System.out.print(arr[i]+" ");
          } 
          System.out.println();
    }


}
 