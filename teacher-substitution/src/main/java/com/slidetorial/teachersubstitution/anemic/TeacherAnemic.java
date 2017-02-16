/**
 *
 */
package com.slidetorial.teachersubstitution.anemic;

/**
 * @author goobar
 *
 */
@SuppressWarnings("javadoc")
public class TeacherAnemic
{
	private boolean absent;

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
		TeacherAnemic other = (TeacherAnemic) obj;
		if (absent != other.absent)
		{
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (absent ? 1231 : 1237);
		return result;
	}

	/**
	 * @return the absent
	 */
	public boolean isAbsent()
	{
		return absent;
	}

	/**
	 * @param b
	 */
	public void setAbsent(boolean b)
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "TeacherAnemic [absent=" + absent + "]";
	}

}
