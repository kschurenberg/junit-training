package org.training.junit.jobjar.listing;

public enum Priority {
	HIGH(10),
	MEDIUM(5),
	LOW(0);
	
	private int value;
	
	private Priority(int value){
		this.value = value;
	}
	
	public boolean greaterThan(Priority other){
		return (this.value > other.value);
	}
	
	
	public boolean greaterOrEqual(Priority other){
		return (this.value >= other.value);
	}
	
	
	public boolean lessThan(Priority other){
		int o = other.value;
		int t = this.value;
		boolean r = t < o;
		return (this.value < other.value);
	}
	
	
	public boolean lessOrEqual(Priority other){
		return (this.value <= other.value);
	}
	
	
	public boolean equal(Priority other){
		return (this.value == other.value);
	}
}
