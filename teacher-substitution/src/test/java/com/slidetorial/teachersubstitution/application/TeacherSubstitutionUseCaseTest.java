/**
 *
 */
package com.slidetorial.teachersubstitution.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.slidetorial.teachersubstitution.application.absence.AbsenceManager;
import com.slidetorial.teachersubstitution.application.absence.command.ConfirmTeacherAbsence;
import com.slidetorial.teachersubstitution.application.suggester.SubstituteTeacherSuggester;
import com.slidetorial.teachersubstitution.domain.SubstituteSuggestion;
import com.slidetorial.teachersubstitution.domain.Teacher;

/**
 * @author goobar
 *
 */
@SuppressWarnings("javadoc")
public class TeacherSubstitutionUseCaseTest
{

	private AbsenceManager absenceManager;

	private SubstituteTeacherSuggester substituteTeacherSuggester;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void should_SuggestBestSubstituteTeachers_When_MainTeacherIsAbsent()
		throws Exception
	{
		// given
		// TODO: add arguments to this method to define available
		// teachers, subjects and other domain stuff
		populateSchoolTimetable();
		Teacher absentTeacher = null;
		ConfirmTeacherAbsence command = null;
		SubstituteSuggestion expectedSuggestion = new SubstituteSuggestion();

		// when
		absenceManager.confirmTeacherAbsence(command);
		SubstituteSuggestion suggestion = substituteTeacherSuggester
			.suggestSubstitutesFor(absentTeacher);

		// then
		assertEquals(expectedSuggestion, suggestion);
		fail("Not yet implemented");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	/**
	 *
	 */
	private void populateSchoolTimetable()
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}

}
