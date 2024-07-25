package org.webrtc;
public interface RefCounted {
    @CalledByNative
    void release();

    @CalledByNative
    void retain();
}
