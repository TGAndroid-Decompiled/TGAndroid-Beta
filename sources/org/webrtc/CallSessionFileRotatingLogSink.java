package org.webrtc;

import org.webrtc.Logging;
public class CallSessionFileRotatingLogSink {
    private final NativeLifecycleLock lifecycleLock;

    public interface Natives {
        long addSink(String str, int i, int i2);

        void deleteSink(long j);

        byte[] getLogData(String str);
    }

    public CallSessionFileRotatingLogSink(String str, int i, Logging.Severity severity) {
        if (str != null) {
            this.lifecycleLock = new NativeLifecycleLock("CallSessionFileRotatingLogSink", CallSessionFileRotatingLogSinkJni.get().addSink(str, i, severity.ordinal()));
        } else {
            lq5.j("dirPath may not be null.");
            throw null;
        }
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return CallSessionFileRotatingLogSinkJni.get().getLogData(str);
        }
        lq5.j("dirPath may not be null.");
        return null;
    }

    public static void lambda$dispose$0(long j) {
        CallSessionFileRotatingLogSinkJni.get().deleteSink(j);
    }

    public void dispose() {
        this.lifecycleLock.dispose(new rm0((byte) 17));
    }
}
