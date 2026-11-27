package org.webrtc;
public class TimestampAligner {
    private final NativeLifecycleLock lifecycleLock;

    public interface Natives {
        long createTimestampAligner(long j);

        void releaseTimestampAligner(long j);

        long translateTimestamp(long j, long j2);
    }

    public TimestampAligner(Environment environment) {
        this.lifecycleLock = new NativeLifecycleLock("TimestampAligner", TimestampAlignerJni.get().createTimestampAligner(environment.ref()));
    }

    public static void a(long j) {
        lambda$dispose$1(j);
    }

    @Deprecated
    public static long getRtcTimeNanos() {
        return Environment.builder().build().getCurrentTimeNanos();
    }

    public static void lambda$dispose$1(long j) {
        TimestampAlignerJni.get().releaseTimestampAligner(j);
    }

    public static Long lambda$translateTimestamp$0(long j, long j2) {
        return Long.valueOf(TimestampAlignerJni.get().translateTimestamp(j2, j));
    }

    public void dispose() {
        this.lifecycleLock.dispose(new grb((byte) 2));
    }

    public long translateTimestamp(long j) {
        return ((Long) this.lifecycleLock.call(new h40((byte) 6, j))).longValue();
    }

    @Deprecated
    public TimestampAligner() {
        this(Environment.builder().build());
    }
}
