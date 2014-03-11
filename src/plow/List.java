package plow;
import Exceptions.*;

public class List {
	private Element first;
	private Element last;
	private int length;
	
	public List() {
		this.first = null;
		this.last = null;
		this.length = 0;
	}
	
	public void push(int k) {
		Element add = new Element(k);
		add.next = this.first;
		if (add.next != null) {
			add.next.prev = add;
		}
		this.first = add;
		if (this.last == null) {
			this.last = add;
		}
		this.length++;
	}
	public void slip (int k) {
		Element add = new Element(k);
		add.prev = this.last;
			if (add.prev != null) {
				add.prev.next = add;
			}
		this.last = add;
		if (this.first == null) {
			this.first = add;
		}
		this.length++;
	}
	public int pop() throws EmptyStackException {
		if (this.length == 0) {
			throw new EmptyStackException();
		}
		int n = this.first.number;
		if (this.length == 1) {
			this.first = null;
			this.last = null;
		}
		else {
			this.first = first.next;
			this.first.prev = null;
		}
		this.length--;
		return n;
	}
	public int popPeek() throws EmptyStackException {
		if (this.length == 0) {
			throw new EmptyStackException();
		}
		return this.first.number;
	}
	public int snagPeek() throws EmptyStackException {
		if (this.length == 0) {
			throw new EmptyStackException();
		}
		return this.first.number;
	}
	public int snag() throws EmptyStackException {
		if (this.length == 0) {
			throw new EmptyStackException();
		}
		int n = this.last.number;
		if (this.length == 1) {
			this.first = null;
			this.last = null;
		}
		else {
			this.last = last.prev;
			this.last.next = null;
		}
		this.length--;
		return n;
	}
	public boolean contains(int k) {
		if (this.first == null) {
			return false;
		}
		for (Element iterate = this.first; iterate != null; iterate = iterate.next) {
			if (iterate.number == k) {
				return true;
			}
		}
		return false;
	}
	
	public int length() {
		return this.length;
	}
	public Element first() {
		return this.first;
	}
	public Element last() {
		return this.last;
	}
}
class Element {
	int number;
	Element next;
	Element prev;
	
	Element(int k) {
		this.number = k;
		this.next = null;
		this.prev = null;
	}
	
}