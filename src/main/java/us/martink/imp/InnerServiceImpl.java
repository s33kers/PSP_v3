package us.martink.imp;

import us.martink.interfaces.InnerService;

/**
 * Created by tadas
 */
public class InnerServiceImpl implements InnerService {
    public void getName() {
        System.out.println(getClass().getName());
    }
}
