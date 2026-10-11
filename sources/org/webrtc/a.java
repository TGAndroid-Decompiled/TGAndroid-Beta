package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f45143a;
    public final Object f45144b;

    public a(Object obj, int i10) {
        this.f45143a = i10;
        this.f45144b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f45143a) {
            case 0:
                ((Camera1Session) this.f45144b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f45144b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f45144b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f45143a;
        e0.a(this, videoSink);
    }
}
