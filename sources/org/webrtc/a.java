package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f43871a;
    public final Object f43872b;

    public a(Object obj, int i10) {
        this.f43871a = i10;
        this.f43872b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f43871a) {
            case 0:
                ((Camera1Session) this.f43872b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f43872b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f43872b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f43871a;
        e0.a(this, videoSink);
    }
}
