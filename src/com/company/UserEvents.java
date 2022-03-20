package com.company;

public class UserEvents {
    String name;
    EventInfo eventInfo;

    public UserEvents(String name, EventInfo eventInfo) {
        this.name = name;
        this.eventInfo = eventInfo;
    }

    public String getName() {
        return name;
    }

    public EventInfo getEventInfo() {
        return eventInfo;
    }
}

