package algos;
import utils.Problem;
import java.util.*;
import java.lang.*;
public class LinearSearchAlgo 
{

    int[] data;
    public void setData(int[] data) throws Problem{
        if(data[data.length-1] != 0){
            throw new Problem("array should have empty space at last index");

        }
        else{
            this.data=data;
            
        }
    } 

    public void search(int key){
        this.data[this.data.length-1]=key;
        String success_message="item found at ";
        String error_message="sorry item could not be found";
        int ptr=0;
        while(ptr<this.data.length){
            if(this.data[ptr]==key){
                System.out.println(success_message+ptr+" position");
                break;
            }
            ptr++;
        }
        if(ptr==this.data.length){
            System.out.println(error_message);
        }


    }

}