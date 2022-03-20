package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EventInfo {
    Date date;
    int idEvent;
    EventProducer eventProducer;

    public EventInfo(Date date, int idEvent, EventProducer eventProducer) {
        this.date = date;
        this.idEvent = idEvent;
        this.eventProducer = eventProducer;
    }

    public Date getDate2() {
        return date;
    }


    public String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatter.format(date);
    }

    public Date setDate(Date date) {
        this.date = date;
        return date;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public EventProducer getEventProducer() {
        return eventProducer;
    }
}
