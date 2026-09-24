package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f40601a;
    public final Object f40602b;

    public a(Object obj, int i10) {
        this.f40601a = i10;
        this.f40602b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f40601a) {
            case 0:
                ((Camera1Session) this.f40602b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f40602b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f40602b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f40601a;
        e0.a(this, videoSink);
    }
}
