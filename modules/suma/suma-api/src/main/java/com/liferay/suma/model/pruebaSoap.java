/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.suma.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.suma.service.http.pruebaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.suma.service.http.pruebaServiceSoap
 * @generated
 */
@ProviderType
public class pruebaSoap implements Serializable {
	public static pruebaSoap toSoapModel(prueba model) {
		pruebaSoap soapModel = new pruebaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPruebaId(model.getPruebaId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setField1(model.getField1());
		soapModel.setField2(model.getField2());

		return soapModel;
	}

	public static pruebaSoap[] toSoapModels(prueba[] models) {
		pruebaSoap[] soapModels = new pruebaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static pruebaSoap[][] toSoapModels(prueba[][] models) {
		pruebaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new pruebaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new pruebaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static pruebaSoap[] toSoapModels(List<prueba> models) {
		List<pruebaSoap> soapModels = new ArrayList<pruebaSoap>(models.size());

		for (prueba model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new pruebaSoap[soapModels.size()]);
	}

	public pruebaSoap() {
	}

	public long getPrimaryKey() {
		return _pruebaId;
	}

	public void setPrimaryKey(long pk) {
		setPruebaId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPruebaId() {
		return _pruebaId;
	}

	public void setPruebaId(long pruebaId) {
		_pruebaId = pruebaId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getField1() {
		return _field1;
	}

	public void setField1(int field1) {
		_field1 = field1;
	}

	public int getField2() {
		return _field2;
	}

	public void setField2(int field2) {
		_field2 = field2;
	}

	private String _uuid;
	private long _pruebaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _field1;
	private int _field2;
}