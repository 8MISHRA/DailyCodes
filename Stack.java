public class Stack { 
    int top;
    int[] stack;
    int size = 0;
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int value){
        if(top == size -1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            this.stack[top] = value;
        }
    }

    public int peek(){
        if (this.isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }else{
            return this.stack[top];
        }
    }

    public int pop(){
        if (top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int v = this.stack[top];
            top--;
            return v;
        }

    }

    public void printStack(){
        for(int i=0; i<=top; i++){
            System.out.println(this.stack[i]);
        }
    }

}