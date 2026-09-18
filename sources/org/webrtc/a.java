package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f40373a;
    public final Object f40374b;

    public a(Object obj, int i10) {
        this.f40373a = i10;
        this.f40374b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f40373a) {
            case 0:
                ((Camera1Session) this.f40374b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f40374b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f40374b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f40373a;
        e0.a(this, videoSink);
    }
}
