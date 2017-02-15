/**
 *
 */
package com.slidetorial.teachersubstitution.domain;

/**
 * Models the absent teacher.
 *
 * @author goobar
 *
 */
public class Absentee
{
	/**
	 * The reason why teacher is absent.
	 *
	 * @return the reason
	 */
	public AbsenceReason reason()
	{
		throw new UnsupportedOperationException("implement");
	}

	/**
	 * The absent teacher.
	 *
	 * @return the absent teacher
	 */
	public Teacher teacher()
	{
		throw new UnsupportedOperationException("implement");
	}

	/**
	 * How long teacher is absent.
	 *
	 * @return the absence time
	 */
	public AbsenceTime timeOfAbsence()
	{
		throw new UnsupportedOperationException("implement");
	}
}
