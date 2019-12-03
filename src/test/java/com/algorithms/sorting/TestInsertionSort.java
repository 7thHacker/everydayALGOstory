package com.algorithms.sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * UNit Test for Insertion Sort of Int Array
 * 
 * @author shreyanshp
 */
public class TestInsertionSort {

	@Test
	public void testInsertionSort() {
		int[] A = { 5, 2, 4, 6, 1, 3 };
		InsertionSort sort = new InsertionSort();
		A = sort.sortIntArray(A);
		for(int i = 0; i < A.length; i++) {
			if(A[i] != (i+1))
				Assert.fail("Array is not Sorted Yet !");
		}
	}
}
