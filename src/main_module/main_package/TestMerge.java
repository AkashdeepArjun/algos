package main_package;
import algos.MergeSortAlgo;
public class TestMerge {
    
    public static void main(String[] args){
        int[] test_data={4,-3,9,-2};
        MergeSortAlgo.sort(test_data, 0,2);
        System.out.println("modified data s");
        testSortedItems(test_data, 0,2);   
    }

    public static void testSortedItems(int[] source,int from,int to){
        for(int k=from;k<=to;k++){
            System.out.println(source[k]);
        }
    }

    public static void printAllItems(int[] source){
        for(int i=0;i<source.length;i++){
            System.out.println(source[i]);
        }
    }
        
}
