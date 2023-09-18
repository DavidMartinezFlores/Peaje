package es.iesjandula.peajes.classes;

import es.iesjandula.peajes.interfaces.ITicket;

/**
 *
 * @author David Martinez
 *
 */
public abstract class Ticket implements ITicket
{
	/** Attribute startKilometer */
	private double startKilometer;

	/** Attribute endKilometer */
	private double endKilometer;

	/** Attribute kilometerPrice */
	private double kilometerPrice;

	/**
	 * Constructor for create new Ticket
	 */
	public Ticket()
	{
		this.startKilometer = 0;
		this.endKilometer = 0;
		this.kilometerPrice = 0;
	}

	/**
	 * Constructor for create new Ticket
	 *
	 * @param startKilometer
	 * @param endKilometer
	 * @param kilometerPrice
	 */
	public Ticket(double startKilometer, double endKilometer, double kilometerPrice)
	{
		this.startKilometer = startKilometer;
		this.endKilometer = endKilometer;
		this.kilometerPrice = kilometerPrice;
	}

	/**
	 * Getter for startKilometer
	 *
	 * @return the startKilometer
	 */
	public double getStartKilometer()
	{
		return this.startKilometer;
	}

	/**
	 * Setter for startKilometer
	 *
	 * @param startKilometer the startKilometer to set
	 */
	public void setStartKilometer(double startKilometer)
	{
		this.startKilometer = startKilometer;
	}

	/**
	 * Getter for endKilometer
	 *
	 * @return the endKilometer
	 */
	public double getEndKilometer()
	{
		return this.endKilometer;
	}

	/**
	 * Setter for endKilometer
	 *
	 * @param endKilometer the endKilometer to set
	 */
	public void setEndKilometer(double endKilometer)
	{
		this.endKilometer = endKilometer;
	}

	/**
	 * Getter for kilometerPrice
	 *
	 * @return the kilometerPrice
	 */
	public double getKilometerPrice()
	{
		return this.kilometerPrice;
	}

	/**
	 * Setter for kilometerPrice
	 *
	 * @param kilometerPrice the kilometerPrice to set
	 */
	public void setKilometerPrice(double kilometerPrice)
	{
		this.kilometerPrice = kilometerPrice;
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
		builder.append("Ticket [startKilometer=");
		builder.append(this.startKilometer);
		builder.append(", endKilometer=");
		builder.append(this.endKilometer);
		builder.append(", kilometerPrice=");
		builder.append(this.kilometerPrice);
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
		if (this == obj)
		{
			return true;
		}
		if (!(obj instanceof Ticket))
		{
			return false;
		}
		Ticket other = (Ticket) obj;

		if ((this.endKilometer != other.endKilometer) || (this.kilometerPrice != other.kilometerPrice)
				|| (this.startKilometer != other.startKilometer))
		{
			return false;
		}

		return true;
	}
}
