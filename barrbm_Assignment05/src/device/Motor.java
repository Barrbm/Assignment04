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
 * This class models a motor that inherits from device.
 * 
 * @author Barrbm
 *
 */
public class Motor extends Device {
	private int maxRPM;

	/**
	 * constructor for the motor
	 * 
	 * @param partNumber the part number of the motor
	 * @param SKU        the SKU of the motor
	 * @param maxRPM     the max RPM of the motor
	 */
	public Motor(String partNumber, String SKU, int maxRPM) {
		super(partNumber, SKU);
		this.setMaxRPM(maxRPM);
	}

	/**
	 * copy constructor for the motor
	 * 
	 * @param mot
	 */
	public Motor(Motor mot) {
		super(mot.getPartNumber(), mot.getSKU());
		setMaxRPM(mot.getMaxRPM());
	}

	/**
	 * gets the max RPM for the motor
	 * 
	 * @return
	 */
	public int getMaxRPM() {
		return maxRPM;
	}

	/**
	 * sets the max RPM for the motor
	 * 
	 * @param maxRPM
	 */
	public void setMaxRPM(int maxRPM) {
		this.maxRPM = maxRPM;
	}

	/**
	 * resets the max RPM for the motor
	 */
	public void resetRPM() {
		this.maxRPM = 0;
	}

	/**
	 * returns all values of the motor
	 */
	public String toString() {
		return ("Part Number = " + super.getPartNumber() + ", SKU = " + super.getSKU() + ", Power On = "
				+ super.getOnOff() + ", maxRPM = " + maxRPM);
	}

}
