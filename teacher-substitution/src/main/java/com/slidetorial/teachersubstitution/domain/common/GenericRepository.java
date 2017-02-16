/**
 *
 */
package com.slidetorial.teachersubstitution.domain.common;

import com.slidetorial.teachersubstitution.domain.BaseEntity;

/**
 * @author goobar
 * @param <I>
 *                id type
 * @param <R>
 *                the aggregate root type
 *
 */
public interface GenericRepository<I, R extends BaseEntity<I>>
{
	/**
	 * Loads the aggregate root.
	 *
	 * @param id
	 *                id of the root
	 * @return the loaded root
	 * @throws NullPointerException
	 *                 if any argument is null
	 * @throws RepositoryException
	 *                 if fails
	 */
	R load(I id) throws NullPointerException, RepositoryException;

	/**
	 * Updates the aggregate.
	 *
	 * @param id
	 *                id
	 * @param updatedRoot
	 *                updated root
	 * @throws NullPointerException
	 *                 if any argument is null
	 * @throws RepositoryException
	 *                 if fails
	 */
	void update(I id, R updatedRoot)
		throws NullPointerException, RepositoryException;
}
