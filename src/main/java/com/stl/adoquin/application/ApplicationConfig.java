package com.stl.adoquin.application;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * This class contains the configuration of the application.
 * 
 * @author fbertetto
 *
 */
@ApplicationPath("/service")
public class ApplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		resources.add(org.glassfish.jersey.jackson.JacksonFeature.class);
		resources.add(com.stl.adoquin.provider.JacksonJsonProvider.class);
		resources.add(com.stl.adoquin.resource.PingResource.class);
		resources.add(com.stl.adoquin.resource.EventResource.class);
		return resources;
	}

	@Override
	public Set<Object> getSingletons() {
		return Collections.emptySet();
	}

	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<>();
		properties.put("jersey.config.server.wadl.disableWadl", true);
		return properties;
	}
}