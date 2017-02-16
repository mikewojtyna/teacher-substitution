/**
 *
 */
package com.slidetorial.teachersubstitution.domain.timetable;

/**
 * @author goobar
 *
 */
public enum LessonDuration
{

	/**
	 * 90 minutes lesson.
	 */
	EXTENDED(90),
	/**
	 * 45 minutes lesson.
	 */
	STANDARD(45);

	private int minutes;

	/**
	 *
	 */
	private LessonDuration(int minutes)
	{
		this.minutes = minutes;
	}

	/**
	 * @return the minutes
	 */
	public int getValue()
	{
		return minutes;
	}
}
