package com.bignerdranch.android.bluetoothtestbed;

import java.util.UUID;

public class Constants {

    public static String SERVICE_STRING = "00000001-2670-4cd8-a661-5f2872398000";
    public static UUID SERVICE_UUID = UUID.fromString(SERVICE_STRING);

    public static String CHARACTERISTIC_ECHO_STRING = "00000002-2670-4cd8-a661-05f287239800";
    public static UUID CHARACTERISTIC_ECHO_UUID = UUID.fromString(CHARACTERISTIC_ECHO_STRING);

    public static String CHARACTERISTIC_TIME_STRING = "00000003-2670-4cd8-a661-05f287239800";
    public static UUID CHARACTERISTIC_TIME_UUID = UUID.fromString(CHARACTERISTIC_TIME_STRING);

    public static String CLIENT_CONFIGURATION_DESCRIPTOR_STRING = "00002902-0000-1000-8000-00805f9b34fb";
    public static UUID CLIENT_CONFIGURATION_DESCRIPTOR_UUID = UUID.fromString(CLIENT_CONFIGURATION_DESCRIPTOR_STRING);

    public static final String CLIENT_CONFIGURATION_DESCRIPTOR_SHORT_ID = "2902";

    public static final long SCAN_PERIOD = 5000;
}
