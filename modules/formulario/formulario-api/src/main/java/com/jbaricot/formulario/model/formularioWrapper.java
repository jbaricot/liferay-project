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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link formulario}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see formulario
 * @generated
 */
@ProviderType
public class formularioWrapper implements formulario, ModelWrapper<formulario> {
	public formularioWrapper(formulario formulario) {
		_formulario = formulario;
	}

	@Override
	public Class<?> getModelClass() {
		return formulario.class;
	}

	@Override
	public String getModelClassName() {
		return formulario.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("formularioId", getFormularioId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("field1", getField1());
		attributes.put("field2", getField2());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long formularioId = (Long)attributes.get("formularioId");

		if (formularioId != null) {
			setFormularioId(formularioId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer field1 = (Integer)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Integer field2 = (Integer)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _formulario.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _formulario.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _formulario.isNew();
	}

	@Override
	public com.jbaricot.formulario.model.formulario toEscapedModel() {
		return new formularioWrapper(_formulario.toEscapedModel());
	}

	@Override
	public com.jbaricot.formulario.model.formulario toUnescapedModel() {
		return new formularioWrapper(_formulario.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _formulario.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.jbaricot.formulario.model.formulario> toCacheModel() {
		return _formulario.toCacheModel();
	}

	@Override
	public int compareTo(com.jbaricot.formulario.model.formulario formulario) {
		return _formulario.compareTo(formulario);
	}

	/**
	* Returns the field1 of this formulario.
	*
	* @return the field1 of this formulario
	*/
	@Override
	public int getField1() {
		return _formulario.getField1();
	}

	/**
	* Returns the field2 of this formulario.
	*
	* @return the field2 of this formulario
	*/
	@Override
	public int getField2() {
		return _formulario.getField2();
	}

	@Override
	public int hashCode() {
		return _formulario.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _formulario.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new formularioWrapper((formulario)_formulario.clone());
	}

	/**
	* Returns the user name of this formulario.
	*
	* @return the user name of this formulario
	*/
	@Override
	public java.lang.String getUserName() {
		return _formulario.getUserName();
	}

	/**
	* Returns the user uuid of this formulario.
	*
	* @return the user uuid of this formulario
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _formulario.getUserUuid();
	}

	/**
	* Returns the uuid of this formulario.
	*
	* @return the uuid of this formulario
	*/
	@Override
	public java.lang.String getUuid() {
		return _formulario.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _formulario.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _formulario.toXmlString();
	}

	/**
	* Returns the create date of this formulario.
	*
	* @return the create date of this formulario
	*/
	@Override
	public Date getCreateDate() {
		return _formulario.getCreateDate();
	}

	/**
	* Returns the modified date of this formulario.
	*
	* @return the modified date of this formulario
	*/
	@Override
	public Date getModifiedDate() {
		return _formulario.getModifiedDate();
	}

	/**
	* Returns the company ID of this formulario.
	*
	* @return the company ID of this formulario
	*/
	@Override
	public long getCompanyId() {
		return _formulario.getCompanyId();
	}

	/**
	* Returns the formulario ID of this formulario.
	*
	* @return the formulario ID of this formulario
	*/
	@Override
	public long getFormularioId() {
		return _formulario.getFormularioId();
	}

	/**
	* Returns the group ID of this formulario.
	*
	* @return the group ID of this formulario
	*/
	@Override
	public long getGroupId() {
		return _formulario.getGroupId();
	}

	/**
	* Returns the primary key of this formulario.
	*
	* @return the primary key of this formulario
	*/
	@Override
	public long getPrimaryKey() {
		return _formulario.getPrimaryKey();
	}

	/**
	* Returns the user ID of this formulario.
	*
	* @return the user ID of this formulario
	*/
	@Override
	public long getUserId() {
		return _formulario.getUserId();
	}

	@Override
	public void persist() {
		_formulario.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_formulario.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this formulario.
	*
	* @param companyId the company ID of this formulario
	*/
	@Override
	public void setCompanyId(long companyId) {
		_formulario.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this formulario.
	*
	* @param createDate the create date of this formulario
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_formulario.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_formulario.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_formulario.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_formulario.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field1 of this formulario.
	*
	* @param field1 the field1 of this formulario
	*/
	@Override
	public void setField1(int field1) {
		_formulario.setField1(field1);
	}

	/**
	* Sets the field2 of this formulario.
	*
	* @param field2 the field2 of this formulario
	*/
	@Override
	public void setField2(int field2) {
		_formulario.setField2(field2);
	}

	/**
	* Sets the formulario ID of this formulario.
	*
	* @param formularioId the formulario ID of this formulario
	*/
	@Override
	public void setFormularioId(long formularioId) {
		_formulario.setFormularioId(formularioId);
	}

	/**
	* Sets the group ID of this formulario.
	*
	* @param groupId the group ID of this formulario
	*/
	@Override
	public void setGroupId(long groupId) {
		_formulario.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this formulario.
	*
	* @param modifiedDate the modified date of this formulario
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_formulario.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_formulario.setNew(n);
	}

	/**
	* Sets the primary key of this formulario.
	*
	* @param primaryKey the primary key of this formulario
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_formulario.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_formulario.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this formulario.
	*
	* @param userId the user ID of this formulario
	*/
	@Override
	public void setUserId(long userId) {
		_formulario.setUserId(userId);
	}

	/**
	* Sets the user name of this formulario.
	*
	* @param userName the user name of this formulario
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_formulario.setUserName(userName);
	}

	/**
	* Sets the user uuid of this formulario.
	*
	* @param userUuid the user uuid of this formulario
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_formulario.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this formulario.
	*
	* @param uuid the uuid of this formulario
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_formulario.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof formularioWrapper)) {
			return false;
		}

		formularioWrapper formularioWrapper = (formularioWrapper)obj;

		if (Objects.equals(_formulario, formularioWrapper._formulario)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _formulario.getStagedModelType();
	}

	@Override
	public formulario getWrappedModel() {
		return _formulario;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _formulario.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _formulario.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_formulario.resetOriginalValues();
	}

	private final formulario _formulario;
}