package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f44495a;
    public final Object f44496b;

    public a(Object obj, int i10) {
        this.f44495a = i10;
        this.f44496b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f44495a) {
            case 0:
                ((Camera1Session) this.f44496b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f44496b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f44496b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f44495a;
        e0.a(this, videoSink);
    }
}
