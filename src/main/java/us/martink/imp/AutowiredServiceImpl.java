package us.martink.imp;

import us.martink.interfaces.OtherService;

/**
 * Created by tadas on 2016-12-14.
 */
public class AutowiredServiceImpl implements OtherService {
    public void doNothing() {
        System.out.println("Doning nothing");
    }
}
