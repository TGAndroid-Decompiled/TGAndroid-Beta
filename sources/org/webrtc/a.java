package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f40342a;
    public final Object f40343b;

    public a(Object obj, int i10) {
        this.f40342a = i10;
        this.f40343b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f40342a) {
            case 0:
                ((Camera1Session) this.f40343b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f40343b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f40343b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f40342a;
        e0.a(this, videoSink);
    }
}
