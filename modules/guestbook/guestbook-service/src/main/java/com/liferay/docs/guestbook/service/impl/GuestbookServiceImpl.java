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

package com.liferay.docs.guestbook.service.impl;

import com.liferay.docs.guestbook.exception.GuestbookNameException;
import com.liferay.docs.guestbook.model.Guestbook;
import com.liferay.docs.guestbook.service.base.GuestbookServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the guestbook remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.docs.guestbook.service.GuestbookService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author liferay
 * @see GuestbookServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=gb",
		"json.web.service.context.path=Guestbook"
	},
	service = AopService.class
)
public class GuestbookServiceImpl extends GuestbookServiceBaseImpl {


	@Override
	public Guestbook addGuestbook(long userId, String name, ServiceContext serviceContext) throws PortalException {
		return null;
	}

	@Override
	public List<Guestbook> getGuestbooks(long groupId) {
		return null;
	}

	@Override
	public List<Guestbook> getGuestbooks(long groupId, int start, int end) {
		return null;
	}

	@Override
	public List<Guestbook> getGuestbooks(long groupId, int start, int end, OrderByComparator<Guestbook> obc) {
		return null;
	}

	@Override
	public int getGuestbooksCount(long groupId) {
		return 0;
	}
}