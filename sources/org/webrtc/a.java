package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f53034a;
    public final Object f53035b;

    public a(Object obj, int i7) {
        this.f53034a = i7;
        this.f53035b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f53034a) {
            case 0:
                ((Camera1Session) this.f53035b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f53035b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f53035b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f53034a;
        e0.a(this, videoSink);
    }
}
