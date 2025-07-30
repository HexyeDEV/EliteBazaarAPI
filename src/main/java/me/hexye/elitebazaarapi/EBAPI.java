package me.hexye.elitebazaarapi;

import com.google.common.eventbus.EventBus;

public class EBAPI {
    private static final EventBus EVENT_BUS = new EventBus("EliteBazaarEventBus");

    public static EventBus getEventBus() {
        return EVENT_BUS;
    }
}
