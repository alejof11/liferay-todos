<%--
/**
 * Copyright (C) 2005-2014 Rivet Logic Corporation.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; version 3 of the License.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
--%>

<%@page import="com.liferay.calendar.util.comparator.CalendarNameComparator"%>
<%@page import="com.liferay.calendar.service.CalendarServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.List" %>
<%@page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@page import="com.rivetlogic.portlet.todo.bean.TasksBean" %>

<%
Calendar defaultValueDate = CalendarFactoryUtil.getCalendar();
defaultValueDate.setTime(new Date());

List<com.liferay.calendar.model.Calendar> manageableCalendars = CalendarServiceUtil.search(
		themeDisplay.getCompanyId(), null, null, null, true,
		QueryUtil.ALL_POS, QueryUtil.ALL_POS,
		new CalendarNameComparator(true),
		TasksBean.ACTION_KEY_MANAGE_BOOKINGS);
%>

<script id="<portlet:namespace/>add-task-template" type="text/x-html-template">
<div class="add">
    <form>

    <div class="control-group">
        <label class="control-label" for="title"><liferay-ui:message key="edit-task-title" /></label>
        <div class="controls">
            <input name="title" type="text" class="add-title field-required"></input>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="description"><liferay-ui:message key="edit-task-description" /></label>
        <div class="controls">
            <textarea name="description" class="add-description" placeholder="<liferay-ui:message key="edit-task-description-placeholder" />"></textarea>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="time"><liferay-ui:message key="edit-task-date" /></label>
        <div class="lfr-input-date controls">
            <input name="time" type="{dateFieldType}" class="edit-time"></input>
        </div>
    </div>

	<div class="control-group">
		<label class="add-to-calendar"><input type="checkbox" class="chk-calendar" /> <liferay-ui:message key="edit-task-add-to-calendar" /></label>
        <div class="controls">            
			<select class="select-calendar">
				<%
				for (com.liferay.calendar.model.Calendar curCalendar : manageableCalendars) {
				%>
					<option value="<%= curCalendar.getCalendarId() %>"><%= HtmlUtil.escape(curCalendar.getName(locale)) %></option>
	
				<%
				}
				%>
	
			</select>			
        </div>
	</div>

	<div class="control-group reminders reminders-hidden">
		<label><liferay-ui:message key="edit-task-reminders" /></label>
		<div class="reminder">
			<label class="add-reminder"><input type="checkbox" class="chk-reminder" /> <liferay-ui:message key="edit-task-reminder-type"/></label> 
			<input class="reminder-value first-reminder-value" type="text"/>
			<select class="reminder-duration first-reminder-duration">
				<option value="60000"><liferay-ui:message key="edit-task-reminder-select-first-label"/></option>
				<option value="3600000"><liferay-ui:message key="edit-task-reminder-select-second-label"/></option>
				<option value="86400000"><liferay-ui:message key="edit-task-reminder-select-third-label"/></option>
				<option value="604800000"><liferay-ui:message key="edit-task-reminder-select-fourth-label"/></option>
			</select>	
		</div>
		
		<div class="reminder">
			<label class="add-reminder"><input type="checkbox" class="chk-reminder" /> <liferay-ui:message key="edit-task-reminder-type"/></label> 
			<input class="reminder-value second-reminder-value" type="text"/>
			<select class="reminder-duration second-reminder-duration">
				<option value="60000"><liferay-ui:message key="edit-task-reminder-select-first-label"/></option>
				<option value="3600000"><liferay-ui:message key="edit-task-reminder-select-second-label"/></option>
				<option value="86400000"><liferay-ui:message key="edit-task-reminder-select-third-label"/></option>
				<option value="604800000"><liferay-ui:message key="edit-task-reminder-select-fourth-label"/></option>
			</select>	
		</div>
	</div>	
       
        <button class="btn add-submit"><liferay-ui:message key="edit-task-submit" /></button>
        <button class="btn add-cancel"><liferay-ui:message key="edit-task-cancel" /></button>
        <div class="todo-portlet-loader"></div>
    </form>
</div>
</script>