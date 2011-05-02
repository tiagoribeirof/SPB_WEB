package br.com.spbweb.util;

import java.util.Iterator;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

@RequestScoped

public class FacesUtil {

	 private static FacesUtil facesUtil;
	
    public static FacesUtil getInstancia(){
    	 if(facesUtil== null){
    		 facesUtil = new FacesUtil();
    		 return facesUtil;
    	}else{
    		return facesUtil;
    	}
    	
    }
	
	public FacesUtil() {
		
	}
	
	public static void adicionaMensagemDeErro(String msg) {
		  FacesContext ctx = FacesContext.getCurrentInstance();  
		  ctx.addMessage(null, new FacesMessage(msg));
	
	}

	public static void adicionaMensagemDeInformacao(String msg) {
		  FacesContext ctx = FacesContext.getCurrentInstance();  
		  ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,msg,msg));
	}

	public boolean possuiMensagem(String msg) {
		  FacesContext ctx = FacesContext.getCurrentInstance();  
	   	  Iterator<FacesMessage> messages = ctx.getMessages();
		while (messages.hasNext()) {
			FacesMessage message = messages.next();
			boolean confere = message.getDetail().equals(msg);
			if (confere)
				return true;
		}
		return false;
	}
	
	/**
	 * Limpa os dados dos componentes de edição e de seus filhos,
	 * recursivamente. Checa se o componente é instância de EditableValueHolder
	 * e 'reseta' suas propriedades.
	 * <p>
	 * Quando este método, por algum motivo, não funcionar, parta para ignorância
	 * e limpe o componente assim:
	 * <p><blockquote><pre>
	 * 	component.getChildren().clear()
	 * </pre></blockquote>
	 * :-)
	 */
	public void cleanSubmittedValues(UIComponent component) {
		if (component instanceof EditableValueHolder) {
			EditableValueHolder evh = (EditableValueHolder) component;
			evh.setSubmittedValue(null);
			evh.setValue(null);
			evh.setLocalValueSet(false);
			evh.setValid(true);
		}
		if(component.getChildCount()>0){
			for (UIComponent child : component.getChildren()) {
				cleanSubmittedValues(child);
			}
		}
	}
	
}
