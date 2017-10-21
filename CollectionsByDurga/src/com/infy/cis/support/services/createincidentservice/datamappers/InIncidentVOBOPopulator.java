package com.infy.cis.support.services.createincidentservice.datamappers;

import com.infy.cis.framework.services.activities.DataTransferObject;
import com.infy.cis.framework.services.activities.IInternalContext;

public class InIncidentVOBOPopulator implements Populator{

	@Override
	public void populate(IInternalContext iCtx, DataTransferObject dto) {
		System.out.println("success");
	}

}
