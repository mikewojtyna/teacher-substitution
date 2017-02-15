/**
 *
 */
package com.slidetorial.teachersubstitution.application.absence;

import com.slidetorial.teachersubstitution.application.absence.command.ConfirmTeacherAbsence;

/**
 * This service provides API for business scenario commands regarding teacher
 * absence.
 *
 * @author goobar
 *
 */
public interface AbsenceManager
{
	/**
	 * Confirms the teacher's absence.
	 *
	 * @param command
	 *                a command with all data required to confirm teacher's
	 *                absence
	 * @throws NullPointerException
	 *                 if any argument is null
	 * @throws InvalidAbsenceManagerCommandException
	 *                 if command is invalid
	 * @throws AbsenceManagerException
	 *                 if fails
	 */
	void confirmTeacherAbsence(ConfirmTeacherAbsence command)
		throws NullPointerException, AbsenceManagerException;
}
