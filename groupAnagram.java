import java.util.*;

class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Step 1: Create a HashMap
        // Key = sorted string
        // Value = list of original strings (anagrams)
        Map<String, List<String>> map = new HashMap<>();
        
        // Step 2: Traverse each string in input array
        for (String str : strs) {
            
            // Step 3: Convert string to char array
            char[] arr = str.toCharArray();
            
            // Step 4: Sort the array
            // This ensures all anagrams get same form
            Arrays.sort(arr);
            
            // Step 5: Convert sorted array back to string (this is key)
            String key = new String(arr);
            
            // Step 6: If key does not exist in map, create new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            // Step 7: Add original string into the corresponding group
            map.get(key).add(str);
        }
        
        // Step 8: Return all grouped values as a list
        return new ArrayList<>(map.values());
    }
}