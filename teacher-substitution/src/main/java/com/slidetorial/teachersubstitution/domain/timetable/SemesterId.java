/**
 *
 */
package com.slidetorial.teachersubstitution.domain.timetable;

/**
 * @author goobar
 *
 */
public class SemesterId
{
	private final int startYear;

	private final SemesterType type;

	/**
	 * @param startYear
	 *                start year, must be > 1900
	 * @param type
	 *                type
	 * @throws NullPointerException
	 *                 if any argument is null
	 * @throws IllegalArgumentException
	 *                 if contract is violated
	 */
	public SemesterId(int startYear, SemesterType type)
		throws NullPointerException, IllegalArgumentException
	{
		validate(startYear, type);
		this.startYear = startYear;
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		SemesterId other = (SemesterId) obj;
		if (startYear != other.startYear)
		{
			return false;
		}
		if (type != other.type)
		{
			return false;
		}
		return true;
	}

	/**
	 * @return the startYear
	 */
	public int getStartYear()
	{
		return startYear;
	}

	/**
	 * @return the type
	 */
	public SemesterType getType()
	{
		return type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + startYear;
		result = prime * result
			+ ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "SemesterId [startYear=" + startYear + ", type=" + type
			+ "]";
	}

	/**
	 * @param startYear
	 * @param type
	 */
	private void validate(int startYear, SemesterType type)
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
