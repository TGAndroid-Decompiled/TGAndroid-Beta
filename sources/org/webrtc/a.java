package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f53008a;
    public final Object f53009b;

    public a(Object obj, int i3) {
        this.f53008a = i3;
        this.f53009b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f53008a) {
            case 0:
                ((Camera1Session) this.f53009b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f53009b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f53009b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i3 = this.f53008a;
        e0.a(this, videoSink);
    }
}
