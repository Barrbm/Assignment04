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
 * This class models a device.
 * 
 * @author Barrbm
 *
 */
public class Device {
	private String partNumber;
	private String SKU;
	private Boolean onOff;

	/**
	 * constructor for the device
	 * 
	 * @param partNumber the part number
	 * @param SKU        the SKU
	 */
	public Device(String partNumber, String SKU) {
		this.setOnOff(false);
		this.setPartNumber(partNumber);
		this.setSKU(SKU);
	}

	/**
	 * copy constructor for the device
	 * 
	 * @param dev
	 */
	Device(Device dev) {
		partNumber = dev.partNumber;
		SKU = dev.SKU;
		onOff = dev.onOff;
	}

	/**
	 * returns the device's power status
	 * 
	 * @return
	 */
	public Boolean getOnOff() {
		return onOff;
	}

	/**
	 * turns the device on or off
	 * 
	 * @param onOff
	 */
	public void setOnOff(Boolean onOff) {
		this.onOff = onOff;
	}

	/**
	 * gets the SKU of the device
	 * 
	 * @return
	 */
	public String getSKU() {
		return SKU;
	}

	/**
	 * sets the SKU of the device
	 * 
	 * @param sKU
	 */
	public void setSKU(String sKU) {
		SKU = sKU;
	}

	/**
	 * gets the part number of the device
	 * 
	 * @return
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * sets the part number of the device
	 * 
	 * @param partNumber
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 * returns all the values of the device
	 */
	public String toString() {
		return ("Part Number = " + partNumber + ", SKU = " + SKU + ", Power On = " + onOff);
	}
}
