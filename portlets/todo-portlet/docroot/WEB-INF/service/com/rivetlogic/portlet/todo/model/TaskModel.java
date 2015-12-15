/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.portlet.todo.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Task service. Represents a row in the &quot;todo_Task&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rivetlogic.portlet.todo.model.impl.TaskModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rivetlogic.portlet.todo.model.impl.TaskImpl}.
 * </p>
 *
 * @author Christopher Jimenez
 * @see Task
 * @see com.rivetlogic.portlet.todo.model.impl.TaskImpl
 * @see com.rivetlogic.portlet.todo.model.impl.TaskModelImpl
 * @generated
 */
public interface TaskModel extends BaseModel<Task> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a task model instance should use the {@link Task} interface instead.
	 */

	/**
	 * Returns the primary key of this task.
	 *
	 * @return the primary key of this task
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this task.
	 *
	 * @param primaryKey the primary key of this task
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the task ID of this task.
	 *
	 * @return the task ID of this task
	 */
	public long getTaskId();

	/**
	 * Sets the task ID of this task.
	 *
	 * @param taskId the task ID of this task
	 */
	public void setTaskId(long taskId);

	/**
	 * Returns the user ID of this task.
	 *
	 * @return the user ID of this task
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this task.
	 *
	 * @param userId the user ID of this task
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this task.
	 *
	 * @return the user uuid of this task
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this task.
	 *
	 * @param userUuid the user uuid of this task
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the name of this task.
	 *
	 * @return the name of this task
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this task.
	 *
	 * @param name the name of this task
	 */
	public void setName(String name);

	/**
	 * Returns the description of this task.
	 *
	 * @return the description of this task
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this task.
	 *
	 * @param description the description of this task
	 */
	public void setDescription(String description);

	/**
	 * Returns the date of this task.
	 *
	 * @return the date of this task
	 */
	public Date getDate();

	/**
	 * Sets the date of this task.
	 *
	 * @param date the date of this task
	 */
	public void setDate(Date date);

	/**
	 * Returns the completed of this task.
	 *
	 * @return the completed of this task
	 */
	public Boolean getCompleted();

	/**
	 * Sets the completed of this task.
	 *
	 * @param completed the completed of this task
	 */
	public void setCompleted(Boolean completed);

	/**
	 * Returns the calendar booking ID of this task.
	 *
	 * @return the calendar booking ID of this task
	 */
	public long getCalendarBookingId();

	/**
	 * Sets the calendar booking ID of this task.
	 *
	 * @param calendarBookingId the calendar booking ID of this task
	 */
	public void setCalendarBookingId(long calendarBookingId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.rivetlogic.portlet.todo.model.Task task);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rivetlogic.portlet.todo.model.Task> toCacheModel();

	@Override
	public com.rivetlogic.portlet.todo.model.Task toEscapedModel();

	@Override
	public com.rivetlogic.portlet.todo.model.Task toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}