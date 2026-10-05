package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f43943a;
    public final Object f43944b;

    public a(Object obj, int i10) {
        this.f43943a = i10;
        this.f43944b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f43943a) {
            case 0:
                ((Camera1Session) this.f43944b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f43944b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f43944b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f43943a;
        e0.a(this, videoSink);
    }
}
