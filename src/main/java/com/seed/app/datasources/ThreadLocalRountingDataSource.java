package com.seed.app.datasources;

//import java.util.logging.Logger;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class ThreadLocalRountingDataSource extends AbstractRoutingDataSource {
	
	@Override
	protected Object determineCurrentLookupKey() {
		System.out.println(" ===>>> " + DataSourceTypeManager.get());
		return DataSourceTypeManager.get();
	}

//	@Override
//	public Logger getParentLogger() {
//		return null;
//	}

}
