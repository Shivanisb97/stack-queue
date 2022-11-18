package queue;

public class Mainqueue {

	public static void main(String[] args) {
		Queue q= new Queue(6);
		
		q.queueEnqueue(30);
		q.queueDequeue();
		q.queueEnqueue(70);
		q.queueEnqueue(40);
		q.queueEnqueue(50);
		q.queueEnqueue(60);
		q.queueEnqueue(20);
		
		q.queueDisplay();
		
		q.queueDequeue();
		q.queueDequeue();
		System.out.printf("\n\nafter two node\n\n");
		q.queueDisplay();

	}

}
