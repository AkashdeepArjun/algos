package algos;
import utils.Utils;
public class QuickSortAlgo {



    public static void sort(int[] data,int beg,int end){

        if(beg<end){
            int pivot_pos=partition(data,beg,end);
            sort(data, beg, pivot_pos-1);
            sort(data, pivot_pos+1, end);


        }


    }

    public static int partition(int[] data,int beg,int end){
        boolean should_exit_main_loop = false;
        int pivot_pos=end;
        int lptr=0;
        int rptr=pivot_pos-1;
        while(lptr<pivot_pos){
            
            if(data[lptr]>data[pivot_pos]){

                while(rptr>=lptr){
                    if(lptr==rptr){

                        Utils.swap(data,lptr,pivot_pos);
                        should_exit_main_loop=true;
                        pivot_pos=lptr;
                        break;
                    }
                    else if(data[rptr]<data[pivot_pos]){
                        Utils.swap(data,lptr,rptr);
                        rptr--;  
                    }else{
                        rptr--;
                    }
                    
                }

            }

            if(should_exit_main_loop){
                break;
            }


            lptr++;
        }

        return pivot_pos;

    }
    
}
