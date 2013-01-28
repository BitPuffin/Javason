
public class JSONValue <T> {    // T Can be String, number, boolean value, null, JSONObject or JSONArray
	private T value;
	
	public JSONValue(T val) {
		value = val;
	}
	
	T getValue() {
		return value;
	}
}
