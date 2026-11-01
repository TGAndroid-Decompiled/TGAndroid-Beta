package th;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class q0 extends VoIPService.ProxyVideoSink {
    public final s0 f49392a;

    public q0(s0 s0Var) {
        this.f49392a = s0Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f49392a.f49439s) {
            org.telegram.messenger.i0.g3(new sg.v(this, 3));
        }
    }
}
