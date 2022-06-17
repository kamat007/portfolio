package com.myweb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Topics {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer topicId;
	private String array;
	private String matrix;
	private String string;
	private String searchingAndSorting;
	private String linkedList;
	private String binaryTrees;
	private String binarySearchTrees;
	private String greedy;
	private String backtracking;
	private String stacksAndQueues;
	private String heap;
	private String graph;
	private String trie;
	private String dynamicProgramming;
	private String bitManipulation;
	
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public String getArray() {
		return array;
	}
	public void setArray(String array) {
		this.array = array;
	}
	public String getMatrix() {
		return matrix;
	}
	public void setMatrix(String matrix) {
		this.matrix = matrix;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public String getSearchingAndSorting() {
		return searchingAndSorting;
	}
	public void setSearchingAndSorting(String searchingAndSorting) {
		this.searchingAndSorting = searchingAndSorting;
	}
	public String getLinkedList() {
		return linkedList;
	}
	public void setLinkedList(String linkedList) {
		this.linkedList = linkedList;
	}
	public String getBinaryTrees() {
		return binaryTrees;
	}
	public void setBinaryTrees(String binaryTrees) {
		this.binaryTrees = binaryTrees;
	}
	public String getBinarySearchTrees() {
		return binarySearchTrees;
	}
	public void setBinarySearchTrees(String binarySearchTrees) {
		this.binarySearchTrees = binarySearchTrees;
	}
	public String getGreedy() {
		return greedy;
	}
	public void setGreedy(String greedy) {
		this.greedy = greedy;
	}
	public String getBacktracking() {
		return backtracking;
	}
	public void setBacktracking(String backtracking) {
		this.backtracking = backtracking;
	}
	public String getStacksAndQueues() {
		return stacksAndQueues;
	}
	public void setStacksAndQueues(String stacksAndQueues) {
		this.stacksAndQueues = stacksAndQueues;
	}
	public String getHeap() {
		return heap;
	}
	public void setHeap(String heap) {
		this.heap = heap;
	}
	public String getGraph() {
		return graph;
	}
	public void setGraph(String graph) {
		this.graph = graph;
	}
	public String getTrie() {
		return trie;
	}
	public void setTrie(String trie) {
		this.trie = trie;
	}
	public String getDynamicProgramming() {
		return dynamicProgramming;
	}
	public void setDynamicProgramming(String dynamicProgramming) {
		this.dynamicProgramming = dynamicProgramming;
	}
	public String getBitManipulation() {
		return bitManipulation;
	}
	public void setBitManipulation(String bitManipulation) {
		this.bitManipulation = bitManipulation;
	}
	
	@Override
	public String toString() {
		return "Topics [topicId=" + topicId + ", array=" + array + ", matrix=" + matrix + ", string=" + string
				+ ", searchingAndSorting=" + searchingAndSorting + ", linkedList=" + linkedList + ", binaryTrees="
				+ binaryTrees + ", binarySearchTrees=" + binarySearchTrees + ", greedy=" + greedy + ", backtracking="
				+ backtracking + ", stacksAndQueues=" + stacksAndQueues + ", heap=" + heap + ", graph=" + graph
				+ ", trie=" + trie + ", dynamicProgramming=" + dynamicProgramming + ", bitManipulation="
				+ bitManipulation + "]";
	}
}
