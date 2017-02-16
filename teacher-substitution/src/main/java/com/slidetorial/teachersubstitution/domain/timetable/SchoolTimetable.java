/**
 *
 */
package com.slidetorial.teachersubstitution.domain.timetable;

import com.slidetorial.teachersubstitution.domain.BaseEntity;
import com.slidetorial.teachersubstitution.domain.teacher.Teacher;

/**
 * Models a school timetable. This is the aggregate root entity. Timetable is a
 * place where all {@link Lesson}s are scheduled for entire semester.
 *
 * @author goobar
 *
 */
public class SchoolTimetable extends BaseEntity<SchoolTimetableSerialNumber>
{
	// semester contains scheduled lessons - other method implementations
	// will use it
	@SuppressWarnings("unused")
	private Semester semester;

	/**
	 * @param id
	 *                id
	 * @throws NullPointerException
	 *                 if any argument is null
	 */
	// TODO: add at least constructor to recreate root from db
	public SchoolTimetable(SchoolTimetableSerialNumber id)
		throws NullPointerException
	{
		super(id);
	}

	/**
	 * Cancels the given lesson because of teacher's absence. The change is
	 * only temporal - ultimately there must be a new substitute teacher
	 * assigned.
	 *
	 * @param lesson
	 *                lesson
	 * @param teacher
	 *                absent teacher
	 * @throws NullPointerException
	 *                 if any argument is null
	 * @throws TeacherNotAbsentDomainException
	 *                 if teacher is not absent, so lesson cannot be
	 *                 cancelled
	 */
	public void cancelLesson(Lesson lesson, Teacher teacher)
		throws NullPointerException, TeacherNotAbsentDomainException
	{
		// TODO: think about sending events from here - we could send an
		// event using popular EventPublisher pattern, however, I don't
		// really like it - too much infrastructure into domain. The
		// event will be therefore generated and send in the application
		// layer - at least for now.
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * Changes the teacher running the given lesson. If lesson was
	 * previously cancelled, this method automatically opens it again.
	 *
	 * @param substituteTeacher
	 *                a substitute teacher
	 * @param lesson
	 *                lesson
	 * @throws NullPointerException
	 *                 if any argument is null
	 */
	// Note, we can actually reference other aggregate roots temporarily -
	// we just can't
	// composite them
	// Here, we do not care about SubstituteScore. Scores are only
	// suggestions, but the final decision is made solely by human being -
	// most probably the principal.
	public void changeTeacher(Teacher substituteTeacher, Lesson lesson)
		throws NullPointerException
	{
		// TODO: think about sending events from here - we could send an
		// event using popular EventPublisher pattern, however, I don't
		// really like it - too much infrastructure into domain. The
		// event will be therefore generated and send in the application
		// layer - at least for now.
		throw new UnsupportedOperationException("Not implemented");
	}

	// TODO: add mostly query methods to obtain different informations about
	// timetable

}
