package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

public class EventSort {
    static ArrayList<UserEvents> users = new ArrayList<>();
    static HashMap<Integer, Integer> sort = new HashMap<>();
    static ArrayList<Integer> sortData = new ArrayList<>();
    static ArrayList<UserEvents> EventsSorted = new ArrayList<>();

    Date curentDate = new Date();
    int currentdate = curentDate.getDate();
    Date date;

    public EventSort(UserEvents userEvents) {
        users.add(userEvents);
    }

    public void sortEvents() {
        for (int i = 0; i < users.size(); i++) {
            UserEvents u1 = users.get(i);
            Date date = u1.getEventInfo().getDate2();
            int date_info = date.getDate();
            sort.put(i, date_info);
        }

        sortData.addAll(sort.keySet());
        Collections.sort(sortData);

        for (Integer sortDatum : sortData) {
            for (UserEvents userEvents : users) {
                Date date = userEvents.getEventInfo().getDate2();
                int compareDare = date.getDate();
                if (sortDatum == compareDare) {
                    EventsSorted.add(userEvents);
                }
            }
        }
    }

    public void print_today_events(){
        for(int i = 0; i < EventsSorted.size(); i++ ){
            UserEvents u1 = users.get(i);
            Date date = u1.getEventInfo().getDate2();
            int date_info = date.getDate();
            if(date_info == currentdate){
                System.out.println(" [ID_event " + u1.getEventInfo().idEvent + " ] " +
                        " [ User = " + u1.getName() +
                        " [ Event = " + u1.getEventInfo().getEventProducer().getEventData() +
                        " [ Date = " + u1.getEventInfo().getDate()
                );
            }
        }
    }
}
