package com.te.javabasics.collections;

public class ArrayListDemo1 {
	
private Object[]array ;
private int position;

public void add(Object element) {
	if(this.position>=this.array.length) {
		growArray();
	}
	this.array[position++]=element;
}
public ArrayListDemo1(int arraySize) {
	this.array=new Object[arraySize];
}
public Object get(int index) {
	return this.array[index];
}
public int size() {
	return this.position;
	
}
private void growArray() {
	Object[] temp=new Object[this.array.length+5];
	System.arraycopy(this.array,0,temp,0,this.array.length);
	array=temp;
}
}
