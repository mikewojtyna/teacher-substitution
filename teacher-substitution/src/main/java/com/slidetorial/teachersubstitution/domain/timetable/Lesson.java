/**
 *
 */
package com.slidetorial.teachersubstitution.domain.timetable;

import com.slidetorial.teachersubstitution.domain.BaseEntity;
import com.slidetorial.teachersubstitution.domain.common.Subject;
import com.slidetorial.teachersubstitution.domain.teacher.PersonalIdentificationNumber;

/**
 * Lesson is actually an entity being part of school timetable aggregate. Each
 * {@link Lesson} lasts for {@link LessonDuration#STANDARD} time.
 *
 * @author goobar
 *
 */
public class Lesson extends BaseEntity<LessonStartDate>
{
	private static final LessonDuration DURATION = LessonDuration.STANDARD;

	/**
	 * @return the duration
	 */
	public static LessonDuration getDuration()
	{
		return DURATION;
	}

	private Subject subject;

	// we do not composite teacher directly - instead we use a teacher id to
	// avoid modifying other aggregate's state in the same "transaction"
	private PersonalIdentificationNumber teacherId;

	/**
	 * @param id
	 *                id
	 * @throws NullPointerException
	 *                 if any argument is null
	 */
	public Lesson(LessonStartDate id) throws NullPointerException
	{
		super(id);
	}

	/**
	 * @return the subject
	 */
	public Subject getSubject()
	{
		return subject;
	}

	/**
	 * @return the teacherId
	 */
	public PersonalIdentificationNumber getTeacherId()
	{
		return teacherId;
	}

	/**
	 * @param substituteTeacher
	 *                the new teacher - id only
	 */
	public void replaceTeacher(
		PersonalIdentificationNumber substituteTeacher)
	{
		throw new UnsupportedOperationException("Not implemented");
	}

}
