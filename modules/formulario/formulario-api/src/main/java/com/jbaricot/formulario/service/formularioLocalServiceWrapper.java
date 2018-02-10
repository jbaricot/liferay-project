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

package com.jbaricot.formulario.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link formularioLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see formularioLocalService
 * @generated
 */
@ProviderType
public class formularioLocalServiceWrapper implements formularioLocalService,
	ServiceWrapper<formularioLocalService> {
	public formularioLocalServiceWrapper(
		formularioLocalService formularioLocalService) {
		_formularioLocalService = formularioLocalService;
	}

	/**
	* Adds the formulario to the database. Also notifies the appropriate model listeners.
	*
	* @param formulario the formulario
	* @return the formulario that was added
	*/
	@Override
	public com.jbaricot.formulario.model.formulario addformulario(
		com.jbaricot.formulario.model.formulario formulario) {
		return _formularioLocalService.addformulario(formulario);
	}

	/**
	* Creates a new formulario with the primary key. Does not add the formulario to the database.
	*
	* @param formularioId the primary key for the new formulario
	* @return the new formulario
	*/
	@Override
	public com.jbaricot.formulario.model.formulario createformulario(
		long formularioId) {
		return _formularioLocalService.createformulario(formularioId);
	}

	/**
	* Deletes the formulario from the database. Also notifies the appropriate model listeners.
	*
	* @param formulario the formulario
	* @return the formulario that was removed
	*/
	@Override
	public com.jbaricot.formulario.model.formulario deleteformulario(
		com.jbaricot.formulario.model.formulario formulario) {
		return _formularioLocalService.deleteformulario(formulario);
	}

	/**
	* Deletes the formulario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param formularioId the primary key of the formulario
	* @return the formulario that was removed
	* @throws PortalException if a formulario with the primary key could not be found
	*/
	@Override
	public com.jbaricot.formulario.model.formulario deleteformulario(
		long formularioId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _formularioLocalService.deleteformulario(formularioId);
	}

	@Override
	public com.jbaricot.formulario.model.formulario fetchformulario(
		long formularioId) {
		return _formularioLocalService.fetchformulario(formularioId);
	}

	/**
	* Returns the formulario matching the UUID and group.
	*
	* @param uuid the formulario's UUID
	* @param groupId the primary key of the group
	* @return the matching formulario, or <code>null</code> if a matching formulario could not be found
	*/
	@Override
	public com.jbaricot.formulario.model.formulario fetchformularioByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _formularioLocalService.fetchformularioByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the formulario with the primary key.
	*
	* @param formularioId the primary key of the formulario
	* @return the formulario
	* @throws PortalException if a formulario with the primary key could not be found
	*/
	@Override
	public com.jbaricot.formulario.model.formulario getformulario(
		long formularioId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _formularioLocalService.getformulario(formularioId);
	}

	/**
	* Returns the formulario matching the UUID and group.
	*
	* @param uuid the formulario's UUID
	* @param groupId the primary key of the group
	* @return the matching formulario
	* @throws PortalException if a matching formulario could not be found
	*/
	@Override
	public com.jbaricot.formulario.model.formulario getformularioByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _formularioLocalService.getformularioByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the formulario in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param formulario the formulario
	* @return the formulario that was updated
	*/
	@Override
	public com.jbaricot.formulario.model.formulario updateformulario(
		com.jbaricot.formulario.model.formulario formulario) {
		return _formularioLocalService.updateformulario(formulario);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _formularioLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _formularioLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _formularioLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _formularioLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _formularioLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _formularioLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of formularios.
	*
	* @return the number of formularios
	*/
	@Override
	public int getformulariosCount() {
		return _formularioLocalService.getformulariosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _formularioLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _formularioLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.jbaricot.formulario.model.impl.formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _formularioLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.jbaricot.formulario.model.impl.formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _formularioLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the formularios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.jbaricot.formulario.model.impl.formularioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @return the range of formularios
	*/
	@Override
	public java.util.List<com.jbaricot.formulario.model.formulario> getformularios(
		int start, int end) {
		return _formularioLocalService.getformularios(start, end);
	}

	/**
	* Returns all the formularios matching the UUID and company.
	*
	* @param uuid the UUID of the formularios
	* @param companyId the primary key of the company
	* @return the matching formularios, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.jbaricot.formulario.model.formulario> getformulariosByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _formularioLocalService.getformulariosByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of formularios matching the UUID and company.
	*
	* @param uuid the UUID of the formularios
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of formularios
	* @param end the upper bound of the range of formularios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching formularios, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.jbaricot.formulario.model.formulario> getformulariosByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.jbaricot.formulario.model.formulario> orderByComparator) {
		return _formularioLocalService.getformulariosByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _formularioLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _formularioLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public formularioLocalService getWrappedService() {
		return _formularioLocalService;
	}

	@Override
	public void setWrappedService(formularioLocalService formularioLocalService) {
		_formularioLocalService = formularioLocalService;
	}

	private formularioLocalService _formularioLocalService;
}