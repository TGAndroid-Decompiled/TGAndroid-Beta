package org.webrtc;
public class MediaStreamTrack {
    public static final String AUDIO_TRACK_KIND = "audio";
    public static final String VIDEO_TRACK_KIND = "video";
    final NativeLifecycleLock lifecycleLock;

    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);
        
        private final int nativeIndex;

        MediaType(int i) {
            this.nativeIndex = i;
        }

        public static MediaType fromNativeIndex(int i) {
            MediaType[] values;
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i) {
                    return mediaType;
                }
            }
            lq5.j(uh9.k(i, "Unknown native media type: "));
            return null;
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public interface Natives {
        boolean getEnabled(long j);

        String getId(long j);

        String getKind(long j);

        State getState(long j);

        boolean setEnabled(long j, boolean z);
    }

    public enum State {
        LIVE,
        ENDED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaStreamTrack(long j) {
        if (j != 0) {
            this.lifecycleLock = new NativeLifecycleLock("MediaStreamTrack", j);
        } else {
            lq5.j("nativeTrack may not be null");
            throw null;
        }
    }

    public static String a(long j) {
        return lambda$id$0(j);
    }

    public static String b(long j) {
        return lambda$kind$1(j);
    }

    public static Boolean c(long j) {
        return lambda$enabled$2(j);
    }

    public static MediaStreamTrack createMediaStreamTrack(long j) {
        if (j == 0) {
            return null;
        }
        String kind = MediaStreamTrackJni.get().getKind(j);
        if (kind.equals("audio")) {
            return new AudioTrack(j);
        }
        if (!kind.equals("video")) {
            return null;
        }
        return new VideoTrack(j);
    }

    public static State d(long j) {
        return lambda$state$4(j);
    }

    public static Boolean lambda$enabled$2(long j) {
        return Boolean.valueOf(MediaStreamTrackJni.get().getEnabled(j));
    }

    public static String lambda$id$0(long j) {
        return MediaStreamTrackJni.get().getId(j);
    }

    public static String lambda$kind$1(long j) {
        return MediaStreamTrackJni.get().getKind(j);
    }

    public static Boolean lambda$setEnabled$3(boolean z, long j) {
        return Boolean.valueOf(MediaStreamTrackJni.get().setEnabled(j, z));
    }

    public static State lambda$state$4(long j) {
        return MediaStreamTrackJni.get().getState(j);
    }

    public void dispose() {
        this.lifecycleLock.dispose(new da3((byte) 28));
    }

    public boolean enabled() {
        return ((Boolean) this.lifecycleLock.call(new hz6((byte) 7))).booleanValue();
    }

    public long getNativeMediaStreamTrack() {
        return this.lifecycleLock.getNativePointer();
    }

    public String id() {
        return (String) this.lifecycleLock.call(new hz6((byte) 10));
    }

    public String kind() {
        return (String) this.lifecycleLock.call(new hz6((byte) 9));
    }

    public boolean setEnabled(boolean z) {
        return ((Boolean) this.lifecycleLock.call(new k64((byte) 6, z))).booleanValue();
    }

    public State state() {
        return (State) this.lifecycleLock.call(new hz6((byte) 8));
    }
}
