package queue;

public class Queue {
	
private int front, rear, capacity;
private int queue[];

Queue(int capacity)
{
	front=rear=0;
	this.capacity=capacity;
	queue=new int[this.capacity];
}
	
	void queueEnqueue(int data)
	{
		if(capacity==rear) {
			System.out.println("\nQueue is full\n");
		return;
	  }
	else {
		queue[rear]=data;
		rear++;
	     }
	return;
    }

	void queueDequeue() {
		
	}
	
	void queueDisplay() {
		int i=0;
		if(front==rear) {
			System.out.printf("%d <-- ", queue[i]);
		return;	
		}
		
		for (i=front; i<rear; i++) {
			System.out.printf("%d <-- ", queue[i]);
		}
		return;
	}
	
	void queueFront() {
		if(front==rear) {
			System.out.printf("\nqueue is empty\n");
		return;
		}
	System.out.printf("\nfront element is: %d",queue[front]);
	return;
	}
}
