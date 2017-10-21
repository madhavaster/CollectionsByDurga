package com.infy.cis.framework.services.activities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.infy.cis.support.services.createincidentservice.datamappers.Populator;

public class Population extends ActivityHandler{

	@Override
	public void execute(IInternalContext iCtx, String str, HashMap<String, String> hm, DataTransferObject dto)	throws CRMSystemException, CRMBusinessException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		String str1 = (String)hm.get("populator");
		String str2 = (String)hm.get("localmode");
		if((str2==null) || (str2.equals(""))) {
			str2="augment";
		}
		
		if((str1!=null)&&(!("".equals(str1)))) {
			
			List<Class> list =ZeroConfigUtil.getProviderList(str1,str2,iCtx);
			System.out.println(list);
			Iterator<Class> itr = list.iterator();
			while(itr.hasNext()) {
				Class<Populator> c = (Class<Populator>)itr.next();
				Populator populator = (Populator)c.newInstance();
				populator.populate(iCtx,dto);
			}
		}
	}

}
