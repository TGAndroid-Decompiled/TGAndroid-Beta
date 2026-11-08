package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f53035a;
    public final Object f53036b;

    public a(Object obj, int i7) {
        this.f53035a = i7;
        this.f53036b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f53035a) {
            case 0:
                ((Camera1Session) this.f53036b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f53036b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f53036b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i7 = this.f53035a;
        e0.a(this, videoSink);
    }
}
