package javason;

// @Author: Isak Andersson
// Copyright info in license.txt

public class JSONValue <T> {    // T Can be String, number, boolean value, null, JSONObject or JSONArray
	private T value;
	private JavasonValueType type;
	
	public JSONValue(T val, JavasonValueType t) {
		value = val;
		type = t;
	}
	
	T getValue() {
		return value;
	}
	
	JavasonValueType getType() {
		return type;
	}
}
