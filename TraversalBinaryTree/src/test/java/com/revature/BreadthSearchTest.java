package com.revature;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class BreadthSearchTest {
	
	BreadthSearch traverse;
	
	Node n1;
	
	Node n2;
	
	Node n3;
	
	Node n4;
	
	Node n5;
	
	Node n6;
	
	Node n7;
	
	@Before
	public void setup() {
		this.traverse = new BreadthSearch();
		this.n4 = new Node(4, null, false);
		this.n5 = new Node(5, null, false);
		this.n6 = new Node(6, null, false);
		this.n7 = new Node(7, null, false);
		this.n3 = new Node(3, Arrays.asList(n6, n7), false);
		this.n2 = new Node(2, Arrays.asList(n4, n5), false);
		this.n1 = new Node(1, Arrays.asList(n2,n3), false);
	}
	
	@Test
	public void testBfsReturnsTheWriteElements() {
		String expectedResult = " 1, 2, 3, 4, 5, 6, 7,";
		assertEquals(traverse.bfs(n1), expectedResult);
	}
	
}
