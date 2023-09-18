package es.iesjandula.peajes.classes;

import es.iesjandula.peajes.constants.Constants;

/**
 *
 * @author David Martinez
 *
 */
public class TicketSpecial extends Ticket
{

	
	/** Attribute discount*/
	private final double discount;

	
	/** Attribute discountKilometer*/
	private final double discountKilometer;

	
	/**
	 * Constructor for create new TicketSpecial
	 */
	public TicketSpecial()
	{
		super();
		this.discount = Constants.NUMBER_5;
		this.discountKilometer = Constants.NUMBER_100;
	}

	
	/**
	 * Constructor for create new TicketSpecial
	 * @param startKilometer
	 * @param endKilometer
	 * @param kilometerPrice
	 */
	public TicketSpecial(double startKilometer, double endKilometer, double kilometerPrice)
	{
		super(startKilometer, endKilometer, kilometerPrice);
		this.discount = Constants.NUMBER_5;
		this.discountKilometer = Constants.NUMBER_100;
	}

	/**
	 * Getter for discount
	 * 
	 * @return the discount
	 */
	public double getDiscount()
	{
		return this.discount;
	}

	/**
	 * Getter for discountKilometer
	 * 
	 * @return the discountKilometer
	 */
	public double getDiscountKilometer()
	{
		return this.discountKilometer;
	}

	/**
	 *
	 * Method calculateDiscount
	 * 
	 * @param kilometers
	 * @return
	 */
	@Override
	public double calculateDiscount(double kilometers)
	{

		double totalPrice = this.getKilometerPrice() * kilometers;
		int count = (int) (kilometers / Constants.NUMBER_100);

		if (kilometers >= 1)
		{
			double discountPercent = (this.discount * count);
			totalPrice = totalPrice - ((totalPrice * discountPercent) / Constants.NUMBER_100);
		}

		return totalPrice;
	}

	/**
	 * Method toString
	 * 
	 * @return
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("TicketEspecial [discount=");
		builder.append(this.discount);
		builder.append(", discountKilometer=");
		builder.append(this.discountKilometer);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Method equals
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj)
	{
		boolean result = super.equals(obj);

		if (!(obj instanceof TicketSpecial))
		{
			return false;
		}
		TicketSpecial other = (TicketSpecial) obj;

		if ((this.discount != other.discount) || (this.discountKilometer != other.discountKilometer))
		{
			return false;
		}

		return result;
	}

}
