package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f43588a;
    public final Object f43589b;

    public a(Object obj, int i10) {
        this.f43588a = i10;
        this.f43589b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f43588a) {
            case 0:
                ((Camera1Session) this.f43589b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f43589b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f43589b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f43588a;
        e0.a(this, videoSink);
    }
}
