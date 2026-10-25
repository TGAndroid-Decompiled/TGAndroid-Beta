package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f46434a;
    public final Object f46435b;

    public a(Object obj, int i10) {
        this.f46434a = i10;
        this.f46435b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f46434a) {
            case 0:
                ((Camera1Session) this.f46435b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f46435b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f46435b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f46434a;
        e0.a(this, videoSink);
    }
}
