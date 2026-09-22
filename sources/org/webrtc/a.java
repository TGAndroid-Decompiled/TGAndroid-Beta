package org.webrtc;

import org.webrtc.Camera2Session;
public final class a implements VideoSink {
    public final int f40664a;
    public final Object f40665b;

    public a(Object obj, int i10) {
        this.f40664a = i10;
        this.f40665b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f40664a) {
            case 0:
                ((Camera1Session) this.f40665b).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) this.f40665b, videoFrame);
                return;
            default:
                VideoSource.c((VideoSource) this.f40665b, videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f40664a;
        e0.a(this, videoSink);
    }
}
