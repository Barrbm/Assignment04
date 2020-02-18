package device;

public class Pump extends Device {
	private float flowRate;

	public Pump(String partNumber, String SKU, Boolean onOff, float flowRate) {
		super(partNumber, SKU, onOff);
	}

}
