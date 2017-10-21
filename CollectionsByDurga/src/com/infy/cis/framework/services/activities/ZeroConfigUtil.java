package com.infy.cis.framework.services.activities;

import java.util.ArrayList;
import java.util.List;

public class ZeroConfigUtil {

	public static List<Class> getProviderList(String str1, String str2, IInternalContext iCtx) throws ClassNotFoundException {
		List<Class> al = new ArrayList<Class>();
		Class c = Class.forName(str1);
		al.add(c);
		return al;
	}

}
