package org.webrtc;
public class RtcError {
    private final RtcException error;

    private RtcError(RtcException rtcException) {
        this.error = rtcException;
    }

    public static RtcError error(String str) {
        return new RtcError(new RtcException(str));
    }

    public static RtcError success() {
        return new RtcError(null);
    }

    public boolean isError() {
        if (this.error != null) {
            return true;
        }
        return false;
    }

    public boolean isSuccess() {
        if (this.error == null) {
            return true;
        }
        return false;
    }

    public void throwError() {
        RtcException rtcException = this.error;
        if (rtcException == null) {
            return;
        }
        throw rtcException;
    }

    public RtcException error() {
        return this.error;
    }
}
