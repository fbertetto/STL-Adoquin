package com.stl.adoquin.resource;

import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * This class for test the status of the system.
 * 
 * @author fbertetto
 *
 */
@Path("/ping")
public class PingResource {

	/**
	 * Method to check if the server is up.
	 * 
	 * @return time ping was received.
	 */
	@GET
	public String getServerTime() {
		return "adoquin - received ping on " + new Date().toString();
	}
}