package ru.nloktionov.astsconnect.util;

import java.util.AbstractMap;
import java.util.Map;

public class Constants {
    public static final Map.Entry<String, String> HOST =
            new AbstractMap.SimpleEntry<>("HOST", "91.208.232.161:15024,91.208.232.162.15024");
    public static final Map.Entry<String, String> PREFERRED_HOST =
            new AbstractMap.SimpleEntry<>("PREFFEREDHOST", "91.208.232.161:15024");
    public static final Map.Entry<String, String> SERVER =
            new AbstractMap.SimpleEntry<>("SERVER", "EQ_UAT");

    public static final Map.Entry<String, String> INTERFACE =
            new AbstractMap.SimpleEntry<>("INTERFACE", "IFCBroker_26");

    public static final Map.Entry<String, String> USER_ID =
            new AbstractMap.SimpleEntry<>("USERID", "MU9861300001");

    public static final Map.Entry<String, String> PASSWORD =
            new AbstractMap.SimpleEntry<>("PASSWORD", "2143");
}
