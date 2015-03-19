package org.openntf.uikit.renderer;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

public class Panel extends Renderer {

	@Override
	public void encodeBegin(final FacesContext context, final UIComponent component) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.startElement("div", null);
		writer.writeAttribute("id", component.getClientId(context), null);
		writer.writeAttribute("class", "uk-panel uk-panel-box", null);
		if (component.getAttributes().get("title") != null) {
			writer.startElement("h3", null);
			writer.writeAttribute("class", "uk-panel-title", null);
			writer.write((String) component.getAttributes().get("title"));
			writer.endElement("h3");
		}

	}

	@Override
	public void encodeChildren(final FacesContext context, final UIComponent component) throws IOException {
		super.encodeChildren(context, component);
	}

	@Override
	public void encodeEnd(final FacesContext context, final UIComponent component) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.endElement("div");
	}

}
