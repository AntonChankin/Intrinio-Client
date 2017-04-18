package com.intrinio.common;

/**
 * Intrinio uses normal HTTP response codes to indicate the success or failure of an API request.
 * A response code of 200 indicates success and codes in the 4xx range indicate an error that failed given
 * the information provided, and codes in the 5xx range indicate an error with Intrinio’s servers (these are rare).
 */
public enum ResponseCodes {
    /** OK – Everything worked as expected */
    OK(200),
    /** Unauthorized – Your User/Password API Keys are incorrect */
    UNAUTHORIZED(401),
    /** Forbidden – You are not subscribed to the data feed requested */
    FORBIDDEN(403),
    /** Not Found – The end point requested is not available */
    NOT_FOUND(404),
    /** Too Many Requests – You have hit a limit. */
    TOO_MANY_REQUESTS(429),
    /** Internal Server Error – We had a problem with our server. Try again later. */
    INTERNAL_SERVER_ERROR(500),
    /** Service Unavailable – You have hit your throttle limit or Intrinio may be experiencing difficulties. */
    SERVICE_UNAVAILABLE(503);

    private final int code;

    ResponseCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
