/*  

* Name: Blake Barr  

* Email: barrbm@mail.uc.edu  

* Course: IT2045C  

* Assignment #: 05

* Due Date:  2/20

* Description: This program declares and instantiates an object that uses a 'has-a' relationship with other objects

* Citations: My other in class work

* Comments: none

*/
package main;

import device.Conveyor;
import device.Motor;
import device.Pump;
import factory.Factory;

public class Main {

	public static void main(String[] args) {
		Pump pumper = new Pump("3521", "#ERT", 3);
		Motor motorer = new Motor("4632", "#AYE", 100);
		Conveyor conveyorer = new Conveyor("3818", "#TEH", 30); // Declare the objects

		System.out.println(pumper.toString());
		System.out.println(motorer.toString());
		System.out.println(conveyorer.toString());

		motorer.resetRPM();

		Factory heinz = new Factory(motorer, pumper, conveyorer); // Declare a factory object that has a relationship
																	// with the 3 objects it needs

		System.out.println(heinz.toString());

	}
}
