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

package com.liferay.suma.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.suma.model.prueba;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing prueba in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see prueba
 * @generated
 */
@ProviderType
public class pruebaCacheModel implements CacheModel<prueba>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof pruebaCacheModel)) {
			return false;
		}

		pruebaCacheModel pruebaCacheModel = (pruebaCacheModel)obj;

		if (pruebaId == pruebaCacheModel.pruebaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pruebaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", pruebaId=");
		sb.append(pruebaId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", field1=");
		sb.append(field1);
		sb.append(", field2=");
		sb.append(field2);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public prueba toEntityModel() {
		pruebaImpl pruebaImpl = new pruebaImpl();

		if (uuid == null) {
			pruebaImpl.setUuid(StringPool.BLANK);
		}
		else {
			pruebaImpl.setUuid(uuid);
		}

		pruebaImpl.setPruebaId(pruebaId);
		pruebaImpl.setGroupId(groupId);
		pruebaImpl.setCompanyId(companyId);
		pruebaImpl.setUserId(userId);

		if (userName == null) {
			pruebaImpl.setUserName(StringPool.BLANK);
		}
		else {
			pruebaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pruebaImpl.setCreateDate(null);
		}
		else {
			pruebaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pruebaImpl.setModifiedDate(null);
		}
		else {
			pruebaImpl.setModifiedDate(new Date(modifiedDate));
		}

		pruebaImpl.setField1(field1);
		pruebaImpl.setField2(field2);

		pruebaImpl.resetOriginalValues();

		return pruebaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		pruebaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		field1 = objectInput.readInt();

		field2 = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(pruebaId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(field1);

		objectOutput.writeInt(field2);
	}

	public String uuid;
	public long pruebaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int field1;
	public int field2;
}