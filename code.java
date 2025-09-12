package rotatedarrays;

public class code {
    public static void main(String[] args) {
        //unique values
        int[] num={3,4,5,6,7,0,1,2};
        int[] num1={8,9,10,1,2,3,4,5,6,7};
        //dublicate values
        int[] num2={7,8,1,2,3,3,3,4,5,6};
        int[] num3={4,5,6,6,7,1,2,2,3,3};
        //dublicate values
        System.out.println(findpivotdublicate(num3));
        System.out.println(findpivotdublicate(num2));
        System.out.println(searchrotateddublicate(num2,3));
        System.out.println(searchrotateddublicate(num3,2));
        //unique values
        System.out.println(findpivot(num));
        System.out.println(findpivot(num1));
        System.out.println(searchrotated(num,6));
        System.out.println(searchrotated(num,9));
        System.out.println(searchrotated(num1,7));
        System.out.println(searchrotated(num1,0));
    }
    static int findpivot(int[] array){
        int start=0;
        int end=array.length-1;
        int pivot=0;
        int lastmid=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (array[mid]>array[pivot]){
                start=mid+1;
                pivot=mid;
                lastmid=mid;
            }
            else if(array[mid]<array[pivot]){
                end=mid-1;
                lastmid=mid;
            }
            else{
                return lastmid;
            }
        }
        return lastmid;
    }
    static int findpivotdublicate(int[] array){
        int start=0;
        int end=array.length-1;
        int pivot=0;
        int lastmid=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (array[mid]>array[pivot]){
                start=mid+1;
                pivot=mid;
                lastmid=mid;
            }
            else if(array[mid]<array[pivot]){
                end=mid-1;
                lastmid=mid;
            }
            else{
                return lastmid-1;
            }
        }
        return lastmid-1;
    }
    static int searchrotated(int[] array,int target){
        int start1=0;
        int start2=findpivot(array)+1;
        int end1=start2-1;
        int end2=array.length-1;
        while (start1<=end1){
            int mid=start1+(end1-start1)/2;
            if (array[mid]>target){
               end1=mid-1;
            }
            else if(array[mid]<target){
                start1=mid+1;
            }
            else{
                return mid;
            }
        }
        while (start2<=end2){
            int mid=start2+(end2-start2)/2;
            if (array[mid]>target){
                end2=mid-1;
            }
            else if(array[mid]<target){
                start2=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int searchrotateddublicate(int[] array,int target){
        int start1=0;
        int start2=findpivotdublicate(array)+1;
        int end1=start2-1;
        int end2=array.length-1;
        while (start1<=end1){
            int mid=start1+(end1-start1)/2;
            if (array[mid]>target){
                end1=mid-1;
            }
            else if(array[mid]<target){
                start1=mid+1;
            }
            else{
                return mid;
            }
        }
        while (start2<=end2){
            int mid=start2+(end2-start2)/2;
            if (array[mid]>target){
                end2=mid-1;
            }
            else if(array[mid]<target){
                start2=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
