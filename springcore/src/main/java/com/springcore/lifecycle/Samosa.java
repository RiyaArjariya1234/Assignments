package com.springcore.lifecycle;

public class Samosa {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa() {
		super();
		
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void hey()
	{
		System.out.println("Inside init method hey are u");
	}
    public void bye()
    {
    	System.out.println("Inside destroy method bye are u");
    }
	/*public void init()
	{
		System.out.println("Inside init method");
	}
    public void destroy()
    {
    	System.out.println("Inside destroy method");
    }*/
	
}
