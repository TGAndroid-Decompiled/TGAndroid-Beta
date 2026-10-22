package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f43876a;
    public final Object f43877b;

    public a(Object obj, int i10) {
        this.f43876a = i10;
        this.f43877b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f43876a) {
            case 0:
                ((Camera1Session) this.f43877b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f43877b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f43877b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f43876a;
        e0.a(this, videoSink);
    }
}
