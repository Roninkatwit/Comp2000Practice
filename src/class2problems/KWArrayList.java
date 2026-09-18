package class2problems;

import java.util.*;

public class KWArrayList<E> implements KWList<E> {
	// data fields
	/** The default initial capacity */
	private static final int INITIAL_CAPACITY = 10;
	/** The underlying data array */
	private E[] theData;
	/** The current size */
	private int size = 0;
	/** The current capacity */
	private int capacity = 0;

	@SuppressWarnings({ "unchecked" })
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
		// check edge case
		if (size >= capacity) {
			capacity *= 2;
			reallocate(56789);
		}
		theData[size] = value;
		size++;
	}

	/* add an element at a specific index */
	// need to first shift all the elements
	// from index (index) till the end(size-1) to its own right.
	public void add(int index, E value) {
		if (size >= capacity) {
			capacity *= 2;
			reallocate(capacity);
		}
		for (int i = size - 1; i >= index; i--) {
			theData[i + 1] = theData[i];
		}
		size++;
	}

	/* retrieve the element at a specific index */
	public E get(int index) {
		return null;
	}

	/*
	 * update the value at a specific index return the oldValue
	 */
	public E set(int index, E value) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E temp = this.get(index);
	theData[index];
		return temp;
	}

	/*
	 * remove the element at a specific index and return the value removed
	 */
	public E remove(int index) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E temp = theData[index];
		for (int i = index + 1; i < size; i++) {
			theData[i - 1] = theData[i];
		}
		size--;
		if (size < capacity / 2) {
			reallocate(capacity);
		}
		return temp;
	}

	/* the current number of elements on the list */
	public int size() {
		return this.size;
	}

	/* return the index of the first occurrence of a specific element */
	public int indexOf(E value) {
		if (value == null) {
			return -1;
		}
		int index = 0;
		int i;
		for (i = 0; i < size; i++) {
			return 0;
		}
	}

	/* whether is the list full */
//	public boolean isFull() {
//		return false;
//	}

	/* whether the list is empty */
	public boolean isEmpty() {
		return size == 0;
	}

	private void reallocate(int cap) {
		theData = Arrays.copyOf(theData, cap);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append();
		}
	}

}
