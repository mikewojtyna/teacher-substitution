/**
 *
 */
package com.slidetorial.teachersubstitution.application.suggester;

import com.slidetorial.teachersubstitution.domain.SubstituteSuggestion;
import com.slidetorial.teachersubstitution.domain.Teacher;

/**
 * An entry point to the substitute teacher suggester engine API.
 *
 * @author goobar
 *
 */
public interface SubstituteTeacherSuggester
{
	/**
	 * Suggests best substitute teachers.
	 *
	 * @param absentee
	 *                the absent teacher
	 * @return the best possible substitute suggestion
	 *
	 * @throws NullPointerException
	 *                 if any argument is null
	 * @throws TeacherNotAbsentException
	 *                 if teacher is not absent
	 * @throws SubstituteTeacherSuggesterException
	 *                 if fails
	 */
	SubstituteSuggestion suggestSubstitutesFor(Teacher absentee)
		throws NullPointerException,
		SubstituteTeacherSuggesterException;
}
