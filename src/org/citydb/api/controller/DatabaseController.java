/*
 * 3D City Database - The Open Source CityGML Database
 * http://www.3dcitydb.org/
 * 
 * Copyright 2013 - 2016
 * Chair of Geoinformatics
 * Technical University of Munich, Germany
 * https://www.gis.bgu.tum.de/
 * 
 * The 3D City Database is jointly developed with the following
 * cooperation partners:
 * 
 * virtualcitySYSTEMS GmbH, Berlin <http://www.virtualcitysystems.de/>
 * M.O.S.S. Computer Grafik Systeme GmbH, Taufkirchen <http://www.moss.de/>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.citydb.api.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.citydb.api.database.DatabaseAdapter;
import org.citydb.api.database.DatabaseConfigurationException;
import org.citydb.api.database.DatabaseConnectionDetails;
import org.citydb.api.database.DatabaseSrs;
import org.citydb.api.database.DatabaseVersionChecker;
import org.citydb.api.database.DatabaseVersionException;

public interface DatabaseController {
	public void connect(boolean showErrorDialog) throws DatabaseConfigurationException, DatabaseVersionException, SQLException;
	public void disconnect();
	public boolean isConnected();

	public Connection getConnection() throws SQLException;
	public List<DatabaseConnectionDetails> getConnectionDetails();
	public List<DatabaseSrs> getDatabaseSrs();
	
	public DatabaseAdapter getActiveDatabaseAdapter();
	public DatabaseVersionChecker getDatabaseVersionChecker();
}
