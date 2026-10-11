package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f45177a;
    public final Object f45178b;

    public a(Object obj, int i10) {
        this.f45177a = i10;
        this.f45178b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f45177a) {
            case 0:
                ((Camera1Session) this.f45178b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f45178b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f45178b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f45177a;
        e0.a(this, videoSink);
    }
}
