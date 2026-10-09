package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f45107a;
    public final Object f45108b;

    public a(Object obj, int i10) {
        this.f45107a = i10;
        this.f45108b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f45107a) {
            case 0:
                ((Camera1Session) this.f45108b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f45108b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f45108b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f45107a;
        e0.a(this, videoSink);
    }
}
