package class2problems;

import java.util.*;

public class KWArrayList<E> implements KWList<E>{
	// data fields
	/** The default initial capacity */
    private static final int INITIAL_CAPACITY = 10;
    /** The underlying data array */
    private E[] theData;
    /** The current size */
    private int size = 0;
    /** The current capacity */
    private int capacity = 0;
    
    @SuppressWarnings({"unchecked"})
    public KWArrayList() {
        capacity = INITIAL_CAPACITY;
        theData = (E[]) new Object[capacity];
    }

    @SuppressWarnings("unchecked")
    public KWArrayList(int capacity) {
        this.capacity = capacity;
        theData = (E[]) new Object[capacity];
    }
    
	/* add an Element at the end */
	public void add(E value) {
		return;
	}
	
	/* add an element at a specific index*/
	// need to first shift all the elements
	// from index (index) till the end(size-1) to its own right.
	public void add(int index, E value) {
		return;
	}
	
	/* retrieve the element at a specific index */
	public E get(int index) {
		return null;
	}
	
	/* update the value at a specific index 
	 * return the oldValue*/
	public E set(int inde, E value) {
		return null;
	}
	
	/* remove the element at a specific index
	 * and return the value removed*/
	public E remove(int index) {
		return null;
	}
	
	/* the current number of elements on the list */
	public int size() {
		return 0;
	}
	
	/*return the index of the first occurrence of a specific element */
	public int indexOf(E value) {
		return 0;
	}
	
	/* whether is the list full */
	public boolean isFull() {
		return false;
	}
	
	/* whether the list is empty */
	public boolean isEmpty() {
		return false;
	}
}
