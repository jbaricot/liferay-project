package com.jbaricot.formulario.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component (immediate = true, property = {
		"javax.portlet.name=com_jbaricot_formulario_portlet_FormularioMvcPortlet", 
		"mvc.command.name=vizualizar"}, 
service = MVCActionCommand.class)



public class VizualizarMvcActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
