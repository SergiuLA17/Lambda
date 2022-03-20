package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Main {
    static Random random = new Random();
    static ArrayList<EventProducer> EventList = new ArrayList<>();
    static ArrayList<UserEvents> Users = new ArrayList<>();
    static EventSort eventSort ;
    public static void main(String[] args) {
        generateEvents();
        EventInfo();
        System.out.println("My events");
        prtintMyEvents(30);
        System.out.println("Event sorted");
        print_sorted_events();
        System.out.println("Today events");
        eventSort.print_today_events();

    }

    static public void EventInfo() {
        for (int i = 0; i < 30; i++) {
            EventProducer p2 = EventList.get(random.nextInt(100));
            Users.add(new UserEvents("User" + i, new EventInfo(new Date(), i, p2)));
        }
    }

    static public void generateEvents() {
        for (int i = 0; i <= 100; i++) {
            EventList.add(new EventProducer(random.nextInt(10000)));
            if (i == 100) {
                System.out.println("All events generated!");
            }
        }
    }


    static public void prtintMyEvents(int numEvents) {
        for (int i = 0; i < numEvents; i++) {
            Date date = new Date(2022, Calendar.MARCH, random.nextInt(21), random.nextInt(23), random.nextInt(59));
            UserEvents u1 = Users.get(i);
            u1.getEventInfo().setDate(date);
            eventSort = new EventSort(u1);
            System.out.println("[ ID_event = " + u1.getEventInfo().getIdEvent() + " ] [ User = "
                    + u1.getName() + "] [ Event = "
                    + u1.getEventInfo().getEventProducer().getEventData() + " ] [ Date = "
                    + u1.getEventInfo().getDate() + "]");
        }
    }

    static public void print_sorted_events() {
        System.out.println(EventSort.EventsSorted.size() + " " + EventSort.sort.size() + " " + EventSort.users.size() + " " +
                EventSort.sortData.size());
        eventSort.sortEvents();
        for (int i = 0; i < EventSort.EventsSorted.size(); i++) {
            UserEvents u1 = EventSort.EventsSorted.get(i);

            System.out.println(" [ID_event " + u1.getEventInfo().idEvent + " ] " +
                    " [ User = " + u1.getName() +
                    " [ Event = " + u1.getEventInfo().getEventProducer().getEventData() +
                    " [ Date = " + u1.getEventInfo().getDate()
            );
        }
    }
}
