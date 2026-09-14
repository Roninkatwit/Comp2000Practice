package class2problems;

public interface KWList<E> {
	/* add an Element at the end */
	public void add(E value);
	
	/* add an element at a specific index*/
	public void add(int index, E value);
	
	/* retrieve the element at a specific index */
	public E get(int index);
	
	/* update the value at a specific index 
	 * return the oldValue*/
	public E set(int inde, E value);
	
	/* remove the element at a specific index
	 * and return the value removed*/
	public E remove(int index);
	
	/* the current number of elements on the list */
	public int size();
	
	/*return the index of the first occurrence of a specific element */
	public int indexOf(E value);
	
	/* whether is the list full */
	public boolean isFull();
	
	/* whether the list is empty */
	public boolean isEmpty();
}
