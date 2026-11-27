package org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.NativeLifecycleLock;
public class MediaStream {
    private static final String TAG = "MediaStream";
    final NativeLifecycleLock lifecycleLock;
    public final List<AudioTrack> audioTracks = new ArrayList();
    public final List<VideoTrack> videoTracks = new ArrayList();
    public final List<VideoTrack> preservedVideoTracks = new ArrayList();

    public interface Natives {
        boolean addAudioTrackToNativeStream(long j, long j2);

        boolean addVideoTrackToNativeStream(long j, long j2);

        String getId(long j);

        boolean removeAudioTrack(long j, long j2);

        boolean removeVideoTrack(long j, long j2);
    }

    public MediaStream(long j) {
        this.lifecycleLock = new NativeLifecycleLock("MediaStream", j);
    }

    public static Boolean f(long j, long j2) {
        return lambda$removeTrack$8(j, j2);
    }

    public static String h(long j) {
        return lambda$getId$11(j);
    }

    public static void j(MediaStream mediaStream, long j) {
        mediaStream.lambda$dispose$10(j);
    }

    public static Boolean k(long j, long j2) {
        return lambda$removeTrack$6(j, j2);
    }

    public Boolean lambda$addPreservedTrack$4(long j, VideoTrack videoTrack, long j2) {
        if (MediaStreamJni.get().addVideoTrackToNativeStream(j, j2)) {
            this.preservedVideoTracks.add(videoTrack);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean lambda$addPreservedTrack$5(VideoTrack videoTrack, long j) {
        return (Boolean) videoTrack.lifecycleLock.call(new l07(this, j, videoTrack, (byte) 1));
    }

    public Boolean lambda$addTrack$0(long j, AudioTrack audioTrack, long j2) {
        if (MediaStreamJni.get().addAudioTrackToNativeStream(j, j2)) {
            this.audioTracks.add(audioTrack);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean lambda$addTrack$1(AudioTrack audioTrack, long j) {
        return (Boolean) audioTrack.lifecycleLock.call(new ps0(this, j, audioTrack, (byte) 5));
    }

    public Boolean lambda$addTrack$2(long j, VideoTrack videoTrack, long j2) {
        if (MediaStreamJni.get().addVideoTrackToNativeStream(j, j2)) {
            this.videoTracks.add(videoTrack);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean lambda$addTrack$3(VideoTrack videoTrack, long j) {
        return (Boolean) videoTrack.lifecycleLock.call(new l07(this, j, videoTrack, (byte) 0));
    }

    public void lambda$dispose$10(long j) {
        while (!this.audioTracks.isEmpty()) {
            AudioTrack audioTrack = this.audioTracks.get(0);
            removeTrack(audioTrack);
            audioTrack.dispose();
        }
        while (!this.videoTracks.isEmpty()) {
            VideoTrack videoTrack = this.videoTracks.get(0);
            removeTrack(videoTrack);
            videoTrack.dispose();
        }
        while (!this.preservedVideoTracks.isEmpty()) {
            removeTrack(this.preservedVideoTracks.get(0));
        }
        JniCommon.nativeReleaseRef(j);
    }

    public static String lambda$getId$11(long j) {
        return MediaStreamJni.get().getId(j);
    }

    public static Boolean lambda$removeMediaStreamTrack$12(long j, long j2) {
        boolean z;
        if (j2 == j) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean lambda$removeTrack$6(long j, long j2) {
        return Boolean.valueOf(MediaStreamJni.get().removeAudioTrack(j, j2));
    }

    public Boolean lambda$removeTrack$7(AudioTrack audioTrack, long j) {
        this.audioTracks.remove(audioTrack);
        return (Boolean) audioTrack.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<h40>) new h40((byte) 4, j), (h40) Boolean.FALSE);
    }

    public static Boolean lambda$removeTrack$8(long j, long j2) {
        return Boolean.valueOf(MediaStreamJni.get().removeVideoTrack(j, j2));
    }

    public Boolean lambda$removeTrack$9(VideoTrack videoTrack, long j) {
        this.videoTracks.remove(videoTrack);
        this.preservedVideoTracks.remove(videoTrack);
        return (Boolean) videoTrack.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<h40>) new h40((byte) 3, j), (h40) Boolean.FALSE);
    }

    public static Boolean m(long j, long j2) {
        return lambda$removeMediaStreamTrack$12(j, j2);
    }

    private static void removeMediaStreamTrack(List<? extends MediaStreamTrack> list, long j) {
        Iterator<? extends MediaStreamTrack> it = list.iterator();
        while (it.hasNext()) {
            MediaStreamTrack next = it.next();
            if (((Boolean) next.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<h40>) new h40((byte) 2, j), (h40) Boolean.FALSE)).booleanValue()) {
                next.dispose();
                it.remove();
                return;
            }
        }
        Logging.e("MediaStream", "Couldn't not find track");
    }

    public void addNativeAudioTrack(long j) {
        this.audioTracks.add(new AudioTrack(j));
    }

    public void addNativeVideoTrack(long j) {
        this.videoTracks.add(new VideoTrack(j));
    }

    public boolean addPreservedTrack(VideoTrack videoTrack) {
        return ((Boolean) this.lifecycleLock.call(new k07(this, videoTrack, (byte) 1))).booleanValue();
    }

    public boolean addTrack(AudioTrack audioTrack) {
        return ((Boolean) this.lifecycleLock.call(new m07(this, audioTrack, (byte) 0))).booleanValue();
    }

    public void dispose() {
        this.lifecycleLock.dispose(new bm6(this, (byte) 10));
    }

    public String getId() {
        return (String) this.lifecycleLock.call(new hz6((byte) 6));
    }

    public long getNativeMediaStream() {
        return this.lifecycleLock.getNativePointer();
    }

    public void removeAudioTrack(long j) {
        removeMediaStreamTrack(this.audioTracks, j);
    }

    public boolean removeTrack(AudioTrack audioTrack) {
        return ((Boolean) this.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<m07>) new m07(this, audioTrack, (byte) 1), (m07) Boolean.FALSE)).booleanValue();
    }

    public void removeVideoTrack(long j) {
        removeMediaStreamTrack(this.videoTracks, j);
    }

    public String toString() {
        return "[" + getId() + ":A=" + this.audioTracks.size() + ":V=" + this.videoTracks.size() + "]";
    }

    public boolean addTrack(VideoTrack videoTrack) {
        return ((Boolean) this.lifecycleLock.call(new k07(this, videoTrack, (byte) 2))).booleanValue();
    }

    public boolean removeTrack(VideoTrack videoTrack) {
        return ((Boolean) this.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<k07>) new k07(this, videoTrack, (byte) 0), (k07) Boolean.FALSE)).booleanValue();
    }
}
