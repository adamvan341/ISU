/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isu.emergencyroom.queue;

import java.util.ArrayList;

/**
 *
 * @author adam
 */
public class LinkedPriorityQueue implements PriorityQueue {
    
    private ArrayList[] list;// An array of arrayLists
    
    /**
     * Creates an linked priority queue with (size) priority levels
     * 0 will always be the highest priority
     * @param size Size of priority levels
     */
    public LinkedPriorityQueue(int size) {
	
	list = new ArrayList[size];
	for (int x=0; x<list.length; x++) {
	    list[x] = new ArrayList();
	}
	
    }
    
    @Override
    public void enqueue(Object obj, int priority) {
	list[priority].add(obj);
    }

    @Override
    public Object peekFront() {
	for (int x=0; x<list.length; x++) {
	    if (!list[x].isEmpty()) {
		return list[x].get(0);
	    }
	}
	return null;
    }

    @Override
    public Object dequeue() {
	for (int x=0; x<list.length; x++) {
	    if (!list[x].isEmpty()) {
		return list[x].remove(0);
	    }
	}
	return null;
    }

    @Override
    public void enqueue(Object o) {
	throw new IllegalStateException("Must supply a priority");
    }

    @Override
    public int size() {
	return list.length;
    }
    
}
