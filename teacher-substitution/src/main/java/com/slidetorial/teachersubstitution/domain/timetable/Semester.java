/**
 *
 */
package com.slidetorial.teachersubstitution.domain.timetable;

import java.util.Collection;
import com.slidetorial.teachersubstitution.domain.BaseEntity;

/**
 * Models a single semester. A semester has its own identity and can be mutated,
 * therefore it's an entity. However, semester is not a root entity - just a
 * part of {@link SchoolTimetable} aggregate with its own lifecycle.
 *
 * @author goobar
 *
 */
// TODO: Explore some more rules. Currently this class is a bit artificial
// being, as we don't fully utilize it. Its main goal is to show an example of
// aggregate root with other entities. It's very possible we might change this
// class to simple value object in the future. In fact, most aggregates consists
// of single (root) entity and value objects, so that's a natural case.
public class Semester extends BaseEntity<SemesterId>
{

	/**
	 * @param id
	 *                id
	 * @throws NullPointerException
	 *                 if any argument is null
	 */
	public Semester(SemesterId id) throws NullPointerException
	{
		super(id);
	}

	/**
	 * A very naive solution - just for example.
	 * 
	 * @return all lessons in this semester
	 */
	public Collection<Lesson> getAllLessons()
	{
		throw new UnsupportedOperationException("Not implemented");
	}

}
