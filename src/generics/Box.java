package generics;

public class Box<T> {

private T data;
private static int boxCount;


public Box(T data) {
	this.data = data;
	boxCount++;
}

public T getData() {
	return data;	
}

public void setData(T newData) {
	data = newData;
}

public String display() {
	return "Box";
}

	
	
	
	
	
	
	
	
}
