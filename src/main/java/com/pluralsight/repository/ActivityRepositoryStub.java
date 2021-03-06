package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;

public class ActivityRepositoryStub implements ActivityRepository {

	public List<Activity> findAllActivities () {
		
		List<Activity> activities = new ArrayList<Activity> ();
		 
		Activity activity1 = new Activity();
		
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		activities.add(activity1);
		
		Activity activity2 = new Activity();
		
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		activities.add(activity2);
		
		Activity activity3 = new Activity();
		
		activity3.setDescription("Pumping Iron");
		activity3.setDuration(45);
		activities.add(activity3);
		 
		return activities;
		
		
	}
}
