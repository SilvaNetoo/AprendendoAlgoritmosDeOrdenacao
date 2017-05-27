package bucketSort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestBucketSort {

	BucketSort b;

	@Before
	public void BucketSort() {
		b = new BucketSort(12);
	}

	@Test
	public void testBucketSort() {
		b.add(10);
		b.add(8);
		b.add(6);
		b.add(7);
		b.add(9);
		b.add(6);
		b.add(10);
		b.add(7);
		b.add(8);
		b.add(9);
		b.add(5);
		b.add(3);
		b.add(0);
		b.add(2);
		b.add(4);
		b.add(1);
		b.add(0);
		b.add(5);
		b.add(2);
		b.add(3);
		b.add(1);
		b.add(4);
		b.showMeArray();
		b.bucketSort();
		b.showMeArray();
	}

	/*
	 * @Test public void testBucketSort() { int maxVal=13; int [] data=
	 * {5,3,0,2,4,1,0,5,2,3,1,4};
	 * 
	 * System.out.println("Before: " + Arrays.toString(data));
	 * b.bucketSort(data,maxVal); System.out.println("After:  " +
	 * Arrays.toString(data)); }
	 */

}
