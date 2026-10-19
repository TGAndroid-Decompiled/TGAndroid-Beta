package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f43863a;
    public final Object f43864b;

    public a(Object obj, int i10) {
        this.f43863a = i10;
        this.f43864b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f43863a) {
            case 0:
                ((Camera1Session) this.f43864b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f43864b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f43864b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f43863a;
        e0.a(this, videoSink);
    }
}
