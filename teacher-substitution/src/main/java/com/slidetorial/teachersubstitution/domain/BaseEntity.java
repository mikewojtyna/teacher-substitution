/**
 *
 */
package com.slidetorial.teachersubstitution.domain;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author goobar
 * @param <T>
 *                id type
 *
 */
public class BaseEntity<T>
{
	private final T id;

	/**
	 * @param id
	 *                id
	 * @throws NullPointerException
	 *                 if any argument is null
	 */
	public BaseEntity(T id) throws NullPointerException
	{
		validate(id);
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		BaseEntity<?> other = (BaseEntity<?>) obj;
		if (id == null)
		{
			if (other.id != null)
			{
				return false;
			}
		}
		else if (!id.equals(other.id))
		{
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * @return the id
	 */
	public T id()
	{
		return id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "BaseEntity [id=" + id + "]";
	}

	/**
	 * @param id
	 */
	private void validate(T id)
	{
		checkNotNull(id, "'id' cannot be null");
	}
}
