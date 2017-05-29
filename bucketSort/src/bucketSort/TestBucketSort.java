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
	
	@Test
	public void testBucketSortOtimizado() {
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
		b.bucketSortOtimozado();
		b.showMeArray();
	}
}
