package droid;

public class Droid {
	String name;
	int batteryLevel;
	
	public Droid(String name){
		this.name = name;
		batteryLevel = 100;		
	}
	
	// Presentation
	
	public String toString(){
		
		System.out.println("");
		
		return "Hi! I'm droid " + name;		
	}
	
	// Task execution

	public void performTask(String task) {
		
		System.out.println("");
		System.out.println(name + " Performing " + task + "...");
		
		// Energy decrease
		
		batteryLevel -= 10; 
	
		// If the battery is low, it displays a warning
		
		if (batteryLevel<21) {
			System.out.println("");
			System.out.println("---------------------");
			System.out.println("WARNING: BATTERY LOW!");
			System.out.println("---------------------");
		}
	}
	
	// Show battery level
	
	public void energyReport() {
		
		System.out.println("");
		System.out.println(name + " Battery level: " + batteryLevel);
	}
	
	// Exchange charge with another droid
	
	public void energyTransfer(Droid instance) {
		
		// Stores the battery level of the corresponding object, thus allowing the other instance to also receive the battery level from the exchange 
		
		int batteryLevelThis = batteryLevel;
		
		// Battery level switching
		
		batteryLevel = instance.batteryLevel;
		instance.batteryLevel = batteryLevelThis;
		
		System.out.println("");	
		System.out.println("---------------------------");
		System.out.println("COMPLETE ENERGY EXCHANGE! " );
		System.out.println("DROIDS: " + name + " and " + instance.name);
		System.out.println("---------------------------");
	}
	
	
}
