package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f44067a;
    public final Object f44068b;

    public a(Object obj, int i10) {
        this.f44067a = i10;
        this.f44068b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f44067a) {
            case 0:
                ((Camera1Session) this.f44068b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f44068b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f44068b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f44067a;
        e0.a(this, videoSink);
    }
}
