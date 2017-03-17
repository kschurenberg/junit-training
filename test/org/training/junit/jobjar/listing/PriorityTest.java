package org.training.junit.jobjar.listing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PriorityTest {
	Priority target;
	
	@Before
	public void prepare() {
		
	}
	
	@Test
	public void whenOtherIsLowerThenGreaterThanShouldReturnTrue() {
		Priority low = Priority.LOW;
		Priority medium = Priority.MEDIUM;
		
		target = Priority.HIGH;
		assertTrue(target.greaterThan(low));
		assertTrue(target.greaterThan(medium));
	}
	
	@Test
	public void whenOtherIsLowerOrEqualThenGreaterOrEqualShouldReturnTrue() {
		Priority low = Priority.LOW;
		Priority medium = Priority.MEDIUM;
		
		target = Priority.HIGH;
		assertTrue(target.greaterOrEqual(low));
		assertTrue(target.greaterOrEqual(medium));
		assertTrue(target.greaterOrEqual(target));
	}
	
	@Test
	public void whenOtherIsGreaterOrEqualThenGreaterThanShouldReturnFalse() {
		Priority high = Priority.HIGH;
		Priority medium = Priority.MEDIUM;
		target = Priority.LOW;
		
		assertFalse(target.greaterThan(high));
		assertFalse(target.greaterThan(medium));
		assertFalse(target.greaterThan(target));
	}
	
	@Test
	public void whenOtherIsLowerThenLowerThanShouldReturnFalse() {
		Priority low = Priority.LOW;
		Priority medium = Priority.MEDIUM;
		
		target = Priority.HIGH;
		assertFalse(target.lessThan(low));
		assertFalse(target.lessThan(medium));
	}
	
	@Test
	public void whenOtherIsLowerOrEqualThenLessOrEqualShouldReturnFalseOrTrue() {
		Priority low = Priority.LOW;
		Priority medium = Priority.MEDIUM;
		
		target = Priority.HIGH;
		assertFalse(target.lessOrEqual(low));
		assertFalse(target.lessOrEqual(medium));
		assertTrue(target.lessOrEqual(target));
	}
}
