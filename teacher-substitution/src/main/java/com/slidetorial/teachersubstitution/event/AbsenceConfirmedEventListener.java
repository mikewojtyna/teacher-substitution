/**
 *
 */
package com.slidetorial.teachersubstitution.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.slidetorial.teachersubstitution.domain.teacher.AbsenceConfirmed;
import com.slidetorial.teachersubstitution.domain.teacher.Teacher;
import com.slidetorial.teachersubstitution.domain.teacher.TeacherRepository;
import com.slidetorial.teachersubstitution.domain.timetable.SchoolTimetable;
import com.slidetorial.teachersubstitution.domain.timetable.SchoolTimetableRepository;
import com.slidetorial.teachersubstitution.domain.timetable.SchoolTimetableSerialNumber;

/**
 * @author goobar
 *
 */
@Component
public class AbsenceConfirmedEventListener
{
	private SchoolTimetableRepository schoolTimetableRepository;

	private TeacherRepository teacherRepository;

	/**
	 * Updates the school timetable aggregate using domain event generated
	 * by teacher's absence
	 *
	 * @param event
	 *                event
	 */
	@EventListener
	public void handle(AbsenceConfirmed event)
	{
		SchoolTimetableSerialNumber id = schoolTimetableDefaultId();

		SchoolTimetable schoolTimetable = schoolTimetableRepository
			.load(id);
		Teacher teacher = teacherRepository.load(event.getTeacherId());
		schoolTimetable.cancelLesson(event.getLesson(), teacher);

		schoolTimetableRepository.update(id, schoolTimetable);
	}

	/**
	 * @return
	 */
	private SchoolTimetableSerialNumber schoolTimetableDefaultId()
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
