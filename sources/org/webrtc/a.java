package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f55033a;
    public final Object f55034b;

    public a(Object obj, int i7) {
        this.f55033a = i7;
        this.f55034b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f55033a) {
            case 0:
                ((Camera1Session) this.f55034b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f55034b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f55034b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f55033a;
        d0.a(this, videoSink);
    }
}
