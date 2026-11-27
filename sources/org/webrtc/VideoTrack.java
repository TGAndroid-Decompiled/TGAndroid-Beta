package org.webrtc;

import java.util.IdentityHashMap;
public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap<VideoSink, Long> sinks;

    public interface Natives {
        void addSink(long j, long j2);

        void freeSink(long j);

        void removeSink(long j, long j2);

        long wrapSink(VideoSink videoSink);
    }

    public VideoTrack(long j) {
        super(j);
        this.sinks = new IdentityHashMap<>();
    }

    public void lambda$addSink$0(VideoSink videoSink, long j) {
        synchronized (this.sinks) {
            if (!this.sinks.containsKey(videoSink)) {
                long wrapSink = VideoTrackJni.get().wrapSink(videoSink);
                this.sinks.put(videoSink, Long.valueOf(wrapSink));
                VideoTrackJni.get().addSink(j, wrapSink);
            }
        }
    }

    public void lambda$dispose$2(long j) {
        synchronized (this.sinks) {
            for (Long l : this.sinks.values()) {
                long longValue = l.longValue();
                VideoTrackJni.get().removeSink(j, longValue);
                VideoTrackJni.get().freeSink(longValue);
            }
            this.sinks.clear();
        }
        JniCommon.nativeReleaseRef(j);
    }

    public void lambda$removeSink$1(VideoSink videoSink, long j) {
        synchronized (this.sinks) {
            Long remove = this.sinks.remove(videoSink);
            if (remove != null) {
                VideoTrackJni.get().removeSink(j, remove.longValue());
                VideoTrackJni.get().freeSink(remove.longValue());
            }
        }
    }

    public void addSink(VideoSink videoSink) {
        if (videoSink != null) {
            this.lifecycleLock.run(new sgc(this, videoSink, (byte) 1));
        } else {
            lq5.j("The VideoSink is not allowed to be null");
        }
    }

    @Override
    public void dispose() {
        this.lifecycleLock.dispose(new ftb(this, (byte) 12));
    }

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(VideoSink videoSink) {
        this.lifecycleLock.runIfAlive(new sgc(this, videoSink, (byte) 0));
    }
}
