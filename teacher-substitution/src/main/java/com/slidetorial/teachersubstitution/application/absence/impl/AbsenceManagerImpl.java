/**
 *
 */
package com.slidetorial.teachersubstitution.application.absence.impl;

import com.slidetorial.teachersubstitution.application.absence.AbsenceManager;
import com.slidetorial.teachersubstitution.application.absence.AbsenceManagerException;
import com.slidetorial.teachersubstitution.application.absence.command.ConfirmTeacherAbsence;
import com.slidetorial.teachersubstitution.domain.teacher.Teacher;
import com.slidetorial.teachersubstitution.domain.teacher.TeacherRepository;

/**
 * @author goobar
 *
 */
public class AbsenceManagerImpl implements AbsenceManager
{

	private TeacherRepository repository;

	/* (non-Javadoc)
	 * @see com.slidetorial.teachersubstitution.application.absence.AbsenceManager#confirmTeacherAbsence(com.slidetorial.teachersubstitution.application.absence.command.ConfirmTeacherAbsence)
	 */
	@Override
	public void confirmTeacherAbsence(ConfirmTeacherAbsence command)
		throws NullPointerException, AbsenceManagerException
	{
		Teacher teacher = repository.load(command.getTeacherId());
		teacher.confirmAbsence(command.getReason(), command.getTime());
	}

}
