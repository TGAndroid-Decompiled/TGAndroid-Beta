package org.webrtc;

import java.util.IdentityHashMap;
import java.util.Iterator;

public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap<VideoSink, Long> sinks;

    public VideoTrack(long j) {
        super(j);
        this.sinks = new IdentityHashMap<>();
    }

    private static native void nativeAddSink(long j, long j2);

    private static native void nativeFreeSink(long j);

    private static native void nativeRemoveSink(long j, long j2);

    private static native long nativeWrapSink(VideoSink videoSink);

    public void addSink(VideoSink videoSink) {
        if (videoSink == null) {
            throw new IllegalArgumentException("The VideoSink is not allowed to be null");
        }
        if (this.sinks.containsKey(videoSink)) {
            return;
        }
        long nativeWrapSink = nativeWrapSink(videoSink);
        this.sinks.put(videoSink, Long.valueOf(nativeWrapSink));
        nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
    }

    @Override
    public void dispose() {
        Iterator<Long> it = this.sinks.values().iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            nativeRemoveSink(getNativeMediaStreamTrack(), longValue);
            nativeFreeSink(longValue);
        }
        this.sinks.clear();
        super.dispose();
    }

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(VideoSink videoSink) {
        Long remove = this.sinks.remove(videoSink);
        if (remove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), remove.longValue());
            nativeFreeSink(remove.longValue());
        }
    }
}
