package com.stl.adoquin.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stl.adoquin.data.EventData;
import com.stl.adoquin.model.Event;

/**
 * This class contains the functionality to manage Events, and the possible
 * calls for the rest api.
 * 
 * @author fbertetto
 *
 */
@Path("/event")
public class EventResource {

	/**
	 * List all events.
	 * 
	 * TODO we don´t need full information of all events here.
	 * 
	 * @return a complete list with events.
	 */
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Event> getAllEvents() {
		EventData data = new EventData();
		ArrayList<Event> events = (ArrayList<Event>) data.getAllEvents();
		return events;
	}

	/**
	 * Get an specific event by id.
	 * 
	 * @param id
	 *            of the event.
	 * @return full Event.
	 */
	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Event getEvent(@PathParam("id") int id) {
		EventData data = new EventData();
		Event event = data.getEventById(id);
		return event;
	}

	/**
	 * Add a new event.
	 * 
	 * @param event
	 * @return status
	 */
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.TEXT_PLAIN })
	public String postMessage(Event event) {
		EventData data = new EventData();
		data.addEvent(event);
		return "ok";
	}

}
