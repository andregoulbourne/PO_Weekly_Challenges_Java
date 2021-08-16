package com.revature;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class WordBucketTest {
	
	WordBucket bucket = new WordBucket();
	
	@Test
	public void testPrimitiveToDeclaritive() {
		List<String> strings = Arrays.asList("she", "sells", "sea", "shells", "by", "the", "sea");
		String[] arrayString = {"she", "sells", "sea", "shells", "by", "the", "sea"};
		assertEquals(bucket.primitiveToDeclaritive(arrayString), strings);
	}
	
	@Test
	public void testSplitString_WordArray() {
		String string = "she sells sea shells by the sea";
		List<String> listString = Arrays.asList("she", "sells", "sea", "shells", "by", "the", "sea");
		assertEquals(bucket.primitiveToDeclaritive(string.split(" ")), listString);
	}

	@Test
	public void testCut_LastCharacter() {
		assertEquals(bucket.cutLastCharacter("me "), "me");
	}

	@Test
	public void test_Bucketize() {
		
		assertEquals(bucket.bucketize("she sells sea shells by the sea", 10),
                Arrays.asList("she sells", "sea shells", "by the sea"));
		assertEquals(bucket.bucketize("the mouse jumped over the cheese", 7),
                Arrays.asList("the", "mouse", "jumped", "over", "the", "cheese"));
		assertEquals(bucket.bucketize("fairy dust coated the air", 20), Arrays.asList("fairy dust coated", "the air"));
		assertEquals(bucket.bucketize("a b c d e", 2), Arrays.asList("a", "b", "c", "d", "e"));
	}

}
