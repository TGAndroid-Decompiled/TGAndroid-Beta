package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f44484a;
    public final Object f44485b;

    public a(Object obj, int i10) {
        this.f44484a = i10;
        this.f44485b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f44484a) {
            case 0:
                ((Camera1Session) this.f44485b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f44485b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f44485b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f44484a;
        e0.a(this, videoSink);
    }
}
