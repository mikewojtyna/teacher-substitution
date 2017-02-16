/**
 *
 */
package com.slidetorial.teachersubstitution.anemic;

import java.util.List;

/**
 * @author goobar
 *
 */
public class TimetableAnemic
{
	private List<LessonAnemic> lesson;

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
		TimetableAnemic other = (TimetableAnemic) obj;
		if (lesson == null)
		{
			if (other.lesson != null)
			{
				return false;
			}
		}
		else if (!lesson.equals(other.lesson))
		{
			return false;
		}
		return true;
	}

	/**
	 * @return the lesson
	 */
	public List<LessonAnemic> getLesson()
	{
		return lesson;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
			+ ((lesson == null) ? 0 : lesson.hashCode());
		return result;
	}

	/**
	 * @param lesson
	 *                the lesson to set
	 */
	public void setLesson(List<LessonAnemic> lesson)
	{
		this.lesson = lesson;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		final int maxLen = 10;
		return "TimetableAnemic [lesson=" + (lesson != null
			? lesson.subList(0, Math.min(lesson.size(), maxLen))
			: null) + "]";
	}
}
