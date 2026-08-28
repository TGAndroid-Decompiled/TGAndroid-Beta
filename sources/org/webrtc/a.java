package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f45285a;
    public final Object f45286b;

    public a(Object obj, int i9) {
        this.f45285a = i9;
        this.f45286b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f45285a) {
            case 0:
                ((Camera1Session) this.f45286b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f45286b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f45286b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i9 = this.f45285a;
        e0.a(this, videoSink);
    }
}
