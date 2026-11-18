package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f55023a;
    public final Object f55024b;

    public a(Object obj, int i7) {
        this.f55023a = i7;
        this.f55024b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f55023a) {
            case 0:
                ((Camera1Session) this.f55024b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f55024b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f55024b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f55023a;
        d0.a(this, videoSink);
    }
}
