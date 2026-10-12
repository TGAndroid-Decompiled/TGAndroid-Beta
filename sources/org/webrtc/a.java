package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f42781a;
    public final Object f42782b;

    public a(Object obj, int i10) {
        this.f42781a = i10;
        this.f42782b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f42781a) {
            case 0:
                ((Camera1Session) this.f42782b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f42782b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f42782b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f42781a;
        f0.a(this, videoSink);
    }
}
