package com.intrinio.common;

/**
 * Intrinio Account type with limits. (resetting at midnight Eastern)
 */
public enum AccountType {
    INDIVIDUAL(5000), PROFESSIONAL(25000), STARTUP(100000), ENTERPRISE(-1),DEVELOPER(5000), FREE(500);

    /**
     * Daily API Call Limit.
     * -1 = Unlimited
     */
    private final int DAILY_CALL_LIMIT;
    /**
     * Requests-per-second limit.
     */
    private final int THROTTLE_LIMIT = 500; //TODO: Limits should be Subscription specific
    /**
     * 10-Minute Call Limits
     * Some data feed subscriptions have limited 10-minute usage. This means that you can make up to a certain number of API calls in a 10-minute period.
     */
    private final int TEN_MINUTES_LIMIT = 500; //TODO: Limits should be Subscription specific

    AccountType(int DAILY_CALL_LIMIT) {
        this.DAILY_CALL_LIMIT = DAILY_CALL_LIMIT;
    }

    public int getDailyCallLimit() {
        return DAILY_CALL_LIMIT;
    }
}
