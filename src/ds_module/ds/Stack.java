package ds;
import utils.Problem;
public class Stack {
    int top;
    int capacity;
    int[] data;
    
    public Stack(int capacity){
        this.capacity =capacity;
        this.top=-1;
        data=new int[this.capacity];
    }
    public void push(int item) throws Exception {
        if(this.top==data.length-1)
        {
            throw new Problem(" OVERFLOW EXCEPTION: stack is already full!!");
        }else{
            top=top+1;
            this.data[top]=item;
        }
    }
    public int pop() throws Exception{
        if(this.top == -1){
            throw new Problem(" UNDERFLOW EXCEPTION: stack is already empty!!");

        }else{
            int item=this.data[this.top];
            this.top=this.top-1;
            return item;
        }
    }
    
}
