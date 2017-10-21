package com.infy.cis.framework.services.activities;

import java.util.HashMap;

public abstract class ActivityHandler {
	abstract void execute(IInternalContext iCtx, String str, HashMap<String,String> hm, DataTransferObject dto) throws CRMSystemException, CRMBusinessException, InstantiationException, IllegalAccessException,ClassNotFoundException;
}
