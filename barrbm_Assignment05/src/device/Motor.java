package device;

public class Motor extends Device {
	private int maxRPM;

	public Motor(String partNumber, String SKU, Boolean onOff, int maxRPM) {
		super(partNumber, SKU, onOff);
		this.setMaxRPM(maxRPM);
	}

	public int getMaxRPM() {
		return maxRPM;
	}

	public void setMaxRPM(int maxRPM) {
		this.maxRPM = maxRPM;
	}

	public void resetRPM() {
		this.maxRPM = 0;
	}

	public String toString() {
		return ("Part Number = " + super.getPartNumber() + ", SKU = " + super.getSKU() + ", Power On = "
				+ super.getOnOff() + ", maxRPM = " + maxRPM);
	}
}
