package org.webrtc;

public final class VideoSource$$ExternalSyntheticLambda1 implements VideoSink {
    public final int $r8$classId;
    public final Object f$0;

    public VideoSource$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.$r8$classId) {
            case 0:
                ((VideoSource) this.f$0).lambda$setVideoProcessor$1(videoFrame);
                break;
            case 1:
                ((Camera1Session) this.f$0).lambda$listenForTextureFrames$0(videoFrame);
                break;
            default:
                ((Camera2Session.CaptureSessionCallback) this.f$0).lambda$onConfigured$0(videoFrame);
                break;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        int i = this.$r8$classId;
        VideoSink.CC.$default$setParentSink(this, videoSink);
    }
}
