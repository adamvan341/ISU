/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isu.emergencyroom.queue;

/**
 *
 * @author adam
 */
public interface PriorityQueue extends Queue {
    public void enqueue (Object obj, int priority);
}
