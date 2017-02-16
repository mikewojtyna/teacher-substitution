/**
 *
 */
package com.slidetorial.teachersubstitution.domain.teacher;

import java.time.LocalDate;
import com.slidetorial.teachersubstitution.domain.timetable.Lesson;

/**
 * A class to simplify availability calculations.
 *
 * @author goobar
 *
 */
// TODO: add other availability factory methods
public class AvailabilityMode
{
	/**
	 * Creates an availability which returns
	 * {@link AvailabilityStatus#AVAILABLE} for every day except of some
	 * given days for which {@code unavailableStatus} is returned.
	 *
	 * @param unavailableStatus
	 *                status returned for days which teacher is unavailable,
	 *                cannot be {@link AvailabilityStatus#AVAILABLE}
	 * @param absenceReason
	 *                the reason why teacher is absent in selected days
	 * @param days
	 *                days which teacher is not available
	 * @return the configured AvailabilityMode instance
	 * @throws NullPointerException
	 *                 if any argument is null
	 * @throws IllegalArgumentException
	 *                 if contract is violated
	 */
	public static AvailabilityMode availableEveryDayExceptOf(
		AvailabilityStatus unavailableStatus,
		AbsenceReason absenceReason, LocalDate... days)
		throws NullPointerException, IllegalArgumentException
	{
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * @param lesson
	 *                a lesson for which availability is checked
	 * @return the availability status for {@code lesson}
	 */
	public Availability availabilityForLesson(Lesson lesson)
	{
		throw new UnsupportedOperationException("Not implemented");
	}
}
