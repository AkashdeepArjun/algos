package utils;
public class Utils {
    

    public static void swap(int[] data,int pos1,int pos2){
        int temp;
        temp=data[pos1];
        data[pos1]=data[pos2];
        data[pos2]=temp;
    }

}
