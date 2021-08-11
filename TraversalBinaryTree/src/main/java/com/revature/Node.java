package com.revature;

import java.util.List;

public class Node {
	
	private int current;
	
	private List<Node> neighbors;
	
	private boolean visited;

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public List<Node> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(List<Node> neighbors) {
		this.neighbors = neighbors;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Node(int current, List<Node> neighbors, boolean visited) {
		super();
		this.current = current;
		this.neighbors = neighbors;
		this.visited = visited;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + current;
		result = prime * result + ((neighbors == null) ? 0 : neighbors.hashCode());
		result = prime * result + (visited ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (current != other.current)
			return false;
		if (neighbors == null) {
			if (other.neighbors != null)
				return false;
		} else if (!neighbors.equals(other.neighbors))
			return false;
		if (visited != other.visited)
			return false;
		return true;
	}	
	

}
