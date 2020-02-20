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
package factory;

import device.Conveyor;
import device.Motor;
import device.Pump;

/**
 * This class models a factory.
 * 
 * @author Barrbm
 *
 */
public class Factory {
	Motor motor;
	Pump pump;
	Conveyor conveyor;

	/**
	 * constructor for factory
	 * 
	 * @param mot the motor the factory uses
	 * @param pum the pump the factory uses
	 * @param con the conveyor the factory uses
	 */
	public Factory(Motor mot, Pump pum, Conveyor con) {
		this.motor = new Motor(mot);
		this.pump = new Pump(pum);
		this.conveyor = new Conveyor(con);
	}

	/**
	 * returns the factory's objects, plus some information about the objects
	 */
	public String toString() {
		return ("Motor(" + motor + ") Pump(" + pump + ") Conveyor(" + conveyor + ")");
	}

}
