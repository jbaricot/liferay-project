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
 * Provides a wrapper for {@link formularioService}.
 *
 * @author Brian Wing Shun Chan
 * @see formularioService
 * @generated
 */
@ProviderType
public class formularioServiceWrapper implements formularioService,
	ServiceWrapper<formularioService> {
	public formularioServiceWrapper(formularioService formularioService) {
		_formularioService = formularioService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _formularioService.getOSGiServiceIdentifier();
	}

	@Override
	public formularioService getWrappedService() {
		return _formularioService;
	}

	@Override
	public void setWrappedService(formularioService formularioService) {
		_formularioService = formularioService;
	}

	private formularioService _formularioService;
}