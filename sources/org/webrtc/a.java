package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f40714a;
    public final Object f40715b;

    public a(Object obj, int i10) {
        this.f40714a = i10;
        this.f40715b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f40714a) {
            case 0:
                ((Camera1Session) this.f40715b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f40715b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f40715b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f40714a;
        e0.a(this, videoSink);
    }
}
