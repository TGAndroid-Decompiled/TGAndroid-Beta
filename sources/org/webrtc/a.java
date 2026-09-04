package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f43587a;
    public final Object f43588b;

    public a(Object obj, int i10) {
        this.f43587a = i10;
        this.f43588b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f43587a) {
            case 0:
                ((Camera1Session) this.f43588b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f43588b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f43588b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f43587a;
        e0.a(this, videoSink);
    }
}
