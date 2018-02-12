create table prueba_prueba (
	uuid_ VARCHAR(75) null,
	pruebaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 INTEGER,
	field2 INTEGER
);