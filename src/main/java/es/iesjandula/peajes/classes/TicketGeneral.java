package es.iesjandula.peajes.classes;

import es.iesjandula.peajes.constants.Constants;

/**
 *
 * @author David Martinez
 *
 */
public class TicketGeneral extends Ticket
{

	/** Attribute discount */
	private final double discount;

	/** Attribute discountKilometer*/
	private final double discountKilometer;

	/**
	 * Constructor for create new TicketGeneral
	 */
	public TicketGeneral()
	{
		super();
		this.discount = Constants.NUMBER_10;
		this.discountKilometer = Constants.NUMBER_500;
	}

	/**
	 *
	 * Constructor for create new TicketGeneral
	 *
	 * @param startKilometer
	 * @param endKilometer
	 * @param kilometerPrice
	 */
	public TicketGeneral(double startKilometer, double endKilometer, double kilometerPrice)
	{
		super(startKilometer, endKilometer, kilometerPrice);
		this.discount = Constants.NUMBER_10;
		this.discountKilometer = Constants.NUMBER_500;
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
	 *
	 * Method calculateDiscount
	 *
	 * @return
	 */
	@Override
	public double calculateDiscount(double kilometers)
	{
		double totalPrice = this.getKilometerPrice() * kilometers;
		int count = (int) (kilometers / Constants.NUMBER_500);

		if (kilometers >= 1)
		{
			double discountPercent = (this.discount * count);
			totalPrice = totalPrice - ((totalPrice * discountPercent) / 100);
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
		builder.append("TicketGeneral [discount=");
		builder.append(this.discount);
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

		if (!(obj instanceof TicketGeneral))
		{
			return false;
		}
		TicketGeneral other = (TicketGeneral) obj;

		if ((this.discount != other.discount) || (this.discountKilometer != other.discountKilometer))
		{
			return false;
		}

		return result;
	}

}
