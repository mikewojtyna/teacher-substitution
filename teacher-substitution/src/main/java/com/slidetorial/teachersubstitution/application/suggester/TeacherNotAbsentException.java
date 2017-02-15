/**
 *
 */
package com.slidetorial.teachersubstitution.application.suggester;

/**
 * A specialization of generic {@link SubstituteTeacherSuggesterException}
 * thrown when given teacher is not absent at any time, so there's no need to
 * find a subtitute.
 *
 * @author goobar
 *
 */
public class TeacherNotAbsentException
	extends SubstituteTeacherSuggesterException
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

}
