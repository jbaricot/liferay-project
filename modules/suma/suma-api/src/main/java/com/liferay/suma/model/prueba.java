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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the prueba service. Represents a row in the &quot;prueba_prueba&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see pruebaModel
 * @see com.liferay.suma.model.impl.pruebaImpl
 * @see com.liferay.suma.model.impl.pruebaModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.suma.model.impl.pruebaImpl")
@ProviderType
public interface prueba extends pruebaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.suma.model.impl.pruebaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<prueba, Long> PRUEBA_ID_ACCESSOR = new Accessor<prueba, Long>() {
			@Override
			public Long get(prueba prueba) {
				return prueba.getPruebaId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<prueba> getTypeClass() {
				return prueba.class;
			}
		};
}