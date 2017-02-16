/**
 *
 */
package com.slidetorial.teachersubstitution.anemic;

/**
 * @author goobar
 *
 */
public class LessonAnemic
{
	private boolean cancelled;

	private String teacher;

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
		LessonAnemic other = (LessonAnemic) obj;
		if (cancelled != other.cancelled)
		{
			return false;
		}
		if (teacher == null)
		{
			if (other.teacher != null)
			{
				return false;
			}
		}
		else if (!teacher.equals(other.teacher))
		{
			return false;
		}
		return true;
	}

	/**
	 * @return the teacher
	 */
	public String getTeacher()
	{
		return teacher;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (cancelled ? 1231 : 1237);
		result = prime * result
			+ ((teacher == null) ? 0 : teacher.hashCode());
		return result;
	}

	/**
	 * @return the cancelled
	 */
	public boolean isCancelled()
	{
		return cancelled;
	}

	/**
	 * @param cancelled
	 *                the cancelled to set
	 */
	public void setCancelled(boolean cancelled)
	{
		this.cancelled = cancelled;
	}

	/**
	 * @param teacher
	 *                the teacher to set
	 */
	public void setTeacher(String teacher)
	{
		this.teacher = teacher;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "LessonAnemic [cancelled=" + cancelled + ", teacher="
			+ teacher + "]";
	}
}
