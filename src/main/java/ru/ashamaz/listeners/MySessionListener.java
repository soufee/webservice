package ru.ashamaz.listeners;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {
    static final Logger userLogger = LogManager.getLogger(MySessionListener.class);

    public void sessionCreated(HttpSessionEvent se) {
        userLogger.debug("Логгер работает! = " + se.getSession().getId());
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }
}
