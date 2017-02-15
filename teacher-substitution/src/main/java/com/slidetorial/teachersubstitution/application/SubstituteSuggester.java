/**
 *
 */
package com.slidetorial.teachersubstitution.application;

import com.slidetorial.teachersubstitution.domain.Absentee;
import com.slidetorial.teachersubstitution.domain.SubstituteSuggestion;

/**
 * A service to suggest best substitute teachers.
 *
 * @author goobar
 *
 */
public interface SubstituteSuggester
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
	 * @throws SubstituteSuggesterException
	 *                 if fails
	 */
	SubstituteSuggestion suggestSubstituteForAbsentee(Absentee absentee)
		throws NullPointerException, SubstituteSuggesterException;
}
