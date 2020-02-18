package device;

public class Device {
	private String partNumber;
	private String SKU;
	private Boolean onOff = false;
	
	public Device(String partNumber, String SKU, Boolean onOff)	{
		this.setOnOff(onOff);
		this.setPartNumber(partNumber);
		this.setSKU(SKU);
	}

	public Boolean getOnOff() {
		return onOff;
	}

	public void setOnOff(Boolean onOff) {
		this.onOff = onOff;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public String toString()	{
		return("Part Number = " + partNumber + ", SKU = " + SKU + ", Power On = " + onOff);
	}
}
