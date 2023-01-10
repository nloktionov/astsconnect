package ru.nloktionov.astsconnect;

import com.micex.client.API;
import com.micex.client.Client;
import com.micex.client.ClientException;

import java.util.HashMap;
import java.util.Map;

import static ru.nloktionov.astsconnect.util.Constants.HOST;
import static ru.nloktionov.astsconnect.util.Constants.INTERFACE;
import static ru.nloktionov.astsconnect.util.Constants.PASSWORD;
import static ru.nloktionov.astsconnect.util.Constants.PREFERRED_HOST;
import static ru.nloktionov.astsconnect.util.Constants.SERVER;
import static ru.nloktionov.astsconnect.util.Constants.USER_ID;

public class Main {
    public static void main(String[] args) {
        loadDlls();
        Client client = connect(params());

        // Print some info about server connected to
        API.ServerInfo serverInfo = client.getServerInfo();
        System.out.printf("SystemId=%s, SessionId=%d, UserId=%s%n", serverInfo.systemID, serverInfo.sessionID, serverInfo.userID);
    }

    public static Client connect(Map<String, String> params) {
        Client client = new Client();
        try {
            client.start(params);
        } catch (ClientException e) {
            throw new RuntimeException(e);
        }
        return client;
    }

    public static Map<String, String> params() {
        Map<String, String> params = new HashMap<>();
        params.put(HOST.getKey(), HOST.getValue());
        params.put(PREFERRED_HOST.getKey(), PREFERRED_HOST.getValue());
        params.put(SERVER.getKey(), SERVER.getValue());
        params.put(USER_ID.getKey(), USER_ID.getValue());
        params.put(INTERFACE.getKey(), INTERFACE.getValue());
        params.put(PASSWORD.getKey(), PASSWORD.getValue());
        return params;
    }

    public static void loadDlls() {
        System.loadLibrary("bzip2");
        System.loadLibrary("libcrypto-1_1-x64");
        System.loadLibrary("libssl-1_1-x64");
        System.loadLibrary("mtesrl64");
        System.loadLibrary("mtejni");
    }
}
