package plow;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph<K,V> {
	public static void main(String[] args) {
		Graph<Integer,String> div = new Graph<Integer,String>();
		
		for (Integer i = 1; i < 31; i++) {
			div.add(i,"");
		}
		for (Integer i = 1; i < 31; i++) {
			for (Integer j = 1; j < 31; j++) {
				if (i % j == 0) {
					div.connect(i,j);
				}
			}
		}
		div.print();
		
		div = div.breadthFirstSearch(1);
		div.print();
		
		
		System.out.println("Finished.");
	}
	
	
	
	private HashSet<K> key;
	private Hashtable<K,GraphElement<K,V>> node;
	
	
	
	public Graph() {
		this.key = new HashSet<K>();
		this.node = new Hashtable<K,GraphElement<K,V>>();
	}
	public boolean add(K k, V v) {
		if (this.key.contains(k)) {
			return false;
		}
		this.key.add(k);
		this.node.put(k,new GraphElement<K,V>(k,v));
		return true;
	}
	public boolean connect(K a, K b) {
		if (!this.key.contains(a) || !this.key.contains(b) || a.equals(b)) {
			return false;
		}
		GraphElement<K,V> nodeA = this.node.get(a);
		GraphElement<K,V> nodeB = this.node.get(b);
		nodeA.connect(b);
		nodeB.connect(a);
		return true;
	}
	public boolean connected(K a, K b) {
		if (!this.key.contains(a) || !this.key.contains(b)) {
			return false;
		}
		return this.node.get(a).connected(b) && this.node.get(b).connected(a);
	}
	public void disconnect(K a, K b) {
		this.node.get(a).disconnect(b);
		this.node.get(b).disconnect(a);
	}
	
	public Iterator<K> adjIterator(K a) {
		return this.node.get(a).getAdj().iterator();
	}
	public Iterator<K> iterator() {
		return this.key.iterator();
	}
	
	public Graph<K,V> breadthFirstSearch(K initial) {
		Graph<K,V> output = new Graph<K,V>();
		HashSet<K> visited = new HashSet<K>();
		LinkedList<K> toVisit = new LinkedList<K>();
		toVisit.add(initial);
		output.add(initial, this.node.get(initial).get());
		visited.add(initial);
		while (! toVisit.isEmpty()) {
			K k = toVisit.pop();
			Iterator<K> adj = this.adjIterator(k);
			
			while (adj.hasNext()) {
				K j = adj.next();
				if (! visited.contains(j)) {
					output.add(j, this.node.get(j).get());
					visited.add(j);
					output.connect(k,j);
					toVisit.add(j);
				}				
			}
		}
		return output;
	}
	
	
	public static Graph<Integer,String> kClique(Integer k) {
		if (k <= 0) {
			return null;
		}
		Graph<Integer,String> output = new Graph<Integer,String>();
		for (Integer i = 0; i < k; i++) {
			output.add(i,"");
		}
		for (Integer i = 0; i < k; i++) {
			for (Integer j = 0; j < k; j++) {
				if (i != j) {
					output.connect(i,j);
				}
			}
		}
		return output;
	}
	public void print() {
		Iterator<K> iter = this.iterator();
		
		while(iter.hasNext()) {
			K k = iter.next();
			System.out.print(k.toString() + ". Adjacent: ");
			Iterator<K> reti = this.adjIterator(k);
			while (reti.hasNext()) {
				K r = reti.next();
				System.out.print(r.toString() + " ");
			}
			System.out.println("");
		}
	}
}
class GraphElement<K,V> {
	private K key;
	private V v;
	private HashSet<K> adj;
	
	
	
	public GraphElement(K k, V s) {
		this.key = k;
		this.v = s;
		this.adj = new HashSet<K>();
	}
	public boolean equals(GraphElement<K,V> other) {
		return other.key == this.key;
	}
	public void connect(K k) {
		adj.add(k);
	}
	public boolean connected(K k) {
		return adj.contains(k);
	}
	public void disconnect(K k) {
		adj.remove(k);
	}
	public void set(V v) {
		this.v = v;
	}
	public V get() {
		return this.v;
	}
	HashSet<K> getAdj() {
		return adj;
	}
}