package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f44989a;
    public final Object f44990b;

    public a(Object obj, int i10) {
        this.f44989a = i10;
        this.f44990b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f44989a) {
            case 0:
                ((Camera1Session) this.f44990b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f44990b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f44990b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f44989a;
        e0.a(this, videoSink);
    }
}
