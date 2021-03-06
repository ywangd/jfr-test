/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.gmail.ywangd.jfrtest;

import jdk.jfr.Category;
import jdk.jfr.Event;
import jdk.jfr.Label;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    @Label("Hello World")
    @Category({"Sample", "My Custom Event"})
    static class HelloWorldEvent extends Event {
        @Label("My Message")
        String msg;
    }

    public static void main(String[] args) {
        HelloWorldEvent event = new HelloWorldEvent();
        event.msg = "Hello World event message!";
        event.commit();
        System.out.println(new App().getGreeting());
    }
}
