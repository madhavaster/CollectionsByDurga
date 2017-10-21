package com.infy.cis.support.services.createincidentservice.datamappers;

import com.infy.cis.framework.services.activities.DataTransferObject;
import com.infy.cis.framework.services.activities.IInternalContext;

public interface Populator {

	void populate(IInternalContext iCtx, DataTransferObject dto);

}
