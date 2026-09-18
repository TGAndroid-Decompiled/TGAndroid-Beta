package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f40602a;
    public final Object f40603b;

    public a(Object obj, int i10) {
        this.f40602a = i10;
        this.f40603b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f40602a) {
            case 0:
                ((Camera1Session) this.f40603b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f40603b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f40603b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f40602a;
        e0.a(this, videoSink);
    }
}
