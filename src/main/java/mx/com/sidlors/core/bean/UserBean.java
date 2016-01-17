package mx.com.sidlors.core.bean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	  @ManagedProperty(value="#{message}")
	  private MessageBean messageBean;

	  public void setMessageBean(MessageBean messageBean) {
	    this.messageBean = messageBean;
	  }

	  private String name;

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getSayWelcome(){
	    //check if null?
	    if("".equals(name) || name ==null){
	      return "";
	    }else{
	      return messageBean.getSayWelcome() + name;
	    }
	  }
  
}