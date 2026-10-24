package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f44291a;
    public final Object f44292b;

    public a(Object obj, int i10) {
        this.f44291a = i10;
        this.f44292b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f44291a) {
            case 0:
                ((Camera1Session) this.f44292b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f44292b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f44292b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f44291a;
        e0.a(this, videoSink);
    }
}
