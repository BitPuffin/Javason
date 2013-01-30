package javason;
import java.util.HashMap;

// @Author: Isak Andersson
// Copyright info in license.txt

public class JSONObject {    // A key-JSONValue thing (a hashmap)
	
	private HashMap<String, JSONValue<Object>> hash_map;
	
	public JSONObject() {
		hash_map = new HashMap<String, JSONValue<Object>>();
	}
	
	public JSONObject(HashMap<String, JSONValue<Object>> map) {
		hash_map = new HashMap<String, JSONValue<Object>>(map);
	}
	
	// It just makes thing easy you know
	// You can view values with hash_map.values() for example
	public HashMap<String, JSONValue<Object>> getHashMap() {
		return hash_map;
	}
}
