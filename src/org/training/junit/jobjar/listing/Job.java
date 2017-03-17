package org.training.junit.jobjar.listing;

/** 
 * Class describing a single job for the job jar.
 * 
 * @author Kurt Schurenberg
 *
 */
public class Job {
	private String name;
	private String size;
	private Priority priority;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
}
