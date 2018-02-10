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

package com.jbaricot.formulario.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.jbaricot.formulario.model.formulario;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing formulario in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see formulario
 * @generated
 */
@ProviderType
public class formularioCacheModel implements CacheModel<formulario>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof formularioCacheModel)) {
			return false;
		}

		formularioCacheModel formularioCacheModel = (formularioCacheModel)obj;

		if (formularioId == formularioCacheModel.formularioId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, formularioId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", formularioId=");
		sb.append(formularioId);
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
	public formulario toEntityModel() {
		formularioImpl formularioImpl = new formularioImpl();

		if (uuid == null) {
			formularioImpl.setUuid(StringPool.BLANK);
		}
		else {
			formularioImpl.setUuid(uuid);
		}

		formularioImpl.setFormularioId(formularioId);
		formularioImpl.setGroupId(groupId);
		formularioImpl.setCompanyId(companyId);
		formularioImpl.setUserId(userId);

		if (userName == null) {
			formularioImpl.setUserName(StringPool.BLANK);
		}
		else {
			formularioImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			formularioImpl.setCreateDate(null);
		}
		else {
			formularioImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			formularioImpl.setModifiedDate(null);
		}
		else {
			formularioImpl.setModifiedDate(new Date(modifiedDate));
		}

		formularioImpl.setField1(field1);
		formularioImpl.setField2(field2);

		formularioImpl.resetOriginalValues();

		return formularioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		formularioId = objectInput.readLong();

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

		objectOutput.writeLong(formularioId);

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
	public long formularioId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int field1;
	public int field2;
}