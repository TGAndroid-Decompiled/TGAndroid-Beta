package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f43614a;
    public final Object f43615b;

    public a(Object obj, int i10) {
        this.f43614a = i10;
        this.f43615b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f43614a) {
            case 0:
                ((Camera1Session) this.f43615b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f43615b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f43615b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f43614a;
        e0.a(this, videoSink);
    }
}
