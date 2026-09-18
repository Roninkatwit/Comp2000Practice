package class3problems;

/**
 * KWSLinkedList implements the List ADT (the KWList interface) based upon
 * Single LinkedList Discuss in class: addFirst, addAfter, removeFirst,
 * removeAfter, getNode; get(), add(int, E) and toString()
 */

public class KWSLinkedList<E> implements KWList<E> {
	// Nested Class
	/*
	 * A Node is the building block for the SingleLinkedList
	 */
	private static class Node<E> {
		// Data Fields
		// The reference to the data.
		private E data;
		// The reference to the next node.
		private Node<E> next = null;

		// Constructors
		// Creates a new node with a null next field
		public Node(E dataItem) {
			data = dataItem;
			next = null;
		}

		// Construct a node with the given data value and link
		public Node(E dataItem, Node<E> nodeRef) {
			data = dataItem;
			next = nodeRef;
		}
	}

	// Data fields
	/**
	 * A reference to the head of the list
	 */
	private Node<E> head = null;
	/**
	 * The size of the list
	 */
	private int size = 0;

	// Helper Methods working on the single linked list
	/**
	 * Insert an item as the first item of the list.
	 * 
	 * @param item The item to be inserted
	 */
	private void addFirst(E item) {
		// create node
		Node<E> newNode = new Node<>(item);
		// make it link to current first node
		newNode.next = head;
		// update head
		head = newNode;
		// increment size as new node was created
		size++;
	}

	/**
	 * Add a node after a given node
	 * 
	 * @param node The node which the new item is inserted after
	 * @param item The item to insert
	 */
	private void addAfter(Node<E> node, E item) {
		// Create new node
		Node<E> newNode = new Node<>(item);
		Node<E> temp = node.next;
		// set the previous next to the current node data
		node.next = temp;
		node.next = newNode;
		size++;
	}

	/**
	 * Remove the first node from the list
	 *
	 * @returns The removed node's data or null if the list is empty
	 */
	private E removeFirst() {
		if (head != null) {
			return null;
		} else {
			E temp = head.data;
			head = head.next;
			size--;
			return temp;
		}
	}

	/**
	 * Remove the node after a given node
	 *
	 * @param node The node before the one to be removed
	 * @returns The data from the removed node, or null if there is no node to
	 *          remove
	 */
	private E removeAfter(Node<E> node) {
		Node<E> temp = node.next;
		if (temp != null) {
			node.next = temp.next;
			size--;
			return temp.data;
		} else {
			return null;
		}

	}

	/**
	 * Find the node at a specified index
	 *
	 * @param index The index of the node sought
	 * @returns The node at index or null if it does not exist
	 */
	private Node<E> getNode(int index) {
		Node<E> node= head;
		for (int i = 0; i < index && node != null; i++) {
			// to traverse, every node point to the next
			node = node.next;
		}
		return node;
	}

	////////////////////////////////////////////////////////////////////////////////////////
	// Public Methods
	/**
	 * Get the data value at index
	 *
	 * @param index The index of the element to return
	 * @return The data at index
	 * @throws IndexOutOfBoundsException if the index is out of range
	 */
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		Node<E> node = getNode(index);
		return node.data;
	}

	/**
	 * Set the data value at index
	 *
	 * @param index    The index of the item to change
	 * @param newValue The new value
	 * @return The data value previously at index
	 * @throws IndexOutOfBoundsException if the index is out of range
	 */
	public E set(int index, E newValue) {
		return null;
	}

	/**
	 * Insert a new item before the one at position index, starting at 0 for the
	 * list head. The new item is inserted between the one at position index-1 and
	 * the one formerly at position index.
	 *
	 * @param index The index where the new item is to be inserted
	 * @param item  The item to be inserted
	 * @throws IndexOutOfBoundsException if the index is out of range
	 */
	public void add(int index, E item) {
//		Node<E> node = head;
//		int i = 0;
//		while (i < index - 1 && node != null)
		
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		if (index == 0) {
			addFirst(item);
		} else {
			Node<E> node = getNode(index - 1);
			addAfter(node, item);
		}
		return;
	}

	/**
	 * Append the specified item to the end of the list
	 *
	 * @param item The item to be appended
	 * @return true (as specified by the Collection interface)
	 */
	public void add(E item) {
		return;
	}

	/**
	 * Remove the item at the specified position in the list. Shifts any subsequent
	 * items to the left (subtracts one from their indices). Returns the item that
	 * was removed.
	 *
	 * @param index The index of the item to be removed
	 * @return The item that was at the specified position
	 * @throws IndexOutOfBoundsException if the index is out of range
	 */
	public E remove(int index) {
		return null;
	}

	/**
	 * Remove the first occurrence of element item.
	 * 
	 * @param item The item to be removed
	 * @return true if item is found and removed; otherwise, return false.
	 */
	public boolean remove(E item) {
		return false;
	}

	/**
	 * Query the size of the list
	 *
	 * @return The number of objects in the list
	 */
	public int size() {
		return size;
	}

	/**
	 * Returns the first occurrence of the specified element in this list, or -1 if
	 * this list does not contain the element.
	 * 
	 * @param o element to search for
	 * @return the index of the first occurrence of the specified element
	 */
	public int indexOf(Object o) {
		return -1;
	}

	/**
	 * Obtain a string representation of the list
	 *
	 * @return A String representation of the list
	 */
	@Override
	public String toString() {
		return null;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Insert a new item before the one at position index, starting at 0 for the
	 * list head. The new item is inserted between the one at position index-1 and
	 * the one formally at position index. The exercise requirements are to not use
	 * any helper methods. Since there already is an add method that uses helper
	 * methods, this one is named add2.
	 *
	 * @param index The index where the new item is to be inserted
	 * @param item  The item to be inserted
	 * @throws IndexOutOfBoundsException if the indes is out of range
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void add2(int index, E item) {
		return;
	}

	public static void exercise_2_5_1() {
		// Create the list of figure 2.16
		Node tom = new Node<String>("Tom", null);
		Node dick = new Node<>("Dick", null);
		Node harry = new Node<String>("Harry", null);
		Node sam = new Node<String>("Sam", null);
		Node head = tom;

		tom.next = dick;
		dick.next = harry;
		harry.next = sam;

		// Insert "Bill" before "Tom"
		Node<String> bill = new Node<>("Bill", tom);
		head = bill;
		// Insert Sue before Sam
		Node<String> sue = new Node<>("Sue", sam);
		harry.next = sue;
		// Remove "Bill"
		head = head.next;
		// Remove "Sam"
		sue.next = sue.next.next;
	}
}
