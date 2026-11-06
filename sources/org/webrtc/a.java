package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f52943a;
    public final Object f52944b;

    public a(Object obj, int i7) {
        this.f52943a = i7;
        this.f52944b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f52943a) {
            case 0:
                ((Camera1Session) this.f52944b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f52944b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f52944b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f52943a;
        e0.a(this, videoSink);
    }
}
