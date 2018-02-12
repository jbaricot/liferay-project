package com.liferay.suma.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

@Component (immediate = true, property = {"javax.portlet.name=com_liferay_suma_portlet_SumaMvcPortlet", 
		"mvc.command.name=vizualizar"}, service = MVCActionCommand.class)



public class VizualizarMvcActionCommand extends BaseMVCActionCommand {

	@Override 
	
	protected void doProcessAction(ActionRequest request, ActionResponse response){
		System.out.println("**********");  
		String variable = ParamUtil.getString(request, "numero");
		System.out.println("La variable es: " + variable);
		request.setAttribute("cosa", variable+"complementado");
	}
	
}
