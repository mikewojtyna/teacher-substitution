/**
 *
 */
package com.slidetorial.teachersubstitution.anemic;

import java.util.List;

/**
 * @author goobar
 *
 */
@SuppressWarnings("javadoc")
public class AbsentManagerAnemicService
{
	private TeacherRepositoryAnemic repository;

	public void confirmAbsence(String teacherId)
	{
		TeacherAnemic teacher = repository.findById(teacherId);
		teacher.setAbsent(true);
		List<LessonAnemic> allLesssons = findAllLesssons();
		allLesssons.forEach(lesson -> {
			if (teacher.equals(lesson.getTeacher()))
			{
				lesson.setTeacher(null);
				lesson.setCancelled(true);
			}
		});
	}

	/**
	 * @return
	 */
	private List<LessonAnemic> findAllLesssons()
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
