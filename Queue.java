public class Queue{
	int size;
	int[] Q;
	int head;
	int tail;
	public static void main(String[] args){
		Queue q = new Queue(4);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		// q.enqueue(4);
		// q.enqueue(5);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());	
		
	}
	public Queue(int n){
		this.size = n;
		this.Q = new int[size];
		this.head = 0;
		this.tail = 0;
	}
	public boolean isEmpty(){
		// Or
		// return this.head == tbig = this.head;
		return this.tail - this.head == 1;
	}
	public boolean isFull(){
		// Or
		// return this.head == this.tail;
		int big = this.head;
		int small = this.tail;
		if (big<small){
            big = this.tail;
            small = this.head;
		}
		return big - small == this.size;
	}
	public void enqueue(int val){
		// this.head++;
		this.tail++;
		if(this.tail >= this.size) this.tail = this.size % this.tail;
		this.Q[tail] = val;
	}
	public int dequeue(){
		// if (this.isEmpty()){
		// 	System.out.println("Queue is empty");
		// 	return -1;
		// }
		int val = Q[this.head];
		this.head++;
		if(this.head >= this.size) this.head = this.size % this.head;
		return val;
	}
    
}
