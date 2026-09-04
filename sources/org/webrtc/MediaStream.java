package org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class MediaStream {
    private static final String TAG = "MediaStream";
    private long nativeStream;
    public final List<AudioTrack> audioTracks = new ArrayList();
    public final List<VideoTrack> videoTracks = new ArrayList();
    public final List<VideoTrack> preservedVideoTracks = new ArrayList();

    public MediaStream(long j3) {
        this.nativeStream = j3;
    }

    private void checkMediaStreamExists() {
        if (this.nativeStream != 0) {
            return;
        }
        throw new IllegalStateException("MediaStream has been disposed.");
    }

    private static native boolean nativeAddAudioTrackToNativeStream(long j3, long j10);

    private static native boolean nativeAddVideoTrackToNativeStream(long j3, long j10);

    private static native String nativeGetId(long j3);

    private static native boolean nativeRemoveAudioTrack(long j3, long j10);

    private static native boolean nativeRemoveVideoTrack(long j3, long j10);

    private static void removeMediaStreamTrack(List<? extends MediaStreamTrack> list, long j3) {
        Iterator<? extends MediaStreamTrack> it = list.iterator();
        while (it.hasNext()) {
            MediaStreamTrack next = it.next();
            if (next.getNativeMediaStreamTrack() == j3) {
                next.dispose();
                it.remove();
                return;
            }
        }
        Logging.e("MediaStream", "Couldn't not find track");
    }

    public void addNativeAudioTrack(long j3) {
        this.audioTracks.add(new AudioTrack(j3));
    }

    public void addNativeVideoTrack(long j3) {
        this.videoTracks.add(new VideoTrack(j3));
    }

    public boolean addPreservedTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeVideoTrack())) {
            this.preservedVideoTracks.add(videoTrack);
            return true;
        }
        return false;
    }

    public boolean addTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        if (nativeAddAudioTrackToNativeStream(this.nativeStream, audioTrack.getNativeAudioTrack())) {
            this.audioTracks.add(audioTrack);
            return true;
        }
        return false;
    }

    public void dispose() {
        checkMediaStreamExists();
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
        JniCommon.nativeReleaseRef(this.nativeStream);
        this.nativeStream = 0L;
    }

    public String getId() {
        checkMediaStreamExists();
        return nativeGetId(this.nativeStream);
    }

    public long getNativeMediaStream() {
        checkMediaStreamExists();
        return this.nativeStream;
    }

    public void removeAudioTrack(long j3) {
        removeMediaStreamTrack(this.audioTracks, j3);
    }

    public boolean removeTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        this.audioTracks.remove(audioTrack);
        return nativeRemoveAudioTrack(this.nativeStream, audioTrack.getNativeAudioTrack());
    }

    public void removeVideoTrack(long j3) {
        removeMediaStreamTrack(this.videoTracks, j3);
    }

    public String toString() {
        return "[" + getId() + ":A=" + this.audioTracks.size() + ":V=" + this.videoTracks.size() + "]";
    }

    public boolean addTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeVideoTrack())) {
            this.videoTracks.add(videoTrack);
            return true;
        }
        return false;
    }

    public boolean removeTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        this.videoTracks.remove(videoTrack);
        this.preservedVideoTracks.remove(videoTrack);
        return nativeRemoveVideoTrack(this.nativeStream, videoTrack.getNativeVideoTrack());
    }
}
