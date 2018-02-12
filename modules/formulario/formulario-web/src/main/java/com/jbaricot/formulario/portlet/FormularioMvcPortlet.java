package com.jbaricot.formulario.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * @author jbari
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=formulario-web Portlet",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=com_jbaricot_formulario_portlet_FormularioMvcPortlet",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, 

service = Portlet.class)


public class FormularioMvcPortlet extends MVCPortlet {
	
@Override
	
	public void render(RenderRequest renderResquest, RenderResponse renderResponse ) throws IOException, PortletException{
		String variable =  ParamUtil.getString(renderResquest, "numero1");
		String variable2 =  ParamUtil.getString(renderResquest, "numero2");	
		renderResquest.setAttribute("variable", variable);
		renderResquest.setAttribute("variable2", variable2);
		super.render(renderResquest, renderResponse);
		
		
	}
	
}