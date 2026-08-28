package org.webrtc;

import org.webrtc.Logging;
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public CallSessionFileRotatingLogSink(String str, int i9, Logging.Severity severity) {
        if (str != null) {
            this.nativeSink = nativeAddSink(str, i9, severity.ordinal());
            return;
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    private static native long nativeAddSink(String str, int i9, int i10);

    private static native void nativeDeleteSink(long j10);

    private static native byte[] nativeGetLogData(String str);

    public void dispose() {
        long j10 = this.nativeSink;
        if (j10 != 0) {
            nativeDeleteSink(j10);
            this.nativeSink = 0L;
        }
    }
}
