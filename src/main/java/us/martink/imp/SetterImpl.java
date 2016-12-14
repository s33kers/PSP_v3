package us.martink.imp;

import us.martink.interfaces.InnerService;
import us.martink.interfaces.MainBean;

/**
 * Created by tadas
 */
public class SetterImpl implements MainBean {

    InnerService setterBean;

    public void justDoIt() {
        setterBean.getName();
    }

    public void setSetterBean(InnerService setterBean) {
        this.setterBean = setterBean;
    }
}
