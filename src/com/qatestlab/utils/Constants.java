package com.qatestlab.utils;

public class Constants {
    public static final String PAGES_PACKAGE_NAME = "pages";

    public static final int ELEMENT_MEGA_EXTRALONG_TIMEOUT_SECONDS = 360;
    public static final int ELEMENT_EXTRALONG_TIMEOUT_SECONDS = 180;
    public static final int ELEMENT_LONG_TIMEOUT_SECONDS = 120;
    public static       int ELEMENT_TIMEOUT_SECONDS = 15;      //not final because it's overridden in Jira-3792
    public static final int ELEMENT_SMALL_TIMEOUT_SECONDS = 15;
    public static final int ELEMENT_EXTRASMALL_TIMEOUT_SECONDS = 5;
    public static final int ELEMENT_MICRO_TIMEOUT_SECONDS = 2;

    public static final int SCROLL_VALUE = 50;

    public static final String TESTLINK_DEV_KEY = "insert key here";
    public static final String TESTLINK_API_URL = "http://ng-testlink.mailordercentral.com/lib/api/xmlrpc/v1/xmlrpc.php";
    public static boolean TESTLINK_ENABLED = true;

    public static       String BASE_URL = System.getProperty("baseurl", "http://www.ask.fm/");  // Debug server by default. Needed change value before test execution
}
