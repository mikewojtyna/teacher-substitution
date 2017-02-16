/**
 *
 */
package com.slidetorial.teachersubstitution.domain.teacher;

import java.time.LocalDate;
import java.util.Collection;
import com.slidetorial.teachersubstitution.domain.timetable.Lesson;

/**
 * @author goobar
 *
 */
public class AbsenceTime
{
	/**
	 * @return absence days
	 */
	public Collection<LocalDate> getDays()
	{
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * @return the absence lessons
	 */
	public Collection<Lesson> getLessons()
	{
		throw new UnsupportedOperationException("Not implemented");
	}
}
