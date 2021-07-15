
public class Monkey extends RescueAnimal {
	 
	// Added public enum for species of monkeys
	public enum Species {
		Capuchin, Guenon, Macaque, Marmoset, SquirrelMonkey, Tamarin; 
	}
	
	// Instance variables
    private String taillength;
    private String height;
    private String bodylength;
    private String Species;
    
    // Constructor created to access via Driver.java
    public Monkey(String name, String gender, String age,
    	    String weight, String acquisitionDate, String acquisitionCountry,
    		String trainingStatus, boolean reserved, String inServiceCountry, String taillength, String height, String bodylength,
    		String species) {
    	        setName(name);
    	        setGender(gender);
    	        setAge(age);
    	        setWeight(weight);
    	        setAcquisitionDate(acquisitionDate);
    	        setAcquisitionLocation(acquisitionCountry);
    	        setTrainingStatus(trainingStatus);
    	        setReserved(reserved);
    	        setInServiceCountry(inServiceCountry);
    	        setTaillength(taillength);
    	        setHeight(height);
    	        setBodylength(bodylength);

    	    }

    
	// Accessors and Mutators for all attributes
	public String getTaillength() {
		return taillength;
	}
	public void setTaillength(String taillength) {
		this.taillength = taillength;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getBodylength() {
		return bodylength;
	}
	public void setBodylength(String bodylength) {
		this.bodylength = bodylength;
	}
	public String getSpecies() {
		return Species;
	}
	public void setSpecies(String species) {
		Species = species;
	}

	
}