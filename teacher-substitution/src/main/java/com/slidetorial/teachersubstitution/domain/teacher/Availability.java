/**
 *
 */
package com.slidetorial.teachersubstitution.domain.teacher;

import java.util.Optional;

/**
 * Teacher availability at the given moment.
 *
 * @author goobar
 *
 */
public class Availability
{
	private Optional<AbsenceReason> absenceReason;

	private AvailabilityStatus status;

	/**
	 * @param absenceReason
	 *                optional absence reason
	 * @param status
	 *                availability status
	 */
	public Availability(Optional<AbsenceReason> absenceReason,
		AvailabilityStatus status)
	{
		this.absenceReason = absenceReason;
		this.status = status;
	}

	/**
	 * @return the absenceReason
	 */
	public Optional<AbsenceReason> getAbsenceReason()
	{
		return absenceReason;
	}

	/**
	 * @return the status
	 */
	public AvailabilityStatus getStatus()
	{
		return status;
	}

	/**
	 * @param absenceReason
	 *                the absenceReason to set
	 */
	public void setAbsenceReason(Optional<AbsenceReason> absenceReason)
	{
		this.absenceReason = absenceReason;
	}

	/**
	 * @param status
	 *                the status to set
	 */
	public void setStatus(AvailabilityStatus status)
	{
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Availability [absenceReason=" + absenceReason
			+ ", status=" + status + "]";
	}
}
