package org.webrtc;

public final class a implements VideoSink {

    public final int f45291a;

    public final Object f45292b;

    public a(Object obj, int i10) {
        this.f45291a = i10;
        this.f45292b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f45291a) {
            case 0:
                ((Camera1Session) this.f45292b).lambda$listenForTextureFrames$0(videoFrame);
                break;
            case 1:
                ((Camera2Session.CaptureSessionCallback) this.f45292b).lambda$onConfigured$0(videoFrame);
                break;
            default:
                ((VideoSource) this.f45292b).lambda$setVideoProcessor$1(videoFrame);
                break;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i10 = this.f45291a;
        e0.a(this, videoSink);
    }
}
