package com.example.parsec_generated;

public class ResourceException extends RuntimeException {
    public final static int OK = 200;
    public final static int CREATED = 201;
    public final static int ACCEPTED = 202;
    public final static int NO_CONTENT = 204;
    public final static int MOVED_PERMANENTLY = 301;
    public final static int FOUND = 302;
    public final static int SEE_OTHER = 303;
    public final static int NOT_MODIFIED = 304;
    public final static int TEMPORARY_REDIRECT = 307;
    public final static int BAD_REQUEST = 400;
    public final static int UNAUTHORIZED = 401;
    public final static int FORBIDDEN = 403;
    public final static int NOT_FOUND = 404;
    public final static int CONFLICT = 409;
    public final static int GONE = 410;
    public final static int PRECONDITION_FAILED = 412;
    public final static int UNSUPPORTED_MEDIA_TYPE = 415;
    public final static int INTERNAL_SERVER_ERROR = 500;
    public final static int NOT_IMPLEMENTED = 501;

    public final static int SERVICE_UNAVAILABLE = 503;

    public static String codeToString(int code) {
        switch (code) {
        case OK: return "OK";
        case CREATED: return "Created";
        case ACCEPTED: return "Accepted";
        case NO_CONTENT: return "No Content";
        case MOVED_PERMANENTLY: return "Moved Permanently";
        case FOUND: return "Found";
        case SEE_OTHER: return "See Other";
        case NOT_MODIFIED: return "Not Modified";
        case TEMPORARY_REDIRECT: return "Temporary Redirect";
        case BAD_REQUEST: return "Bad Request";
        case UNAUTHORIZED: return "Unauthorized";
        case FORBIDDEN: return "Forbidden";
        case NOT_FOUND: return "Not Found";
        case CONFLICT: return "Conflict";
        case GONE: return "Gone";
        case PRECONDITION_FAILED: return "Precondition Failed";
        case UNSUPPORTED_MEDIA_TYPE: return "Unsupported Media Type";
        case INTERNAL_SERVER_ERROR: return "Internal Server Error";
        case NOT_IMPLEMENTED: return "Not Implemented";
        default: return "" + code;
        }
    }

    int code;
    Object data;

    public ResourceException(int code) {
        this(code, new ResourceError().code(code).message(codeToString(code)));
    }

    public ResourceException(int code, Object data) {
        super("ResourceException (" + code + "): " + data);
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public <T> T getData(Class<T> cl) {
        return cl.cast(data);
    }

}