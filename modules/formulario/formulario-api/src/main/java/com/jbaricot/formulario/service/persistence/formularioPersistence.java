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

package com.jbaricot.formulario.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.jbaricot.formulario.exception.NoSuchformularioException;
import com.jbaricot.formulario.model.formulario;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the formulario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.jbaricot.formulario.service.persistence.impl.formularioPersistenceImpl
 * @see formularioUtil
 * @generated
 */
@ProviderType
public interface formularioPersistence extends BasePersistence<formulario> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link formularioUtil} to access the formulario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the formularios where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching formularios
	*/
	public java.util.List<formulario> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the formularios where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @return the range of matching formularios
	*/
	public java.util.List<formulario> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the formularios where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching formularios
	*/
	public java.util.List<formulario> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns an ordered range of all the formularios where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching formularios
	*/
	public java.util.List<formulario> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first formulario in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public formulario findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Returns the first formulario in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public formulario fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns the last formulario in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public formulario findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Returns the last formulario in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public formulario fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns the formularios before and after the current formulario in the ordered set where uuid = &#63;.
	*
	* @param formularioId the primary key of the current formulario
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next formulario
	* @throws NoSuchformularioException if a formulario with the primary key could not be found
	*/
	public formulario[] findByUuid_PrevAndNext(long formularioId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Removes all the formularios where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of formularios where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching formularios
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the formulario where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchformularioException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public formulario findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchformularioException;

	/**
	* Returns the formulario where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public formulario fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the formulario where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public formulario fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the formulario where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the formulario that was removed
	*/
	public formulario removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchformularioException;

	/**
	* Returns the number of formularios where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching formularios
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the formularios where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching formularios
	*/
	public java.util.List<formulario> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the formularios where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @return the range of matching formularios
	*/
	public java.util.List<formulario> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the formularios where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching formularios
	*/
	public java.util.List<formulario> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns an ordered range of all the formularios where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching formularios
	*/
	public java.util.List<formulario> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first formulario in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public formulario findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Returns the first formulario in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public formulario fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns the last formulario in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public formulario findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Returns the last formulario in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public formulario fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns the formularios before and after the current formulario in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param formularioId the primary key of the current formulario
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next formulario
	* @throws NoSuchformularioException if a formulario with the primary key could not be found
	*/
	public formulario[] findByUuid_C_PrevAndNext(long formularioId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Removes all the formularios where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of formularios where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching formularios
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the formularios where field1 = &#63;.
	*
	* @param field1 the field1
	* @return the matching formularios
	*/
	public java.util.List<formulario> findByField1(int field1);

	/**
	* Returns a range of all the formularios where field1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field1 the field1
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @return the range of matching formularios
	*/
	public java.util.List<formulario> findByField1(int field1, int start,
		int end);

	/**
	* Returns an ordered range of all the formularios where field1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field1 the field1
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching formularios
	*/
	public java.util.List<formulario> findByField1(int field1, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns an ordered range of all the formularios where field1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field1 the field1
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching formularios
	*/
	public java.util.List<formulario> findByField1(int field1, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first formulario in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public formulario findByField1_First(int field1,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Returns the first formulario in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public formulario fetchByField1_First(int field1,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns the last formulario in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public formulario findByField1_Last(int field1,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Returns the last formulario in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public formulario fetchByField1_Last(int field1,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns the formularios before and after the current formulario in the ordered set where field1 = &#63;.
	*
	* @param formularioId the primary key of the current formulario
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next formulario
	* @throws NoSuchformularioException if a formulario with the primary key could not be found
	*/
	public formulario[] findByField1_PrevAndNext(long formularioId, int field1,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Removes all the formularios where field1 = &#63; from the database.
	*
	* @param field1 the field1
	*/
	public void removeByField1(int field1);

	/**
	* Returns the number of formularios where field1 = &#63;.
	*
	* @param field1 the field1
	* @return the number of matching formularios
	*/
	public int countByField1(int field1);

	/**
	* Returns all the formularios where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching formularios
	*/
	public java.util.List<formulario> findByField2(int field2);

	/**
	* Returns a range of all the formularios where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @return the range of matching formularios
	*/
	public java.util.List<formulario> findByField2(int field2, int start,
		int end);

	/**
	* Returns an ordered range of all the formularios where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching formularios
	*/
	public java.util.List<formulario> findByField2(int field2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns an ordered range of all the formularios where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching formularios
	*/
	public java.util.List<formulario> findByField2(int field2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first formulario in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public formulario findByField2_First(int field2,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Returns the first formulario in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public formulario fetchByField2_First(int field2,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns the last formulario in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public formulario findByField2_Last(int field2,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Returns the last formulario in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public formulario fetchByField2_Last(int field2,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns the formularios before and after the current formulario in the ordered set where field2 = &#63;.
	*
	* @param formularioId the primary key of the current formulario
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next formulario
	* @throws NoSuchformularioException if a formulario with the primary key could not be found
	*/
	public formulario[] findByField2_PrevAndNext(long formularioId, int field2,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator)
		throws NoSuchformularioException;

	/**
	* Removes all the formularios where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public void removeByField2(int field2);

	/**
	* Returns the number of formularios where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching formularios
	*/
	public int countByField2(int field2);

	/**
	* Caches the formulario in the entity cache if it is enabled.
	*
	* @param formulario the formulario
	*/
	public void cacheResult(formulario formulario);

	/**
	* Caches the formularios in the entity cache if it is enabled.
	*
	* @param formularios the formularios
	*/
	public void cacheResult(java.util.List<formulario> formularios);

	/**
	* Creates a new formulario with the primary key. Does not add the formulario to the database.
	*
	* @param formularioId the primary key for the new formulario
	* @return the new formulario
	*/
	public formulario create(long formularioId);

	/**
	* Removes the formulario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param formularioId the primary key of the formulario
	* @return the formulario that was removed
	* @throws NoSuchformularioException if a formulario with the primary key could not be found
	*/
	public formulario remove(long formularioId)
		throws NoSuchformularioException;

	public formulario updateImpl(formulario formulario);

	/**
	* Returns the formulario with the primary key or throws a {@link NoSuchformularioException} if it could not be found.
	*
	* @param formularioId the primary key of the formulario
	* @return the formulario
	* @throws NoSuchformularioException if a formulario with the primary key could not be found
	*/
	public formulario findByPrimaryKey(long formularioId)
		throws NoSuchformularioException;

	/**
	* Returns the formulario with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param formularioId the primary key of the formulario
	* @return the formulario, or <code>null</code> if a formulario with the primary key could not be found
	*/
	public formulario fetchByPrimaryKey(long formularioId);

	@Override
	public java.util.Map<java.io.Serializable, formulario> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the formularios.
	*
	* @return the formularios
	*/
	public java.util.List<formulario> findAll();

	/**
	* Returns a range of all the formularios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @return the range of formularios
	*/
	public java.util.List<formulario> findAll(int start, int end);

	/**
	* Returns an ordered range of all the formularios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of formularios
	*/
	public java.util.List<formulario> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator);

	/**
	* Returns an ordered range of all the formularios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of formularios
	*/
	public java.util.List<formulario> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<formulario> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the formularios from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of formularios.
	*
	* @return the number of formularios
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}