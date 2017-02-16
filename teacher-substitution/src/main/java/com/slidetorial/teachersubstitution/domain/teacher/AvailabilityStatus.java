/**
 *
 */
package com.slidetorial.teachersubstitution.domain.teacher;

/**
 * @author goobar
 *
 */
public enum AvailabilityStatus
{
	/**
	 * Teacher is absent.
	 */
	ABSENT,
	/**
	 * Teacher is available.
	 */
	AVAILABLE,
	/**
	 * Teacher is occupied (e.g. running a lesson currently).
	 */
	OCCUPIED
}
