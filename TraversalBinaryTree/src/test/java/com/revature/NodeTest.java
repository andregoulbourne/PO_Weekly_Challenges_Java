package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {
	
	Node node;
	
    @Before
	public void setup() {
    	List<Node> neighbors = Arrays.asList(new Node(2, null, false), new Node(3, null, false));
		 this.node = new Node(1, neighbors, false);
	}
    
    @Test
    public void testSetterAndGetterCurrent() {
    	node.setCurrent(3);
    	assertEquals(node.getCurrent(), 3);
    }
    
    @Test
    public void testSetterAndGetterNeighbors() {
    	List<Node> neighbors = Arrays.asList(new Node(4, null, false), new Node(5, null, false), new Node(6, null, false));
    	node.setNeighbors(neighbors);
    	assertEquals(node.getNeighbors(), Arrays.asList(new Node(4, null, false), new Node(5, null, false), new Node(6, null, false)));
    }
    
    @Test
    public void testSetterAndGetterVisited() {
    	node.setVisited(true);
    	assertTrue(node.isVisited());
    }
    
    @Test
    public void testAllArgsContructor() {
    	assertEquals(node.getCurrent(), 1);
    	assertEquals(node.getNeighbors(), Arrays.asList(new Node(2, null, false), new Node(3, null, false)));
    }
    
}
