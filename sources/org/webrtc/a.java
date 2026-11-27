package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final byte a;
    public final Object b;

    public a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Camera1Session) obj).lambda$listenForTextureFrames$0(videoFrame);
                return;
            default:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) obj, videoFrame);
                return;
        }
    }
}
