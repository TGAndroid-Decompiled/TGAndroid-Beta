package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f45109a;
    public final Object f45110b;

    public a(Object obj, int i10) {
        this.f45109a = i10;
        this.f45110b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f45109a) {
            case 0:
                ((Camera1Session) this.f45110b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f45110b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f45110b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f45109a;
        e0.a(this, videoSink);
    }
}
