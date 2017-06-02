package pl.roomate.run.model;

public class Version {
	private final String version;
	private final int value;
	
	
	public Version(String version, int value) {
		super();
		this.version = version;
		this.value = value;
	}


	public String getVersion() {
		return version;
	}


	public int getValue() {
		return value;
	}
}
