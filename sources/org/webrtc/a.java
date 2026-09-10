package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f39474a;
    public final Object f39475b;

    public a(Object obj, int i10) {
        this.f39474a = i10;
        this.f39475b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f39474a) {
            case 0:
                ((Camera1Session) this.f39475b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f39475b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f39475b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f39474a;
        e0.a(this, videoSink);
    }
}
