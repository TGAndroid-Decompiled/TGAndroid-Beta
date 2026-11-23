package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f55068a;
    public final Object f55069b;

    public a(Object obj, int i7) {
        this.f55068a = i7;
        this.f55069b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f55068a) {
            case 0:
                ((Camera1Session) this.f55069b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f55069b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f55069b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f55068a;
        d0.a(this, videoSink);
    }
}
