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

package com.jbaricot.formulario.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.jbaricot.formulario.service.http.formularioServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.jbaricot.formulario.service.http.formularioServiceSoap
 * @generated
 */
@ProviderType
public class formularioSoap implements Serializable {
	public static formularioSoap toSoapModel(formulario model) {
		formularioSoap soapModel = new formularioSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setFormularioId(model.getFormularioId());
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

	public static formularioSoap[] toSoapModels(formulario[] models) {
		formularioSoap[] soapModels = new formularioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static formularioSoap[][] toSoapModels(formulario[][] models) {
		formularioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new formularioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new formularioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static formularioSoap[] toSoapModels(List<formulario> models) {
		List<formularioSoap> soapModels = new ArrayList<formularioSoap>(models.size());

		for (formulario model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new formularioSoap[soapModels.size()]);
	}

	public formularioSoap() {
	}

	public long getPrimaryKey() {
		return _formularioId;
	}

	public void setPrimaryKey(long pk) {
		setFormularioId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFormularioId() {
		return _formularioId;
	}

	public void setFormularioId(long formularioId) {
		_formularioId = formularioId;
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
	private long _formularioId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _field1;
	private int _field2;
}