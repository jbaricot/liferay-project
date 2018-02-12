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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.suma.model.prueba;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the prueba service. This utility wraps {@link com.liferay.suma.service.persistence.impl.pruebaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see pruebaPersistence
 * @see com.liferay.suma.service.persistence.impl.pruebaPersistenceImpl
 * @generated
 */
@ProviderType
public class pruebaUtil {
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
	public static void clearCache(prueba prueba) {
		getPersistence().clearCache(prueba);
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
	public static List<prueba> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<prueba> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<prueba> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<prueba> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static prueba update(prueba prueba) {
		return getPersistence().update(prueba);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static prueba update(prueba prueba, ServiceContext serviceContext) {
		return getPersistence().update(prueba, serviceContext);
	}

	/**
	* Returns all the pruebas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching pruebas
	*/
	public static List<prueba> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<prueba> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<prueba> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<prueba> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<prueba> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<prueba> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first prueba in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public static prueba findByUuid_First(java.lang.String uuid,
		OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first prueba in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public static prueba fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<prueba> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last prueba in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public static prueba findByUuid_Last(java.lang.String uuid,
		OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last prueba in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public static prueba fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<prueba> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the pruebas before and after the current prueba in the ordered set where uuid = &#63;.
	*
	* @param pruebaId the primary key of the current prueba
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prueba
	* @throws NoSuchpruebaException if a prueba with the primary key could not be found
	*/
	public static prueba[] findByUuid_PrevAndNext(long pruebaId,
		java.lang.String uuid, OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence()
				   .findByUuid_PrevAndNext(pruebaId, uuid, orderByComparator);
	}

	/**
	* Removes all the pruebas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of pruebas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching pruebas
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the prueba where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchpruebaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public static prueba findByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the prueba where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public static prueba fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the prueba where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public static prueba fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the prueba where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the prueba that was removed
	*/
	public static prueba removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of pruebas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching pruebas
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the pruebas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching pruebas
	*/
	public static List<prueba> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<prueba> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<prueba> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<prueba> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<prueba> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<prueba> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first prueba in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public static prueba findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first prueba in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public static prueba fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<prueba> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last prueba in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public static prueba findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last prueba in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public static prueba fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<prueba> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static prueba[] findByUuid_C_PrevAndNext(long pruebaId,
		java.lang.String uuid, long companyId,
		OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(pruebaId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the pruebas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of pruebas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching pruebas
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the pruebas where field1 = &#63;.
	*
	* @param field1 the field1
	* @return the matching pruebas
	*/
	public static List<prueba> findByField1(int field1) {
		return getPersistence().findByField1(field1);
	}

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
	public static List<prueba> findByField1(int field1, int start, int end) {
		return getPersistence().findByField1(field1, start, end);
	}

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
	public static List<prueba> findByField1(int field1, int start, int end,
		OrderByComparator<prueba> orderByComparator) {
		return getPersistence()
				   .findByField1(field1, start, end, orderByComparator);
	}

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
	public static List<prueba> findByField1(int field1, int start, int end,
		OrderByComparator<prueba> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByField1(field1, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first prueba in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public static prueba findByField1_First(int field1,
		OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence().findByField1_First(field1, orderByComparator);
	}

	/**
	* Returns the first prueba in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public static prueba fetchByField1_First(int field1,
		OrderByComparator<prueba> orderByComparator) {
		return getPersistence().fetchByField1_First(field1, orderByComparator);
	}

	/**
	* Returns the last prueba in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public static prueba findByField1_Last(int field1,
		OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence().findByField1_Last(field1, orderByComparator);
	}

	/**
	* Returns the last prueba in the ordered set where field1 = &#63;.
	*
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public static prueba fetchByField1_Last(int field1,
		OrderByComparator<prueba> orderByComparator) {
		return getPersistence().fetchByField1_Last(field1, orderByComparator);
	}

	/**
	* Returns the pruebas before and after the current prueba in the ordered set where field1 = &#63;.
	*
	* @param pruebaId the primary key of the current prueba
	* @param field1 the field1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prueba
	* @throws NoSuchpruebaException if a prueba with the primary key could not be found
	*/
	public static prueba[] findByField1_PrevAndNext(long pruebaId, int field1,
		OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence()
				   .findByField1_PrevAndNext(pruebaId, field1, orderByComparator);
	}

	/**
	* Removes all the pruebas where field1 = &#63; from the database.
	*
	* @param field1 the field1
	*/
	public static void removeByField1(int field1) {
		getPersistence().removeByField1(field1);
	}

	/**
	* Returns the number of pruebas where field1 = &#63;.
	*
	* @param field1 the field1
	* @return the number of matching pruebas
	*/
	public static int countByField1(int field1) {
		return getPersistence().countByField1(field1);
	}

	/**
	* Returns all the pruebas where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching pruebas
	*/
	public static List<prueba> findByField2(int field2) {
		return getPersistence().findByField2(field2);
	}

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
	public static List<prueba> findByField2(int field2, int start, int end) {
		return getPersistence().findByField2(field2, start, end);
	}

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
	public static List<prueba> findByField2(int field2, int start, int end,
		OrderByComparator<prueba> orderByComparator) {
		return getPersistence()
				   .findByField2(field2, start, end, orderByComparator);
	}

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
	public static List<prueba> findByField2(int field2, int start, int end,
		OrderByComparator<prueba> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByField2(field2, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first prueba in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public static prueba findByField2_First(int field2,
		OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence().findByField2_First(field2, orderByComparator);
	}

	/**
	* Returns the first prueba in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public static prueba fetchByField2_First(int field2,
		OrderByComparator<prueba> orderByComparator) {
		return getPersistence().fetchByField2_First(field2, orderByComparator);
	}

	/**
	* Returns the last prueba in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba
	* @throws NoSuchpruebaException if a matching prueba could not be found
	*/
	public static prueba findByField2_Last(int field2,
		OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence().findByField2_Last(field2, orderByComparator);
	}

	/**
	* Returns the last prueba in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	*/
	public static prueba fetchByField2_Last(int field2,
		OrderByComparator<prueba> orderByComparator) {
		return getPersistence().fetchByField2_Last(field2, orderByComparator);
	}

	/**
	* Returns the pruebas before and after the current prueba in the ordered set where field2 = &#63;.
	*
	* @param pruebaId the primary key of the current prueba
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prueba
	* @throws NoSuchpruebaException if a prueba with the primary key could not be found
	*/
	public static prueba[] findByField2_PrevAndNext(long pruebaId, int field2,
		OrderByComparator<prueba> orderByComparator)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence()
				   .findByField2_PrevAndNext(pruebaId, field2, orderByComparator);
	}

	/**
	* Removes all the pruebas where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public static void removeByField2(int field2) {
		getPersistence().removeByField2(field2);
	}

	/**
	* Returns the number of pruebas where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching pruebas
	*/
	public static int countByField2(int field2) {
		return getPersistence().countByField2(field2);
	}

	/**
	* Caches the prueba in the entity cache if it is enabled.
	*
	* @param prueba the prueba
	*/
	public static void cacheResult(prueba prueba) {
		getPersistence().cacheResult(prueba);
	}

	/**
	* Caches the pruebas in the entity cache if it is enabled.
	*
	* @param pruebas the pruebas
	*/
	public static void cacheResult(List<prueba> pruebas) {
		getPersistence().cacheResult(pruebas);
	}

	/**
	* Creates a new prueba with the primary key. Does not add the prueba to the database.
	*
	* @param pruebaId the primary key for the new prueba
	* @return the new prueba
	*/
	public static prueba create(long pruebaId) {
		return getPersistence().create(pruebaId);
	}

	/**
	* Removes the prueba with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pruebaId the primary key of the prueba
	* @return the prueba that was removed
	* @throws NoSuchpruebaException if a prueba with the primary key could not be found
	*/
	public static prueba remove(long pruebaId)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence().remove(pruebaId);
	}

	public static prueba updateImpl(prueba prueba) {
		return getPersistence().updateImpl(prueba);
	}

	/**
	* Returns the prueba with the primary key or throws a {@link NoSuchpruebaException} if it could not be found.
	*
	* @param pruebaId the primary key of the prueba
	* @return the prueba
	* @throws NoSuchpruebaException if a prueba with the primary key could not be found
	*/
	public static prueba findByPrimaryKey(long pruebaId)
		throws com.liferay.suma.exception.NoSuchpruebaException {
		return getPersistence().findByPrimaryKey(pruebaId);
	}

	/**
	* Returns the prueba with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pruebaId the primary key of the prueba
	* @return the prueba, or <code>null</code> if a prueba with the primary key could not be found
	*/
	public static prueba fetchByPrimaryKey(long pruebaId) {
		return getPersistence().fetchByPrimaryKey(pruebaId);
	}

	public static java.util.Map<java.io.Serializable, prueba> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the pruebas.
	*
	* @return the pruebas
	*/
	public static List<prueba> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<prueba> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<prueba> findAll(int start, int end,
		OrderByComparator<prueba> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<prueba> findAll(int start, int end,
		OrderByComparator<prueba> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the pruebas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of pruebas.
	*
	* @return the number of pruebas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static pruebaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<pruebaPersistence, pruebaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(pruebaPersistence.class);
}