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

package com.liferay.suma.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.suma.exception.NoSuchpruebaException;
import com.liferay.suma.model.impl.pruebaImpl;
import com.liferay.suma.model.impl.pruebaModelImpl;
import com.liferay.suma.model.prueba;
import com.liferay.suma.service.persistence.pruebaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the prueba service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see pruebaPersistence
 * @see com.liferay.suma.service.persistence.pruebaUtil
 * @generated
 */
@ProviderType
public class pruebaPersistenceImpl extends BasePersistenceImpl<prueba>
	implements pruebaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link pruebaUtil} to access the prueba persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = pruebaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, pruebaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, pruebaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, pruebaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, pruebaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			pruebaModelImpl.UUID_COLUMN_BITMASK |
			pruebaModelImpl.FIELD1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the pruebas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching pruebas
	 */
	@Override
	public List<prueba> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<prueba> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<prueba> findByUuid(String uuid, int start, int end,
		OrderByComparator<prueba> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<prueba> findByUuid(String uuid, int start, int end,
		OrderByComparator<prueba> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<prueba> list = null;

		if (retrieveFromCache) {
			list = (List<prueba>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (prueba prueba : list) {
					if (!Objects.equals(uuid, prueba.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PRUEBA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(pruebaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<prueba>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<prueba>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first prueba in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching prueba
	 * @throws NoSuchpruebaException if a matching prueba could not be found
	 */
	@Override
	public prueba findByUuid_First(String uuid,
		OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = fetchByUuid_First(uuid, orderByComparator);

		if (prueba != null) {
			return prueba;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchpruebaException(msg.toString());
	}

	/**
	 * Returns the first prueba in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	 */
	@Override
	public prueba fetchByUuid_First(String uuid,
		OrderByComparator<prueba> orderByComparator) {
		List<prueba> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last prueba in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching prueba
	 * @throws NoSuchpruebaException if a matching prueba could not be found
	 */
	@Override
	public prueba findByUuid_Last(String uuid,
		OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = fetchByUuid_Last(uuid, orderByComparator);

		if (prueba != null) {
			return prueba;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchpruebaException(msg.toString());
	}

	/**
	 * Returns the last prueba in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	 */
	@Override
	public prueba fetchByUuid_Last(String uuid,
		OrderByComparator<prueba> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<prueba> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public prueba[] findByUuid_PrevAndNext(long pruebaId, String uuid,
		OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = findByPrimaryKey(pruebaId);

		Session session = null;

		try {
			session = openSession();

			prueba[] array = new pruebaImpl[3];

			array[0] = getByUuid_PrevAndNext(session, prueba, uuid,
					orderByComparator, true);

			array[1] = prueba;

			array[2] = getByUuid_PrevAndNext(session, prueba, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected prueba getByUuid_PrevAndNext(Session session, prueba prueba,
		String uuid, OrderByComparator<prueba> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRUEBA_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(pruebaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(prueba);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<prueba> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pruebas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (prueba prueba : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(prueba);
		}
	}

	/**
	 * Returns the number of pruebas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching pruebas
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRUEBA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "prueba.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "prueba.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(prueba.uuid IS NULL OR prueba.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, pruebaImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			pruebaModelImpl.UUID_COLUMN_BITMASK |
			pruebaModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the prueba where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchpruebaException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching prueba
	 * @throws NoSuchpruebaException if a matching prueba could not be found
	 */
	@Override
	public prueba findByUUID_G(String uuid, long groupId)
		throws NoSuchpruebaException {
		prueba prueba = fetchByUUID_G(uuid, groupId);

		if (prueba == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchpruebaException(msg.toString());
		}

		return prueba;
	}

	/**
	 * Returns the prueba where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching prueba, or <code>null</code> if a matching prueba could not be found
	 */
	@Override
	public prueba fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the prueba where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching prueba, or <code>null</code> if a matching prueba could not be found
	 */
	@Override
	public prueba fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof prueba) {
			prueba prueba = (prueba)result;

			if (!Objects.equals(uuid, prueba.getUuid()) ||
					(groupId != prueba.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PRUEBA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<prueba> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					prueba prueba = list.get(0);

					result = prueba;

					cacheResult(prueba);

					if ((prueba.getUuid() == null) ||
							!prueba.getUuid().equals(uuid) ||
							(prueba.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, prueba);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (prueba)result;
		}
	}

	/**
	 * Removes the prueba where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the prueba that was removed
	 */
	@Override
	public prueba removeByUUID_G(String uuid, long groupId)
		throws NoSuchpruebaException {
		prueba prueba = findByUUID_G(uuid, groupId);

		return remove(prueba);
	}

	/**
	 * Returns the number of pruebas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching pruebas
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PRUEBA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "prueba.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "prueba.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(prueba.uuid IS NULL OR prueba.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "prueba.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, pruebaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, pruebaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			pruebaModelImpl.UUID_COLUMN_BITMASK |
			pruebaModelImpl.COMPANYID_COLUMN_BITMASK |
			pruebaModelImpl.FIELD1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the pruebas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching pruebas
	 */
	@Override
	public List<prueba> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<prueba> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<prueba> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<prueba> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<prueba> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<prueba> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<prueba> list = null;

		if (retrieveFromCache) {
			list = (List<prueba>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (prueba prueba : list) {
					if (!Objects.equals(uuid, prueba.getUuid()) ||
							(companyId != prueba.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_PRUEBA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(pruebaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<prueba>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<prueba>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public prueba findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (prueba != null) {
			return prueba;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchpruebaException(msg.toString());
	}

	/**
	 * Returns the first prueba in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	 */
	@Override
	public prueba fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<prueba> orderByComparator) {
		List<prueba> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public prueba findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (prueba != null) {
			return prueba;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchpruebaException(msg.toString());
	}

	/**
	 * Returns the last prueba in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	 */
	@Override
	public prueba fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<prueba> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<prueba> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public prueba[] findByUuid_C_PrevAndNext(long pruebaId, String uuid,
		long companyId, OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = findByPrimaryKey(pruebaId);

		Session session = null;

		try {
			session = openSession();

			prueba[] array = new pruebaImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, prueba, uuid,
					companyId, orderByComparator, true);

			array[1] = prueba;

			array[2] = getByUuid_C_PrevAndNext(session, prueba, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected prueba getByUuid_C_PrevAndNext(Session session, prueba prueba,
		String uuid, long companyId,
		OrderByComparator<prueba> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_PRUEBA_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(pruebaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(prueba);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<prueba> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pruebas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (prueba prueba : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(prueba);
		}
	}

	/**
	 * Returns the number of pruebas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching pruebas
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PRUEBA_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "prueba.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "prueba.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(prueba.uuid IS NULL OR prueba.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "prueba.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD1 = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, pruebaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByField1",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD1 =
		new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, pruebaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByField1",
			new String[] { Integer.class.getName() },
			pruebaModelImpl.FIELD1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FIELD1 = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByField1",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the pruebas where field1 = &#63;.
	 *
	 * @param field1 the field1
	 * @return the matching pruebas
	 */
	@Override
	public List<prueba> findByField1(int field1) {
		return findByField1(field1, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<prueba> findByField1(int field1, int start, int end) {
		return findByField1(field1, start, end, null);
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
	@Override
	public List<prueba> findByField1(int field1, int start, int end,
		OrderByComparator<prueba> orderByComparator) {
		return findByField1(field1, start, end, orderByComparator, true);
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
	@Override
	public List<prueba> findByField1(int field1, int start, int end,
		OrderByComparator<prueba> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD1;
			finderArgs = new Object[] { field1 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD1;
			finderArgs = new Object[] { field1, start, end, orderByComparator };
		}

		List<prueba> list = null;

		if (retrieveFromCache) {
			list = (List<prueba>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (prueba prueba : list) {
					if ((field1 != prueba.getField1())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PRUEBA_WHERE);

			query.append(_FINDER_COLUMN_FIELD1_FIELD1_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(pruebaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(field1);

				if (!pagination) {
					list = (List<prueba>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<prueba>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first prueba in the ordered set where field1 = &#63;.
	 *
	 * @param field1 the field1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching prueba
	 * @throws NoSuchpruebaException if a matching prueba could not be found
	 */
	@Override
	public prueba findByField1_First(int field1,
		OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = fetchByField1_First(field1, orderByComparator);

		if (prueba != null) {
			return prueba;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("field1=");
		msg.append(field1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchpruebaException(msg.toString());
	}

	/**
	 * Returns the first prueba in the ordered set where field1 = &#63;.
	 *
	 * @param field1 the field1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	 */
	@Override
	public prueba fetchByField1_First(int field1,
		OrderByComparator<prueba> orderByComparator) {
		List<prueba> list = findByField1(field1, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last prueba in the ordered set where field1 = &#63;.
	 *
	 * @param field1 the field1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching prueba
	 * @throws NoSuchpruebaException if a matching prueba could not be found
	 */
	@Override
	public prueba findByField1_Last(int field1,
		OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = fetchByField1_Last(field1, orderByComparator);

		if (prueba != null) {
			return prueba;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("field1=");
		msg.append(field1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchpruebaException(msg.toString());
	}

	/**
	 * Returns the last prueba in the ordered set where field1 = &#63;.
	 *
	 * @param field1 the field1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	 */
	@Override
	public prueba fetchByField1_Last(int field1,
		OrderByComparator<prueba> orderByComparator) {
		int count = countByField1(field1);

		if (count == 0) {
			return null;
		}

		List<prueba> list = findByField1(field1, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public prueba[] findByField1_PrevAndNext(long pruebaId, int field1,
		OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = findByPrimaryKey(pruebaId);

		Session session = null;

		try {
			session = openSession();

			prueba[] array = new pruebaImpl[3];

			array[0] = getByField1_PrevAndNext(session, prueba, field1,
					orderByComparator, true);

			array[1] = prueba;

			array[2] = getByField1_PrevAndNext(session, prueba, field1,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected prueba getByField1_PrevAndNext(Session session, prueba prueba,
		int field1, OrderByComparator<prueba> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRUEBA_WHERE);

		query.append(_FINDER_COLUMN_FIELD1_FIELD1_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(pruebaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(field1);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(prueba);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<prueba> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pruebas where field1 = &#63; from the database.
	 *
	 * @param field1 the field1
	 */
	@Override
	public void removeByField1(int field1) {
		for (prueba prueba : findByField1(field1, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(prueba);
		}
	}

	/**
	 * Returns the number of pruebas where field1 = &#63;.
	 *
	 * @param field1 the field1
	 * @return the number of matching pruebas
	 */
	@Override
	public int countByField1(int field1) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FIELD1;

		Object[] finderArgs = new Object[] { field1 };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRUEBA_WHERE);

			query.append(_FINDER_COLUMN_FIELD1_FIELD1_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(field1);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FIELD1_FIELD1_2 = "prueba.field1 = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD2 = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, pruebaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByField2",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2 =
		new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, pruebaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByField2",
			new String[] { Integer.class.getName() },
			pruebaModelImpl.FIELD2_COLUMN_BITMASK |
			pruebaModelImpl.FIELD1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FIELD2 = new FinderPath(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByField2",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the pruebas where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching pruebas
	 */
	@Override
	public List<prueba> findByField2(int field2) {
		return findByField2(field2, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<prueba> findByField2(int field2, int start, int end) {
		return findByField2(field2, start, end, null);
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
	@Override
	public List<prueba> findByField2(int field2, int start, int end,
		OrderByComparator<prueba> orderByComparator) {
		return findByField2(field2, start, end, orderByComparator, true);
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
	@Override
	public List<prueba> findByField2(int field2, int start, int end,
		OrderByComparator<prueba> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2;
			finderArgs = new Object[] { field2 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FIELD2;
			finderArgs = new Object[] { field2, start, end, orderByComparator };
		}

		List<prueba> list = null;

		if (retrieveFromCache) {
			list = (List<prueba>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (prueba prueba : list) {
					if ((field2 != prueba.getField2())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PRUEBA_WHERE);

			query.append(_FINDER_COLUMN_FIELD2_FIELD2_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(pruebaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(field2);

				if (!pagination) {
					list = (List<prueba>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<prueba>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first prueba in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching prueba
	 * @throws NoSuchpruebaException if a matching prueba could not be found
	 */
	@Override
	public prueba findByField2_First(int field2,
		OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = fetchByField2_First(field2, orderByComparator);

		if (prueba != null) {
			return prueba;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("field2=");
		msg.append(field2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchpruebaException(msg.toString());
	}

	/**
	 * Returns the first prueba in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching prueba, or <code>null</code> if a matching prueba could not be found
	 */
	@Override
	public prueba fetchByField2_First(int field2,
		OrderByComparator<prueba> orderByComparator) {
		List<prueba> list = findByField2(field2, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last prueba in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching prueba
	 * @throws NoSuchpruebaException if a matching prueba could not be found
	 */
	@Override
	public prueba findByField2_Last(int field2,
		OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = fetchByField2_Last(field2, orderByComparator);

		if (prueba != null) {
			return prueba;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("field2=");
		msg.append(field2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchpruebaException(msg.toString());
	}

	/**
	 * Returns the last prueba in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching prueba, or <code>null</code> if a matching prueba could not be found
	 */
	@Override
	public prueba fetchByField2_Last(int field2,
		OrderByComparator<prueba> orderByComparator) {
		int count = countByField2(field2);

		if (count == 0) {
			return null;
		}

		List<prueba> list = findByField2(field2, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public prueba[] findByField2_PrevAndNext(long pruebaId, int field2,
		OrderByComparator<prueba> orderByComparator)
		throws NoSuchpruebaException {
		prueba prueba = findByPrimaryKey(pruebaId);

		Session session = null;

		try {
			session = openSession();

			prueba[] array = new pruebaImpl[3];

			array[0] = getByField2_PrevAndNext(session, prueba, field2,
					orderByComparator, true);

			array[1] = prueba;

			array[2] = getByField2_PrevAndNext(session, prueba, field2,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected prueba getByField2_PrevAndNext(Session session, prueba prueba,
		int field2, OrderByComparator<prueba> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRUEBA_WHERE);

		query.append(_FINDER_COLUMN_FIELD2_FIELD2_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(pruebaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(field2);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(prueba);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<prueba> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pruebas where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	@Override
	public void removeByField2(int field2) {
		for (prueba prueba : findByField2(field2, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(prueba);
		}
	}

	/**
	 * Returns the number of pruebas where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching pruebas
	 */
	@Override
	public int countByField2(int field2) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FIELD2;

		Object[] finderArgs = new Object[] { field2 };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRUEBA_WHERE);

			query.append(_FINDER_COLUMN_FIELD2_FIELD2_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(field2);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FIELD2_FIELD2_2 = "prueba.field2 = ?";

	public pruebaPersistenceImpl() {
		setModelClass(prueba.class);
	}

	/**
	 * Caches the prueba in the entity cache if it is enabled.
	 *
	 * @param prueba the prueba
	 */
	@Override
	public void cacheResult(prueba prueba) {
		entityCache.putResult(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaImpl.class, prueba.getPrimaryKey(), prueba);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { prueba.getUuid(), prueba.getGroupId() }, prueba);

		prueba.resetOriginalValues();
	}

	/**
	 * Caches the pruebas in the entity cache if it is enabled.
	 *
	 * @param pruebas the pruebas
	 */
	@Override
	public void cacheResult(List<prueba> pruebas) {
		for (prueba prueba : pruebas) {
			if (entityCache.getResult(pruebaModelImpl.ENTITY_CACHE_ENABLED,
						pruebaImpl.class, prueba.getPrimaryKey()) == null) {
				cacheResult(prueba);
			}
			else {
				prueba.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all pruebas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(pruebaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the prueba.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(prueba prueba) {
		entityCache.removeResult(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaImpl.class, prueba.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((pruebaModelImpl)prueba);
	}

	@Override
	public void clearCache(List<prueba> pruebas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (prueba prueba : pruebas) {
			entityCache.removeResult(pruebaModelImpl.ENTITY_CACHE_ENABLED,
				pruebaImpl.class, prueba.getPrimaryKey());

			clearUniqueFindersCache((pruebaModelImpl)prueba);
		}
	}

	protected void cacheUniqueFindersCache(pruebaModelImpl pruebaModelImpl,
		boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					pruebaModelImpl.getUuid(), pruebaModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				pruebaModelImpl);
		}
		else {
			if ((pruebaModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pruebaModelImpl.getUuid(), pruebaModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					pruebaModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(pruebaModelImpl pruebaModelImpl) {
		Object[] args = new Object[] {
				pruebaModelImpl.getUuid(), pruebaModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((pruebaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					pruebaModelImpl.getOriginalUuid(),
					pruebaModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new prueba with the primary key. Does not add the prueba to the database.
	 *
	 * @param pruebaId the primary key for the new prueba
	 * @return the new prueba
	 */
	@Override
	public prueba create(long pruebaId) {
		prueba prueba = new pruebaImpl();

		prueba.setNew(true);
		prueba.setPrimaryKey(pruebaId);

		String uuid = PortalUUIDUtil.generate();

		prueba.setUuid(uuid);

		prueba.setCompanyId(companyProvider.getCompanyId());

		return prueba;
	}

	/**
	 * Removes the prueba with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pruebaId the primary key of the prueba
	 * @return the prueba that was removed
	 * @throws NoSuchpruebaException if a prueba with the primary key could not be found
	 */
	@Override
	public prueba remove(long pruebaId) throws NoSuchpruebaException {
		return remove((Serializable)pruebaId);
	}

	/**
	 * Removes the prueba with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the prueba
	 * @return the prueba that was removed
	 * @throws NoSuchpruebaException if a prueba with the primary key could not be found
	 */
	@Override
	public prueba remove(Serializable primaryKey) throws NoSuchpruebaException {
		Session session = null;

		try {
			session = openSession();

			prueba prueba = (prueba)session.get(pruebaImpl.class, primaryKey);

			if (prueba == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpruebaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(prueba);
		}
		catch (NoSuchpruebaException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected prueba removeImpl(prueba prueba) {
		prueba = toUnwrappedModel(prueba);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(prueba)) {
				prueba = (prueba)session.get(pruebaImpl.class,
						prueba.getPrimaryKeyObj());
			}

			if (prueba != null) {
				session.delete(prueba);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (prueba != null) {
			clearCache(prueba);
		}

		return prueba;
	}

	@Override
	public prueba updateImpl(prueba prueba) {
		prueba = toUnwrappedModel(prueba);

		boolean isNew = prueba.isNew();

		pruebaModelImpl pruebaModelImpl = (pruebaModelImpl)prueba;

		if (Validator.isNull(prueba.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			prueba.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (prueba.getCreateDate() == null)) {
			if (serviceContext == null) {
				prueba.setCreateDate(now);
			}
			else {
				prueba.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!pruebaModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				prueba.setModifiedDate(now);
			}
			else {
				prueba.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (prueba.isNew()) {
				session.save(prueba);

				prueba.setNew(false);
			}
			else {
				prueba = (prueba)session.merge(prueba);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !pruebaModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((pruebaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { pruebaModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { pruebaModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((pruebaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pruebaModelImpl.getOriginalUuid(),
						pruebaModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						pruebaModelImpl.getUuid(),
						pruebaModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((pruebaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { pruebaModelImpl.getOriginalField1() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD1, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD1,
					args);

				args = new Object[] { pruebaModelImpl.getField1() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD1, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD1,
					args);
			}

			if ((pruebaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { pruebaModelImpl.getOriginalField2() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD2, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2,
					args);

				args = new Object[] { pruebaModelImpl.getField2() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIELD2, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIELD2,
					args);
			}
		}

		entityCache.putResult(pruebaModelImpl.ENTITY_CACHE_ENABLED,
			pruebaImpl.class, prueba.getPrimaryKey(), prueba, false);

		clearUniqueFindersCache(pruebaModelImpl);
		cacheUniqueFindersCache(pruebaModelImpl, isNew);

		prueba.resetOriginalValues();

		return prueba;
	}

	protected prueba toUnwrappedModel(prueba prueba) {
		if (prueba instanceof pruebaImpl) {
			return prueba;
		}

		pruebaImpl pruebaImpl = new pruebaImpl();

		pruebaImpl.setNew(prueba.isNew());
		pruebaImpl.setPrimaryKey(prueba.getPrimaryKey());

		pruebaImpl.setUuid(prueba.getUuid());
		pruebaImpl.setPruebaId(prueba.getPruebaId());
		pruebaImpl.setGroupId(prueba.getGroupId());
		pruebaImpl.setCompanyId(prueba.getCompanyId());
		pruebaImpl.setUserId(prueba.getUserId());
		pruebaImpl.setUserName(prueba.getUserName());
		pruebaImpl.setCreateDate(prueba.getCreateDate());
		pruebaImpl.setModifiedDate(prueba.getModifiedDate());
		pruebaImpl.setField1(prueba.getField1());
		pruebaImpl.setField2(prueba.getField2());

		return pruebaImpl;
	}

	/**
	 * Returns the prueba with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the prueba
	 * @return the prueba
	 * @throws NoSuchpruebaException if a prueba with the primary key could not be found
	 */
	@Override
	public prueba findByPrimaryKey(Serializable primaryKey)
		throws NoSuchpruebaException {
		prueba prueba = fetchByPrimaryKey(primaryKey);

		if (prueba == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpruebaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return prueba;
	}

	/**
	 * Returns the prueba with the primary key or throws a {@link NoSuchpruebaException} if it could not be found.
	 *
	 * @param pruebaId the primary key of the prueba
	 * @return the prueba
	 * @throws NoSuchpruebaException if a prueba with the primary key could not be found
	 */
	@Override
	public prueba findByPrimaryKey(long pruebaId) throws NoSuchpruebaException {
		return findByPrimaryKey((Serializable)pruebaId);
	}

	/**
	 * Returns the prueba with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the prueba
	 * @return the prueba, or <code>null</code> if a prueba with the primary key could not be found
	 */
	@Override
	public prueba fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(pruebaModelImpl.ENTITY_CACHE_ENABLED,
				pruebaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		prueba prueba = (prueba)serializable;

		if (prueba == null) {
			Session session = null;

			try {
				session = openSession();

				prueba = (prueba)session.get(pruebaImpl.class, primaryKey);

				if (prueba != null) {
					cacheResult(prueba);
				}
				else {
					entityCache.putResult(pruebaModelImpl.ENTITY_CACHE_ENABLED,
						pruebaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(pruebaModelImpl.ENTITY_CACHE_ENABLED,
					pruebaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return prueba;
	}

	/**
	 * Returns the prueba with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pruebaId the primary key of the prueba
	 * @return the prueba, or <code>null</code> if a prueba with the primary key could not be found
	 */
	@Override
	public prueba fetchByPrimaryKey(long pruebaId) {
		return fetchByPrimaryKey((Serializable)pruebaId);
	}

	@Override
	public Map<Serializable, prueba> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, prueba> map = new HashMap<Serializable, prueba>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			prueba prueba = fetchByPrimaryKey(primaryKey);

			if (prueba != null) {
				map.put(primaryKey, prueba);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(pruebaModelImpl.ENTITY_CACHE_ENABLED,
					pruebaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (prueba)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PRUEBA_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (prueba prueba : (List<prueba>)q.list()) {
				map.put(prueba.getPrimaryKeyObj(), prueba);

				cacheResult(prueba);

				uncachedPrimaryKeys.remove(prueba.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(pruebaModelImpl.ENTITY_CACHE_ENABLED,
					pruebaImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the pruebas.
	 *
	 * @return the pruebas
	 */
	@Override
	public List<prueba> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<prueba> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<prueba> findAll(int start, int end,
		OrderByComparator<prueba> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<prueba> findAll(int start, int end,
		OrderByComparator<prueba> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<prueba> list = null;

		if (retrieveFromCache) {
			list = (List<prueba>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PRUEBA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRUEBA;

				if (pagination) {
					sql = sql.concat(pruebaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<prueba>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<prueba>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the pruebas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (prueba prueba : findAll()) {
			remove(prueba);
		}
	}

	/**
	 * Returns the number of pruebas.
	 *
	 * @return the number of pruebas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PRUEBA);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return pruebaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the prueba persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(pruebaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PRUEBA = "SELECT prueba FROM prueba prueba";
	private static final String _SQL_SELECT_PRUEBA_WHERE_PKS_IN = "SELECT prueba FROM prueba prueba WHERE pruebaId IN (";
	private static final String _SQL_SELECT_PRUEBA_WHERE = "SELECT prueba FROM prueba prueba WHERE ";
	private static final String _SQL_COUNT_PRUEBA = "SELECT COUNT(prueba) FROM prueba prueba";
	private static final String _SQL_COUNT_PRUEBA_WHERE = "SELECT COUNT(prueba) FROM prueba prueba WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "prueba.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No prueba exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No prueba exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(pruebaPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}