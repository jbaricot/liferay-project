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

package com.liferay.suma.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.suma.exception.NoSuchpruebaException;
import com.liferay.suma.model.prueba;

/**
 * The persistence interface for the prueba service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.suma.service.persistence.impl.pruebaPersistenceImpl
 * @see pruebaUtil
 * @generated
 */
@ProviderType
public interface pruebaPersistence extends BasePersistence<prueba> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link pruebaUtil} to access the prueba persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the pruebas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching pruebas
	*/
	public java.util.List<prueba> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the pruebas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @return the range of matching pruebas
	*/
	public java.util.List<prueba> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the pruebas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pruebas
	*/
	public java.util.List<prueba> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns an ordered range of all the pruebas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching pruebas
	*/
	public java.util.List<prueba> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first prueba in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public prueba findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Returns the first prueba in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public prueba fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns the last prueba in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public prueba findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Returns the last prueba in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public prueba fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns the pruebas before and after the current prueba in the ordered set where uuid = &#63;.
	*
	* @param pruebaId the primary key of the current prueba
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prueba
	* @throws NoSuchpruebaException if a prueba with the primary key could not be found
	*/
	public prueba[] findByUuid_PrevAndNext(long pruebaId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Removes all the pruebas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of pruebas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching pruebas
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the prueba where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchpruebaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public prueba findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchpruebaException;

	/**
	* Returns the prueba where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public prueba fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the prueba where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public prueba fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the prueba where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the prueba that was removed
	*/
	public prueba removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchpruebaException;

	/**
	* Returns the number of pruebas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching pruebas
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the pruebas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching pruebas
	*/
	public java.util.List<prueba> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the pruebas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @return the range of matching pruebas
	*/
	public java.util.List<prueba> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the pruebas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pruebas
	*/
	public java.util.List<prueba> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns an ordered range of all the pruebas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching pruebas
	*/
	public java.util.List<prueba> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first prueba in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public prueba findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Returns the first prueba in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public prueba fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns the last prueba in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public prueba findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Returns the last prueba in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public prueba fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns the pruebas before and after the current prueba in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param pruebaId the primary key of the current prueba
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prueba
	* @throws NoSuchpruebaException if a prueba with the primary key could not be found
	*/
	public prueba[] findByUuid_C_PrevAndNext(long pruebaId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Removes all the pruebas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of pruebas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching pruebas
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the pruebas where field1 = &#63;.
	*
	* @param field1 the field1
	* @return the matching pruebas
	*/
	public java.util.List<prueba> findByField1(int field1);

	/**
	* Returns a range of all the pruebas where field1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field1 the field1
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @return the range of matching pruebas
	*/
	public java.util.List<prueba> findByField1(int field1, int start, int end);

	/**
	* Returns an ordered range of all the pruebas where field1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field1 the field1
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pruebas
	*/
	public java.util.List<prueba> findByField1(int field1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns an ordered range of all the pruebas where field1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field1 the field1
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching pruebas
	*/
	public java.util.List<prueba> findByField1(int field1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first prueba in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public prueba findByField1_First(int field1,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Returns the first prueba in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public prueba fetchByField1_First(int field1,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns the last prueba in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public prueba findByField1_Last(int field1,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Returns the last prueba in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public prueba fetchByField1_Last(int field1,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns the pruebas before and after the current prueba in the ordered set where field1 = &#63;.
	*
	* @param pruebaId the primary key of the current prueba
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prueba
	* @throws NoSuchpruebaException if a prueba with the primary key could not be found
	*/
	public prueba[] findByField1_PrevAndNext(long pruebaId, int field1,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Removes all the pruebas where field1 = &#63; from the database.
	*
	* @param field1 the field1
	*/
	public void removeByField1(int field1);

	/**
	* Returns the number of pruebas where field1 = &#63;.
	*
	* @param field1 the field1
	* @return the number of matching pruebas
	*/
	public int countByField1(int field1);

	/**
	* Returns all the pruebas where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching pruebas
	*/
	public java.util.List<prueba> findByField2(int field2);

	/**
	* Returns a range of all the pruebas where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @return the range of matching pruebas
	*/
	public java.util.List<prueba> findByField2(int field2, int start, int end);

	/**
	* Returns an ordered range of all the pruebas where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pruebas
	*/
	public java.util.List<prueba> findByField2(int field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns an ordered range of all the pruebas where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching pruebas
	*/
	public java.util.List<prueba> findByField2(int field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first prueba in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public prueba findByField2_First(int field2,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Returns the first prueba in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public prueba fetchByField2_First(int field2,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns the last prueba in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public prueba findByField2_Last(int field2,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Returns the last prueba in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public prueba fetchByField2_Last(int field2,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns the pruebas before and after the current prueba in the ordered set where field2 = &#63;.
	*
	* @param pruebaId the primary key of the current prueba
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prueba
	* @throws NoSuchpruebaException if a prueba with the primary key could not be found
	*/
	public prueba[] findByField2_PrevAndNext(long pruebaId, int field2,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException;

	/**
	* Removes all the pruebas where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public void removeByField2(int field2);

	/**
	* Returns the number of pruebas where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching pruebas
	*/
	public int countByField2(int field2);

	/**
	* Caches the prueba in the entity cache if it is enabled.
	*
	* @param prueba the prueba
	*/
	public void cacheResult(prueba prueba);

	/**
	* Caches the pruebas in the entity cache if it is enabled.
	*
	* @param pruebas the pruebas
	*/
	public void cacheResult(java.util.List<prueba> pruebas);

	/**
	* Creates a new prueba with the primary key. Does not add the prueba to the database.
	*
	* @param pruebaId the primary key for the new prueba
	* @return the new prueba
	*/
	public prueba create(long pruebaId);

	/**
	* Removes the prueba with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pruebaId the primary key of the prueba
	* @return the prueba that was removed
	* @throws NoSuchpruebaException if a prueba with the primary key could not be found
	*/
	public prueba remove(long pruebaId) throws NoSuchpruebaException;

	public prueba updateImpl(prueba prueba);

	/**
	* Returns the prueba with the primary key or throws a {@link NoSuchpruebaException} if it could not be found.
	*
	* @param pruebaId the primary key of the prueba
	* @return the prueba
	* @throws NoSuchpruebaException if a prueba with the primary key could not be found
	*/
	public prueba findByPrimaryKey(long pruebaId) throws NoSuchpruebaException;

	/**
	* Returns the prueba with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pruebaId the primary key of the prueba
	* @return the prueba, or <code>null</code> if a prueba with the primary key could not be found
	*/
	public prueba fetchByPrimaryKey(long pruebaId);

	@Override
	public java.util.Map<java.io.Serializable, prueba> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the pruebas.
	*
	* @return the pruebas
	*/
	public java.util.List<prueba> findAll();

	/**
	* Returns a range of all the pruebas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @return the range of pruebas
	*/
	public java.util.List<prueba> findAll(int start, int end);

	/**
	* Returns an ordered range of all the pruebas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of pruebas
	*/
	public java.util.List<prueba> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator);

	/**
	* Returns an ordered range of all the pruebas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pruebaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pruebas
	* @param end the upper bound of the range of pruebas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of pruebas
	*/
	public java.util.List<prueba> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prueba> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the pruebas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of pruebas.
	*
	* @return the number of pruebas
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}