/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Khondax
 */
public class Histogram <T> {
    
    private final Map<T, Integer> map = new HashMap<>();

    public Integer get(Object key) {
        return map.get(key);
    }

    public Set<T> keySet() {
        return map.keySet();
    }
    
    public Integer incrementa (T key){
        return map.put(key, map.containsKey(key)? map.get(key)+1 :1);
    }
    
}