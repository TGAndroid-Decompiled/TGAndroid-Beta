package org.webrtc;
public class TimestampAligner {
    private volatile long nativeTimestampAligner = nativeCreateTimestampAligner();

    private void checkNativeAlignerExists() {
        if (this.nativeTimestampAligner != 0) {
            return;
        }
        throw new IllegalStateException("TimestampAligner has been disposed.");
    }

    public static long getRtcTimeNanos() {
        return nativeRtcTimeNanos();
    }

    private static native long nativeCreateTimestampAligner();

    private static native void nativeReleaseTimestampAligner(long j3);

    private static native long nativeRtcTimeNanos();

    private static native long nativeTranslateTimestamp(long j3, long j10);

    public void dispose() {
        checkNativeAlignerExists();
        nativeReleaseTimestampAligner(this.nativeTimestampAligner);
        this.nativeTimestampAligner = 0L;
    }

    public long translateTimestamp(long j3) {
        checkNativeAlignerExists();
        return nativeTranslateTimestamp(this.nativeTimestampAligner, j3);
    }
}
