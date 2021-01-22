package com.lhn.formssi.util;

import net.sf.json.JSONArray;

public class JsonUtil {

	//判断是否为JsonObject类型
	public static boolean isJsonArray(JSONArray array,int index) {
		if(array.optJSONArray(index) == null) {
			return false;
		}
		return true;
	}
}
