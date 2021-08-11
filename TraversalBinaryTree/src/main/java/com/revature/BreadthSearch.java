package com.revature;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthSearch {

	public String bfs(Node start) {
		String result = "";
		
		Queue<Node> queue = new LinkedList<Node>(); 
		queue.add(start);
		
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			result+=" "+node.getCurrent()+",";
			
			List<Node> neighbors = node.getNeighbors();
			if(neighbors != null) {
			for(Node n: neighbors) {
				if(!n.isVisited()) {
					queue.add(n);
				}
			}
			}
		}
		
		return result;
	}
	
}
