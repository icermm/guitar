package beans;
public class Guitar {

  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;

  public void setSerialNumber(String serialNumber) {
		this.serialNumber =serialNumber;
}
  
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setPrice(double price) {
    this.price = price;
  }
  
  public double getPrice() {
    return price;
  }

  
  public void setBuilder(String builder) {
		this.builder = builder;
  }

  public String getBuilder() {
    return builder;
  }
  
  public void setModel(String model) {
		this.model = model;
  }		
  
  public String getModel() {
    return model;
  }
  
  public void setType(String type) {
		this.type = type;
  }	
  
  public String getType() {
    return type;
  }
  
  public void setBackWood(String backWood) {
		this.backWood = backWood;
  }	
  public String getBackWood() {
    return backWood;
  }
  
  public void setTopWood(String topWood) {
		this.topWood = topWood;
  }	
  public String getTopWood() {
    return topWood;
  }
}
