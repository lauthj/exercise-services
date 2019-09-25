package com.pluralsight;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pluralsight.model.Activity;
import com.pluralsight.repository.ActivityRepository;
import com.pluralsight.repository.ActivityRepositoryStub;

@Path("activities")
public class ActivityResource {
	
	private ActivityRepositoryStub activityRepository = new ActivityRepositoryStub();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Activity> getAllActivities() {
		
		return activityRepository.findAllActivities();
		//return "Joe is cool";
		
		
	}

}