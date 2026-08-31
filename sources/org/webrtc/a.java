package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f44036a;
    public final Object f44037b;

    public a(Object obj, int i10) {
        this.f44036a = i10;
        this.f44037b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f44036a) {
            case 0:
                ((Camera1Session) this.f44037b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f44037b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f44037b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f44036a;
        e0.a(this, videoSink);
    }
}
