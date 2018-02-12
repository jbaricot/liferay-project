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
 * This class is a wrapper for {@link prueba}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prueba
 * @generated
 */
@ProviderType
public class pruebaWrapper implements prueba, ModelWrapper<prueba> {
	public pruebaWrapper(prueba prueba) {
		_prueba = prueba;
	}

	@Override
	public Class<?> getModelClass() {
		return prueba.class;
	}

	@Override
	public String getModelClassName() {
		return prueba.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("pruebaId", getPruebaId());
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

		Long pruebaId = (Long)attributes.get("pruebaId");

		if (pruebaId != null) {
			setPruebaId(pruebaId);
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
		return _prueba.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _prueba.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _prueba.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _prueba.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.liferay.suma.model.prueba> toCacheModel() {
		return _prueba.toCacheModel();
	}

	@Override
	public com.liferay.suma.model.prueba toEscapedModel() {
		return new pruebaWrapper(_prueba.toEscapedModel());
	}

	@Override
	public com.liferay.suma.model.prueba toUnescapedModel() {
		return new pruebaWrapper(_prueba.toUnescapedModel());
	}

	@Override
	public int compareTo(com.liferay.suma.model.prueba prueba) {
		return _prueba.compareTo(prueba);
	}

	/**
	* Returns the field1 of this prueba.
	*
	* @return the field1 of this prueba
	*/
	@Override
	public int getField1() {
		return _prueba.getField1();
	}

	/**
	* Returns the field2 of this prueba.
	*
	* @return the field2 of this prueba
	*/
	@Override
	public int getField2() {
		return _prueba.getField2();
	}

	@Override
	public int hashCode() {
		return _prueba.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _prueba.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new pruebaWrapper((prueba)_prueba.clone());
	}

	/**
	* Returns the user name of this prueba.
	*
	* @return the user name of this prueba
	*/
	@Override
	public java.lang.String getUserName() {
		return _prueba.getUserName();
	}

	/**
	* Returns the user uuid of this prueba.
	*
	* @return the user uuid of this prueba
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _prueba.getUserUuid();
	}

	/**
	* Returns the uuid of this prueba.
	*
	* @return the uuid of this prueba
	*/
	@Override
	public java.lang.String getUuid() {
		return _prueba.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _prueba.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _prueba.toXmlString();
	}

	/**
	* Returns the create date of this prueba.
	*
	* @return the create date of this prueba
	*/
	@Override
	public Date getCreateDate() {
		return _prueba.getCreateDate();
	}

	/**
	* Returns the modified date of this prueba.
	*
	* @return the modified date of this prueba
	*/
	@Override
	public Date getModifiedDate() {
		return _prueba.getModifiedDate();
	}

	/**
	* Returns the company ID of this prueba.
	*
	* @return the company ID of this prueba
	*/
	@Override
	public long getCompanyId() {
		return _prueba.getCompanyId();
	}

	/**
	* Returns the group ID of this prueba.
	*
	* @return the group ID of this prueba
	*/
	@Override
	public long getGroupId() {
		return _prueba.getGroupId();
	}

	/**
	* Returns the primary key of this prueba.
	*
	* @return the primary key of this prueba
	*/
	@Override
	public long getPrimaryKey() {
		return _prueba.getPrimaryKey();
	}

	/**
	* Returns the prueba ID of this prueba.
	*
	* @return the prueba ID of this prueba
	*/
	@Override
	public long getPruebaId() {
		return _prueba.getPruebaId();
	}

	/**
	* Returns the user ID of this prueba.
	*
	* @return the user ID of this prueba
	*/
	@Override
	public long getUserId() {
		return _prueba.getUserId();
	}

	@Override
	public void persist() {
		_prueba.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_prueba.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this prueba.
	*
	* @param companyId the company ID of this prueba
	*/
	@Override
	public void setCompanyId(long companyId) {
		_prueba.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this prueba.
	*
	* @param createDate the create date of this prueba
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_prueba.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_prueba.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_prueba.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_prueba.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field1 of this prueba.
	*
	* @param field1 the field1 of this prueba
	*/
	@Override
	public void setField1(int field1) {
		_prueba.setField1(field1);
	}

	/**
	* Sets the field2 of this prueba.
	*
	* @param field2 the field2 of this prueba
	*/
	@Override
	public void setField2(int field2) {
		_prueba.setField2(field2);
	}

	/**
	* Sets the group ID of this prueba.
	*
	* @param groupId the group ID of this prueba
	*/
	@Override
	public void setGroupId(long groupId) {
		_prueba.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this prueba.
	*
	* @param modifiedDate the modified date of this prueba
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_prueba.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_prueba.setNew(n);
	}

	/**
	* Sets the primary key of this prueba.
	*
	* @param primaryKey the primary key of this prueba
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_prueba.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_prueba.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the prueba ID of this prueba.
	*
	* @param pruebaId the prueba ID of this prueba
	*/
	@Override
	public void setPruebaId(long pruebaId) {
		_prueba.setPruebaId(pruebaId);
	}

	/**
	* Sets the user ID of this prueba.
	*
	* @param userId the user ID of this prueba
	*/
	@Override
	public void setUserId(long userId) {
		_prueba.setUserId(userId);
	}

	/**
	* Sets the user name of this prueba.
	*
	* @param userName the user name of this prueba
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_prueba.setUserName(userName);
	}

	/**
	* Sets the user uuid of this prueba.
	*
	* @param userUuid the user uuid of this prueba
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_prueba.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this prueba.
	*
	* @param uuid the uuid of this prueba
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_prueba.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof pruebaWrapper)) {
			return false;
		}

		pruebaWrapper pruebaWrapper = (pruebaWrapper)obj;

		if (Objects.equals(_prueba, pruebaWrapper._prueba)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _prueba.getStagedModelType();
	}

	@Override
	public prueba getWrappedModel() {
		return _prueba;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _prueba.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _prueba.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_prueba.resetOriginalValues();
	}

	private final prueba _prueba;
}