package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f45365a;
    public final Object f45366b;

    public a(Object obj, int i10) {
        this.f45365a = i10;
        this.f45366b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f45365a) {
            case 0:
                ((Camera1Session) this.f45366b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f45366b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f45366b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f45365a;
        e0.a(this, videoSink);
    }
}
