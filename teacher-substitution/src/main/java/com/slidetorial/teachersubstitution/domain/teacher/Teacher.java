/**
 *
 */
package com.slidetorial.teachersubstitution.domain.teacher;

import java.time.LocalDate;
import com.slidetorial.teachersubstitution.domain.BaseEntity;
import com.slidetorial.teachersubstitution.domain.common.Subject;
import com.slidetorial.teachersubstitution.domain.timetable.Lesson;

/**
 * Models a teacher aggregate root entity.
 *
 * @author goobar
 *
 */
public class Teacher extends BaseEntity<PersonalIdentificationNumber>
{
	private AvailabilityMode availability;

	private PersonalIdentificationNumber id;

	private PersonalDetails personalDetails;

	private Qualifications qualifications;

	/**
	 * @param pin
	 *                personal identification number id
	 * @throws NullPointerException
	 *                 if any argument is null
	 */
	// TODO: add at least constructor to recreate root from db
	public Teacher(PersonalIdentificationNumber pin)
		throws NullPointerException
	{
		super(pin);
	}

	/**
	 * @param lesson
	 *                a lesson
	 * @return the availability of this teacher for given lesson
	 */
	public Availability availabilityForLesson(Lesson lesson)
	{
		return availability.availabilityForLesson(lesson);
	}

	/**
	 * Confirms the absence of this teacher. When teacher is absent, he must
	 * be substituted by other available teachers. Every lesson this teacher
	 * runs must have another teacher assigned. Absent teacher cannot be
	 * considered substitute for any other teacher.
	 *
	 * @param reason
	 *                the reason why this teacher is absent
	 * @param time
	 *                how long this teacher is absent
	 */
	public void confirmAbsence(AbsenceReason reason, AbsenceTime time)
	{
		availability = AvailabilityMode.availableEveryDayExceptOf(
			AvailabilityStatus.ABSENT, reason,
			time.getDays().toArray(new LocalDate[0]));
		// TODO: think about sending events from here - we could send an
		// event using popular EventPublisher pattern, however, I don't
		// really like it - too much infrastructure into domain. The
		// event will be therefore generated and send in the application
		// layer - at least for now.
		throw new UnsupportedOperationException("implement");
	}

	/**
	 * @return the id
	 */
	@Override
	public PersonalIdentificationNumber id()
	{
		return id;
	}

	/**
	 * @param subject
	 *                a school subject
	 * @return true if this teacher is qualified for the given subject,
	 *         false otherwise
	 */
	public boolean isQualifiedForSubject(Subject subject)
	{
		return qualifications.include(subject);
	}

	/**
	 * @return the personalDetails
	 */
	public PersonalDetails personalDetails()
	{
		return personalDetails;
	}

	/**
	 * Checks if this teacher is the right substitute for the specific
	 * lesson. To ensure maximum modularization, this method uses a
	 * {@link SubstitutionAlgorithmPolicy} to evaluate the final score.
	 *
	 *
	 * @param lesson
	 *                the lesson
	 * @param policy
	 *                the policy used to evaluate score of this teacher
	 * @return the score
	 * @throws NullPointerException
	 *                 if any argument is null
	 *
	 */
	public SubstituteScore substituteScore(Lesson lesson,
		SubstitutionAlgorithmPolicy policy) throws NullPointerException

	{
		// TODO: use the policy to return score
		throw new UnsupportedOperationException("implement");
	}

}
