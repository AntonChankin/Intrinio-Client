package net.gotei.intrinio.common;

/**
 * Intrinio Account type with limits.
 */
public enum AccountType {
    INDIVIDUAL(5000), PROFESSIONAL(25000), STARTUP(100000), ENTERPRISE(-1),DEVELOPER(5000), FREE(500);

    /**
     * Daily API Call Limit.
     * -1 = Unlimited
     */
    private final int DAILY_CALL_LIMIT;

    AccountType(int DAILY_CALL_LIMIT) {
        this.DAILY_CALL_LIMIT = DAILY_CALL_LIMIT;
    }

    public int getDailyCallLimit() {
        return DAILY_CALL_LIMIT;
    }
}
