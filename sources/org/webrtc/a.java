package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f55149a;
    public final Object f55150b;

    public a(Object obj, int i7) {
        this.f55149a = i7;
        this.f55150b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f55149a) {
            case 0:
                ((Camera1Session) this.f55150b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f55150b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f55150b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f55149a;
        d0.a(this, videoSink);
    }
}
