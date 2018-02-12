create index IX_8848CB30 on prueba_prueba (field1);
create index IX_8848CEF1 on prueba_prueba (field2);
create index IX_50ACAAB9 on prueba_prueba (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_28A28B7B on prueba_prueba (uuid_[$COLUMN_LENGTH:75$], groupId);