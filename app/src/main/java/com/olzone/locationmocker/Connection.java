package com.olzone.locationmocker;

import android.util.Log;

import org.java_websocket.WebSocket;

import java.util.Observable;

/**
 * Created by Olek on 2015-07-26.
 */
public class Connection extends Observable {
    final int port = 36969;
    private static Connection connection = null;
    private Socket socket = null;

    private Connection () {
        socket = new Socket(port){
            public void onMessage(WebSocket conn, String message) {
                Log.d("MOCKERLOG", message);
                setChanged();
                notifyObservers(message);
            }
        };
        socket.start();
    }

    public static Connection getInstance() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}
