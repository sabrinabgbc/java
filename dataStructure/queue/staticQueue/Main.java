package dataStructure.queue.staticQueue;

import queue.staticQueue.Queue;

class StaticQueueMain {
	public static void main(String[] args) {
		Queue queue = new Queue(6);
		queue.add(20.0); 
		queue.add(20.8);
		queue.add(20.3);
		queue.add(44.5);
		queue.add(33.33);
		queue.add(20.9);
		queue.list();
		queue.remove();
		queue.remove();
		queue.list();
		queue.clear(); 
	}
}
