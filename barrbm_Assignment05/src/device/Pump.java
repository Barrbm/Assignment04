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
 * This class models a pump that inherits from Device.
 * 
 * @author Barrbm
 *
 */
public class Pump extends Device {
	private float flowRate;

	/**
	 * construcotr for the pump
	 * 
	 * @param partNumber the part number of the pump
	 * @param SKU        the SKU of the pump
	 * @param flowRate   the flow rate of the pump
	 */
	public Pump(String partNumber, String SKU, float flowRate) {
		super(partNumber, SKU);
		this.setFlowRate(flowRate);
	}

	/**
	 * copy constructor for the pump
	 * 
	 * @param pum
	 */
	public Pump(Pump pum) {
		super(pum.getPartNumber(), pum.getSKU());
		setFlowRate(pum.getFlowRate());
	}

	/**
	 * gets the flow rate of the pump
	 * 
	 * @return
	 */
	public float getFlowRate() {
		return flowRate;
	}

	/**
	 * sets the flow rate of the pump
	 * 
	 * @param flowRate
	 */
	public void setFlowRate(float flowRate) {
		this.flowRate = flowRate;
	}

	/**
	 * returns all values of the pump
	 */
	public String toString() {
		return ("Part Number = " + super.getPartNumber() + ", SKU = " + super.getSKU() + ", Power On = "
				+ super.getOnOff() + ", Flow Rate = " + flowRate);
	}

}
