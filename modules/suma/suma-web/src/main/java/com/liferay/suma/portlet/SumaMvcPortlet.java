package com.liferay.suma.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=suma-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.name=com_liferay_suma_portlet_SumaMvcPortlet"
	},
	service = Portlet.class
)
public class SumaMvcPortlet extends MVCPortlet {
	
	@Override
	
	public void render(RenderRequest renderResquest, RenderResponse renderResponse ) throws IOException, PortletException{
		String variable = ParamUtil.getString(renderResquest, "numero");
		renderResquest.setAttribute("variable", variable);
		super.render(renderResquest, renderResponse);
	}
	
}		
		
	
	
	
