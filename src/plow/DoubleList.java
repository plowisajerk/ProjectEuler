package plow;

public class DoubleList {
	
}
class DoubleElement<T> {
	private T t;
	DoubleElement<T> next;
	DoubleElement<T> prev;
	
	public DoubleElement(T s) {
		this.t = s;
		this.next = null;
		this.prev = null;
	}
	
	T get() {
		return this.t;
	}
	void set(T s) {
		this.t = s;
	}
}