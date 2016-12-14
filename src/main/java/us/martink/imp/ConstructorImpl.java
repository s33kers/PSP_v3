package us.martink.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import us.martink.interfaces.AnotherService;
import us.martink.interfaces.InnerService;
import us.martink.interfaces.MainBean;
import us.martink.interfaces.OtherService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by tadas on 2016-12-14.
 */
public class ConstructorImpl implements MainBean {

    @Autowired
    OtherService otherService;
    @Autowired
    @Qualifier("personBean1")
    AnotherService anotherService;
    InnerService constructorBean;


    public ConstructorImpl(InnerService constructorService) {
        this.constructorBean = constructorService;
    }

    public void justDoIt() {
        constructorBean.getName();
        otherService.doNothing();
        anotherService.knockKnock();
    }

    @PostConstruct
    public void initIt() throws Exception {
        System.out.println("Init method after properties are set.");
    }

    @PreDestroy
    public void cleanUp() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }
}
