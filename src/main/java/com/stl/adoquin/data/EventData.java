package com.stl.adoquin.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stl.adoquin.model.Event;

/**
 * This class simulates a db connection to get data of the Events.
 * 
 * @author fbertetto
 *
 */
public class EventData {

	private ArrayList<Event> events = new ArrayList<Event>();

	public EventData() {
		Event e = new Event();
		e.setId(100);
		e.setName("adoquin!");
		e.setDate(new Date());
		e.setPlace("somewhere");
		e.setDescription("must go");
		events.add(e);
		e.setId(1);
		e.setName("event1");
		events.add(e);
		e.setId(2);
		e.setName("event2");
		events.add(e);
		e.setId(3);
		e.setName("event3");
		events.add(e);
		e.setId(4);
		e.setName("event4!");
		events.add(e);
	}

	public List<Event> getAllEvents() {
		return events;
	}

	public Event getEventById(int id) {
		return events.get(id);
	}

	public void addEvent(Event event) {
		events.add(event);
	}

	public void removeEvent(int id) {
		events.remove(id);
	}
}
