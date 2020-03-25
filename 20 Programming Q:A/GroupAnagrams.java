//Cole Constantino | Group Anagrams in their own lists 
import java.util.*;
public class GroupAnagrams{
  public static List<List<String>> groupAnagrams(String[] strs) {
    if(strs.length == 0) return new ArrayList<>();
    //iterate through array and sort the String @ i; save to temp ==> "aet"
    //if map doesnt have "aet" key then  .put(temp, newArrayList)
    //add normal string to that key
    Map<String, List<String>> map = new HashMap<>();
    for(int i = 0; i < strs.length; i++){
      char[] ch = strs[i].toCharArray();
      Arrays.sort(ch);
      String key = String.valueOf(ch);
      if(!map.containsKey(key)) map.put(key, new ArrayList<>());
      map.get(key).add(strs[i]);
    }
    
    return new ArrayList<>(map.values());
  }
  
  public static void main(String[] args){
    String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
    System.out.println(groupAnagrams(s));
    char[] s1 = {'a','n','t','o','n'};
  }
}

/*
 *    input: ["ab","ba","abc","cac"]
 * 
 *    output: [["ab","ba"],
 *                 ["abc"],
 *                 ["cac"]]
 */