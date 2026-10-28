package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f46472a;
    public final Object f46473b;

    public a(Object obj, int i10) {
        this.f46472a = i10;
        this.f46473b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f46472a) {
            case 0:
                ((Camera1Session) this.f46473b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f46473b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f46473b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f46472a;
        e0.a(this, videoSink);
    }
}
