package javason;
import java.util.ArrayList;

// @Author: Isak Andersson
// Copyright info in license.txt

public class JSONArray {    // An ordered list of JSONValues (array)
	private ArrayList<JSONValue<Object>> values;
	
	public JSONArray(ArrayList<JSONValue<Object>> a) {
		values = new ArrayList<JSONValue<Object>>(a);
	}
	
	public JSONValue<Object>[] getArray() {
		JSONValue<Object>[] arr = null;
		return values.toArray(arr);
	}
}
