package com.infy.cis.framework.services.activities;

import java.util.HashMap;

public class Test {

	public static void main(String args[]) throws InstantiationException, IllegalAccessException, CRMSystemException, CRMBusinessException, ClassNotFoundException {
		Population p = new Population();
		IInternalContext iCtx =null;
		String str = null;
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("populator", "com.infy.cis.support.services.createincidentservice.datamappers.InIncidentVOBOPopulator");
		hm.put("localmode", null);
		DataTransferObject dto = null;
		p.execute(iCtx, str, hm, dto);
		Object s1 = null;
		Object s2 = null;
	}
}
