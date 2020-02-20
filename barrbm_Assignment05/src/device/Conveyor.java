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
package device;

/**
 * This class models a conveyor that inherits from Device.
 * 
 * @author Barrbm
 *
 */
public class Conveyor extends Device {
	private int speed;

	/**
	 * constructor for the conveyor
	 * 
	 * @param partNumber the part number of the conveyor
	 * @param SKU        the SKU of the conveyor
	 * @param speed      the overall speed of the conveyor
	 */
	public Conveyor(String partNumber, String SKU, int speed) {
		super(partNumber, SKU);
		this.setSpeed(speed);
	}

	/**
	 * copy constructor for the conveyor
	 * 
	 * @param con
	 */
	public Conveyor(Conveyor con) {
		super(con.getPartNumber(), con.getSKU());
		setSpeed(con.getSpeed());
	}

	/**
	 * gets the speed of the conveyor
	 * 
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * sets the speed of the conveyor
	 * 
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * returns all information about the conveyor
	 */
	public String toString() {
		return ("Part Number = " + super.getPartNumber() + ", SKU = " + super.getSKU() + ", Power On = "
				+ super.getOnOff() + ", Speed = " + speed);
	}

}
