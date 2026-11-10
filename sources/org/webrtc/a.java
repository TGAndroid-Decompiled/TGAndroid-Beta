package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f53048a;
    public final Object f53049b;

    public a(Object obj, int i7) {
        this.f53048a = i7;
        this.f53049b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f53048a) {
            case 0:
                ((Camera1Session) this.f53049b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f53049b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f53049b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f53048a;
        d0.a(this, videoSink);
    }
}
