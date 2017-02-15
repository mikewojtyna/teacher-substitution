/**
 *
 */
package com.slidetorial.teachersubstitution.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.slidetorial.teachersubstitution.domain.Absentee;
import com.slidetorial.teachersubstitution.domain.SubstituteSuggestion;

/**
 * @author goobar
 *
 */
public class SubstituteSuggesterTest
{

	private SubstituteSuggester substituteSuggester;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void should_SuggestBestSubstitute() throws Exception
	{
		// given
		addAvailableTeachers();
		Absentee absentee = new Absentee();
		SubstituteSuggestion expectedSuggestion = new SubstituteSuggestion();

		// when
		SubstituteSuggestion substituteSuggestion = substituteSuggester
			.suggestSubstituteForAbsentee(absentee);

		// then
		assertEquals(expectedSuggestion, substituteSuggestion);
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
	private void addAvailableTeachers()
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}

}
