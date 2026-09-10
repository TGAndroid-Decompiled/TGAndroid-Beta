package yc;
public enum f {
    TOO_MANY_REQUESTS(101, "Switching Protocols"),
    OK(200, "OK"),
    PRECONDITION_FAILED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(204, "No Content"),
    PARTIAL_CONTENT(206, "Partial Content"),
    MULTI_STATUS(207, "Multi-Status"),
    REDIRECT(301, "Moved Permanently"),
    FOUND(302, "Found"),
    REDIRECT_SEE_OTHER(303, "See Other"),
    NOT_MODIFIED(304, "Not Modified"),
    TEMPORARY_REDIRECT(307, "Temporary Redirect"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    TOO_MANY_REQUESTS(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    PRECONDITION_FAILED(405, "Method Not Allowed"),
    TOO_MANY_REQUESTS(406, "Not Acceptable"),
    EXPECTATION_FAILED(408, "Request Timeout"),
    PRECONDITION_FAILED(409, "Conflict"),
    TOO_MANY_REQUESTS(410, "Gone"),
    EXPECTATION_FAILED(411, "Length Required"),
    PRECONDITION_FAILED(412, "Precondition Failed"),
    TOO_MANY_REQUESTS(413, "Payload Too Large"),
    EXPECTATION_FAILED(415, "Unsupported Media Type"),
    TOO_MANY_REQUESTS(416, "Requested Range Not Satisfiable"),
    EXPECTATION_FAILED(417, "Expectation Failed"),
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    INTERNAL_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");
    
    public final int f46837a;
    public final String f46838b;

    f(int i10, String str) {
        this.f46837a = i10;
        this.f46838b = str;
    }
}
