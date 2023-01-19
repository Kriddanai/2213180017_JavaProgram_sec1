import java.time.Year;
public class book {
	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}//title
	
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return this.price;
	}//price
	
	public void setPublishyear(int year) {
		publishyear = year;
	}
	public int setPublishyear() {
		return publishyear;
	}//publishyear
	
	public int getTotalYear() {
		return Year.now().getValue() - publishyear;
	}
	public String toString() {
		return "Title : "+title+" published for " + getTotalYear()+"year ("+ price + "bath).";
	}
	
	

	}

