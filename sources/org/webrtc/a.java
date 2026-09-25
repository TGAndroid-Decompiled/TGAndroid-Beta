package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f40616a;
    public final Object f40617b;

    public a(Object obj, int i10) {
        this.f40616a = i10;
        this.f40617b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f40616a) {
            case 0:
                ((Camera1Session) this.f40617b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f40617b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f40617b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f40616a;
        e0.a(this, videoSink);
    }
}
