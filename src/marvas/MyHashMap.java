/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvas;

import java.util.HashMap;

/**
 *
 * @author cj
 */
class MyHashMap<T> {
    int index = 0;
    HashMap<Integer, T> internalMap = new HashMap<>();

    public int add(T t) {
        int temp = index++;
        internalMap.put(temp, t);
        return temp;
    }
}
