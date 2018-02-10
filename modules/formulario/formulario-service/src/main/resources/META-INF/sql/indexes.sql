create index IX_9DCC9D90 on formulario_formulario (field1);
create index IX_9DCCA151 on formulario_formulario (field2);
create index IX_ED50519 on formulario_formulario (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C7DDFDDB on formulario_formulario (uuid_[$COLUMN_LENGTH:75$], groupId);