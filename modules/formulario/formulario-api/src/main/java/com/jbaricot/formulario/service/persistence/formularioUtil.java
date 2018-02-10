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

import com.jbaricot.formulario.model.formulario;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the formulario service. This utility wraps {@link com.jbaricot.formulario.service.persistence.impl.formularioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see formularioPersistence
 * @see com.jbaricot.formulario.service.persistence.impl.formularioPersistenceImpl
 * @generated
 */
@ProviderType
public class formularioUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(formulario formulario) {
		getPersistence().clearCache(formulario);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<formulario> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<formulario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<formulario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<formulario> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static formulario update(formulario formulario) {
		return getPersistence().update(formulario);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static formulario update(formulario formulario,
		ServiceContext serviceContext) {
		return getPersistence().update(formulario, serviceContext);
	}

	/**
	* Returns all the formularios where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching formularios
	*/
	public static List<formulario> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<formulario> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<formulario> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<formulario> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<formulario> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<formulario> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first formulario in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public static formulario findByUuid_First(java.lang.String uuid,
		OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first formulario in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public static formulario fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<formulario> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last formulario in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public static formulario findByUuid_Last(java.lang.String uuid,
		OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last formulario in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public static formulario fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<formulario> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the formularios before and after the current formulario in the ordered set where uuid = &#63;.
	*
	* @param formularioId the primary key of the current formulario
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next formulario
	* @throws NoSuchformularioException if a formulario with the primary key could not be found
	*/
	public static formulario[] findByUuid_PrevAndNext(long formularioId,
		java.lang.String uuid, OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence()
				   .findByUuid_PrevAndNext(formularioId, uuid, orderByComparator);
	}

	/**
	* Removes all the formularios where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of formularios where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching formularios
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the formulario where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchformularioException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public static formulario findByUUID_G(java.lang.String uuid, long groupId)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the formulario where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public static formulario fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the formulario where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public static formulario fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the formulario where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the formulario that was removed
	*/
	public static formulario removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of formularios where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching formularios
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the formularios where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching formularios
	*/
	public static List<formulario> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<formulario> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<formulario> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<formulario> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<formulario> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<formulario> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first formulario in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public static formulario findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first formulario in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public static formulario fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<formulario> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last formulario in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public static formulario findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last formulario in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public static formulario fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<formulario> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static formulario[] findByUuid_C_PrevAndNext(long formularioId,
		java.lang.String uuid, long companyId,
		OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(formularioId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the formularios where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of formularios where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching formularios
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the formularios where field1 = &#63;.
	*
	* @param field1 the field1
	* @return the matching formularios
	*/
	public static List<formulario> findByField1(int field1) {
		return getPersistence().findByField1(field1);
	}

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
	public static List<formulario> findByField1(int field1, int start, int end) {
		return getPersistence().findByField1(field1, start, end);
	}

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
	public static List<formulario> findByField1(int field1, int start, int end,
		OrderByComparator<formulario> orderByComparator) {
		return getPersistence()
				   .findByField1(field1, start, end, orderByComparator);
	}

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
	public static List<formulario> findByField1(int field1, int start, int end,
		OrderByComparator<formulario> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByField1(field1, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first formulario in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public static formulario findByField1_First(int field1,
		OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence().findByField1_First(field1, orderByComparator);
	}

	/**
	* Returns the first formulario in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public static formulario fetchByField1_First(int field1,
		OrderByComparator<formulario> orderByComparator) {
		return getPersistence().fetchByField1_First(field1, orderByComparator);
	}

	/**
	* Returns the last formulario in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public static formulario findByField1_Last(int field1,
		OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence().findByField1_Last(field1, orderByComparator);
	}

	/**
	* Returns the last formulario in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public static formulario fetchByField1_Last(int field1,
		OrderByComparator<formulario> orderByComparator) {
		return getPersistence().fetchByField1_Last(field1, orderByComparator);
	}

	/**
	* Returns the formularios before and after the current formulario in the ordered set where field1 = &#63;.
	*
	* @param formularioId the primary key of the current formulario
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next formulario
	* @throws NoSuchformularioException if a formulario with the primary key could not be found
	*/
	public static formulario[] findByField1_PrevAndNext(long formularioId,
		int field1, OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence()
				   .findByField1_PrevAndNext(formularioId, field1,
			orderByComparator);
	}

	/**
	* Removes all the formularios where field1 = &#63; from the database.
	*
	* @param field1 the field1
	*/
	public static void removeByField1(int field1) {
		getPersistence().removeByField1(field1);
	}

	/**
	* Returns the number of formularios where field1 = &#63;.
	*
	* @param field1 the field1
	* @return the number of matching formularios
	*/
	public static int countByField1(int field1) {
		return getPersistence().countByField1(field1);
	}

	/**
	* Returns all the formularios where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching formularios
	*/
	public static List<formulario> findByField2(int field2) {
		return getPersistence().findByField2(field2);
	}

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
	public static List<formulario> findByField2(int field2, int start, int end) {
		return getPersistence().findByField2(field2, start, end);
	}

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
	public static List<formulario> findByField2(int field2, int start, int end,
		OrderByComparator<formulario> orderByComparator) {
		return getPersistence()
				   .findByField2(field2, start, end, orderByComparator);
	}

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
	public static List<formulario> findByField2(int field2, int start, int end,
		OrderByComparator<formulario> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByField2(field2, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first formulario in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public static formulario findByField2_First(int field2,
		OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence().findByField2_First(field2, orderByComparator);
	}

	/**
	* Returns the first formulario in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public static formulario fetchByField2_First(int field2,
		OrderByComparator<formulario> orderByComparator) {
		return getPersistence().fetchByField2_First(field2, orderByComparator);
	}

	/**
	* Returns the last formulario in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario
	* @throws NoSuchformularioException if a matching formulario could not be found
	*/
	public static formulario findByField2_Last(int field2,
		OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence().findByField2_Last(field2, orderByComparator);
	}

	/**
	* Returns the last formulario in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	public static formulario fetchByField2_Last(int field2,
		OrderByComparator<formulario> orderByComparator) {
		return getPersistence().fetchByField2_Last(field2, orderByComparator);
	}

	/**
	* Returns the formularios before and after the current formulario in the ordered set where field2 = &#63;.
	*
	* @param formularioId the primary key of the current formulario
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next formulario
	* @throws NoSuchformularioException if a formulario with the primary key could not be found
	*/
	public static formulario[] findByField2_PrevAndNext(long formularioId,
		int field2, OrderByComparator<formulario> orderByComparator)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence()
				   .findByField2_PrevAndNext(formularioId, field2,
			orderByComparator);
	}

	/**
	* Removes all the formularios where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public static void removeByField2(int field2) {
		getPersistence().removeByField2(field2);
	}

	/**
	* Returns the number of formularios where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching formularios
	*/
	public static int countByField2(int field2) {
		return getPersistence().countByField2(field2);
	}

	/**
	* Caches the formulario in the entity cache if it is enabled.
	*
	* @param formulario the formulario
	*/
	public static void cacheResult(formulario formulario) {
		getPersistence().cacheResult(formulario);
	}

	/**
	* Caches the formularios in the entity cache if it is enabled.
	*
	* @param formularios the formularios
	*/
	public static void cacheResult(List<formulario> formularios) {
		getPersistence().cacheResult(formularios);
	}

	/**
	* Creates a new formulario with the primary key. Does not add the formulario to the database.
	*
	* @param formularioId the primary key for the new formulario
	* @return the new formulario
	*/
	public static formulario create(long formularioId) {
		return getPersistence().create(formularioId);
	}

	/**
	* Removes the formulario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param formularioId the primary key of the formulario
	* @return the formulario that was removed
	* @throws NoSuchformularioException if a formulario with the primary key could not be found
	*/
	public static formulario remove(long formularioId)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence().remove(formularioId);
	}

	public static formulario updateImpl(formulario formulario) {
		return getPersistence().updateImpl(formulario);
	}

	/**
	* Returns the formulario with the primary key or throws a {@link NoSuchformularioException} if it could not be found.
	*
	* @param formularioId the primary key of the formulario
	* @return the formulario
	* @throws NoSuchformularioException if a formulario with the primary key could not be found
	*/
	public static formulario findByPrimaryKey(long formularioId)
		throws com.jbaricot.formulario.exception.NoSuchformularioException {
		return getPersistence().findByPrimaryKey(formularioId);
	}

	/**
	* Returns the formulario with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param formularioId the primary key of the formulario
	* @return the formulario, or <code>null</code> if a formulario with the primary key could not be found
	*/
	public static formulario fetchByPrimaryKey(long formularioId) {
		return getPersistence().fetchByPrimaryKey(formularioId);
	}

	public static java.util.Map<java.io.Serializable, formulario> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the formularios.
	*
	* @return the formularios
	*/
	public static List<formulario> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<formulario> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<formulario> findAll(int start, int end,
		OrderByComparator<formulario> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<formulario> findAll(int start, int end,
		OrderByComparator<formulario> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the formularios from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of formularios.
	*
	* @return the number of formularios
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static formularioPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<formularioPersistence, formularioPersistence> _serviceTracker =
		ServiceTrackerFactory.open(formularioPersistence.class);
}