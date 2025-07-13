package Books;

public class book {
	
	private String title;
	private String author;
	private double price;
	private int quantityInStock;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	
    public void displayInfo() {
    	System.out.println("Title: "+getTitle());
    	System.out.println("Author:"+getAuthor());
    	System.out.println("Price:"+getPrice());
    	System.out.println("Quantity:"+getQuantityInStock());
    	System.out.println(" ");
	}
	

	public static void main(String[] args) {
		
		book b1=new book();
		b1.setTitle("Radhey");
		b1.setAuthor("Ranjit Desai");
		b1.setPrice(100);
		b1.setQuantityInStock(15);
		b1.displayInfo();
		
		book b2=new book();
		b2.setTitle("Sham chi Aai");
		b2.setAuthor("Sane Guruji");
		b2.setPrice(150);
		b2.setQuantityInStock(30);
		b2.displayInfo();
		

	}

}
