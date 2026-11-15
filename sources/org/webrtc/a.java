package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f54454a;
    public final Object f54455b;

    public a(Object obj, int i7) {
        this.f54454a = i7;
        this.f54455b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f54454a) {
            case 0:
                ((Camera1Session) this.f54455b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f54455b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f54455b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f54454a;
        d0.a(this, videoSink);
    }
}
