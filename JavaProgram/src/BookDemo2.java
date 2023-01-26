
public class BookDemo2 {
		private String name;
		private Author1 author; //from author class
		private float price;
		private int qty = 0;
		
		public Book1(String name, Author1 author, float price) {
			this.name = name;
			this.author = author;
			this.price = price;		
		}
		
		public Book1(String name, Author1 author, float price, int qty) {
			this.name = name;
			this.author = author;
			this.price = price;	
			this.qty = qty;
		}
		
		public String getName() {
			return name;
		}
		
		public Author1 getAuthor() {
			return author;
		}
		
		public float getPrice() {
			return price;
		}
		
		public float getPrice(float price) {
			this.price = price;
		}
		
		public int setQyt() {
			return qty;
		}
		
		public void getPrice(int qty) {
			this.qty = qty;
		}
		
		public String toString() {
			return "Book[name = " + getname() + "," + author + ",price = " + getPrice ]"
		}
		
		

}
