create table todo_Task (
	taskId LONG not null primary key,
	userId LONG,
	name VARCHAR(75) null,
	description STRING null,
	date_ DATE null,
	completed BOOLEAN,
	calendarBookingId LONG
);